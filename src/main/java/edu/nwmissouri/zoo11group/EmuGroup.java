package edu.nwmissouri.zoo11group;


import java.util.ArrayList;

/**
 * This class defines EmuGroup
 * @author Venkata Prabhakar Takkellapati (S545407)
 */
public class EmuGroup {
        private static ArrayList<Emu> myGroup;
/**
 * 
 * @return group size
 */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Emu a = new Emu("Abbie");
        myGroup.add(a);
        myGroup.add(new Emu("Boss"));
        myGroup.add(new Emu("Cass"));

        return myGroup.size();
    }
    /**
     * It does not return any value
     */
public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Emu!");
        myGroup.forEach(emu -> {
            emu.speak();
            emu.move();
        });
        System.out.println("Nice Emu - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
