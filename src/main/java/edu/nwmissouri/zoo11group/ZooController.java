package edu.nwmissouri.zoo11group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controller that handles the default request ("/").
 *
 * Use the new Java 15 text blocks to provide our menu. Thymeleaf:
 * https://spring.io/guides/gs/serving-web-content/
 *
 * @author Denise Case
 */
@Controller
public class ZooController {

    private static final String GREETING_MESSAGE = "Welcome to our 542 Zoo!";
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";
    private static final int NUMBER_ANIMAL_TYPES = 60;

    /**
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     *
     * @param idParam - the id provided in the URL
     * @param model - the model that holds information from controller to view
     * @return
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("name", "World");
        model.addAttribute("greeting", GREETING_MESSAGE);
        model.addAttribute("animalMap", ZooBuildSwitch.getAllAnimalMap());
        model.addAttribute("customAnimalGroup", getCustomAnimalGroup(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "index";
    }

    /**
     * Map GET request to "/about" to about() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }

    /**
     * Map GET request to "/games" to games() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/games")
    public String games() {
        return "games";
    }

    /**
     * Map GET request to "/persons" to persons() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/persons")
    public String persons() {
        return "persons";
    }
    
    
    

    /**
     * Map GET request to "/rides" to rides() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/rides")
    public String rides() {
        return "rides";
    }

    /**
     * Map GET request to "/vehicles" to vehicles() method.
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/vehicles")
    public String vehicles() {
        return "vehicles";
    }

    private String getCustomAnimalGroup(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);

        var intID = Integer.parseInt(id);

        switch (intID) {

           
            case 21 -> {
                ElephantGroup.create();
                ElephantGroup.run();
            }
            case 22 -> {
                EmuGroup.create();
                EmuGroup.run();
            }
            
            
            
            case 43 -> {
                PantheraGroup.create();
                PantheraGroup.run();
            }
            case 44 -> {
                PolarBearGroup.create();
                PolarBearGroup.run();
            }
            case 45 -> {
                ProngHornGroup.create();
                ProngHornGroup.run();
            }
            
                
            case 56 -> {
                TauntingTigerGroup.create();
                TauntingTigerGroup.run();
            }
           
            default -> {
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }
}
