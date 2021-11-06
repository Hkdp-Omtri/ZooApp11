package edu.nwmissouri.zoo11group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of PolarBear
 *
 * @author Maddelavedu Pravalika(s545254)
 */
public class PolarBearGroup {

    private static ArrayList<PolarBear> myGroup;

    /**
     * Create a static group of PolarBear
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        PolarBear a = new PolarBear("Iceburg");
        myGroup.add(a);
        myGroup.add(new PolarBear("Snowy"));
        myGroup.add(new PolarBear("Snowbell"));

        return myGroup.size();
    }

    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the PolarBear!");
        myGroup.forEach(PolarBear -> {
            PolarBear.speak();
            PolarBear.move();
        });
        System.out.println("Nice PolarBear - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

}
