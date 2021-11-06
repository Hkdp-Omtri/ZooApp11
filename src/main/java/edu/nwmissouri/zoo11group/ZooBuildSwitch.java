package edu.nwmissouri.zoo11group;

import static edu.nwmissouri.zoo11group.ZooCheckFiles.getFileLines;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;


/**
 * Build our switch statement so we can see all the animals.
 *
 * @author Denise Case
 */
public class ZooBuildSwitch {

    private static final String relativePathToPackage = "/src/main/java/edu/nwmissouri/zoo04lab";
    private static final String nonAnimalsFileString = "SOURCE_NON_ANIMAL_FILES.txt";

    public static Map<Integer, String> getAllAnimalMap() {

        // find the files that should be excluded
        ArrayList<String> ignoreList = getNonCustomAnimalFiles();

        // process all found files, outputing custom animal code
        File fileFolder = new File(getCustomAnimalPackagePathString());
        String[] filesArray = fileFolder.list();
        Arrays.sort(filesArray);

        // create local variables for n and animalMap (a data structure)
        int n = 1;
        // keep keys in order with TreeMap and be thread safe for deployment
        Map animalMap = Collections.synchronizedMap(new TreeMap<Integer, String>());
        
        // process the list and load the map
        for (String file : filesArray) {
            if (!ignoreList.contains(file)) {
                int fileLength = file.length();
                int lengthExtension = ".java".length();
                int fileNameLength = fileLength - lengthExtension;
                var justName = file.substring(0, fileNameLength);
                if (justName.endsWith("Group")) {
                    var animal = justName.replace("Group", "");
                   animalMap.put(n++, animal);
                }
            }
        }
        return animalMap;
    }

    public static void main(String args[]) throws IOException {

        // find the files that should be excluded
        ArrayList<String> ignoreList = getNonCustomAnimalFiles();
        System.out.println("Ignore these:");
        ignoreList.forEach(f -> System.out.println(f));

        // process all found files, outputing custom animal code
        System.out.println("From all these in the package:");
        File fileFolder = new File(getCustomAnimalPackagePathString());
        String filesArray[] = fileFolder.list();
        for (String s : filesArray) {
            System.out.println(s);
        }

        System.out.println("===============================");
        System.out.println("Generate Custom Animal Switch");
        System.out.println("===============================");
        int n = 1;
        for (String file : filesArray) {
            if (!ignoreList.contains(file)) {
                int fileLength = file.length();
                int lengthExtension = ".java".length();
                int fileNameLength = fileLength - lengthExtension;
                var justName = file.substring(0, fileNameLength);
                if (justName.endsWith("Group")) {

                    // output this:
                    //case 1 -> {             
                    //    AardvarkGroup.create();
                    //    AardvarkGroup.run();
                    //}
                    System.out.println("case " + n++ + " -> {");
                    System.out.println(justName + ".create();");
                    System.out.println(justName + ".run();");
                    System.out.println("}");
                }
            }
        }

        System.out.println("===============================");
        System.out.println("Generate Custom Animal Menu");
        System.out.println("===============================");
        n = 1;
        for (String file : filesArray) {
            if (!ignoreList.contains(file)) {
                int fileLength = file.length();
                int lengthExtension = ".java".length();
                int fileNameLength = fileLength - lengthExtension;
                var justName = file.substring(0, fileNameLength);
                if (justName.endsWith("Group")) {
                    // output something like this - but in columns
                    //System.out.print("1. Aardvarks");
                    //System.out.println("2. Asps");
                    //System.out.println("3. Bearcats");
                    // write code below.....
                    //System.out.println("case " + n++ + " -> {");
                    var animal = justName.replace("Group", "");
                    var numberAndAnimal = String.format("%2d.%-20s", n, animal);
                    var quote = "\"";
                    var sOpen = "System.out.print(";
                    var sOpenLN = "System.out.println(";
                    var sClose = ");";
                    var strOut = sOpen + quote + numberAndAnimal + quote + sClose;
                    var strOutLN = sOpenLN + quote + numberAndAnimal + quote + sClose;
                    var statement = (n % 4 == 0) ? strOutLN : strOut;
                    System.out.println(statement);
                    n++;
                }
            }
        }
        System.out.println("===============================");
        System.out.println("Update NUMBER_ANIMAL_TYPES = " + --n);
        System.out.println("===============================");

    }

    /**
     * Get a list of expected files in the root project directory.
     *
     * @return String[] of expected file names
     */
    private static ArrayList<String> getNonCustomAnimalFiles() {
        return getFileLines(nonAnimalsFileString);
    }

    /**
     * Get our project package path as a String.
     *
     * @return project package String
     */
    private static String getCustomAnimalPackagePathString() {
        Path projectPath = Paths.get("").toAbsolutePath();
        String projectPathString = projectPath.normalize().toString() + relativePathToPackage;
        System.out.println(projectPathString);
        return projectPathString;
    }

    

}
