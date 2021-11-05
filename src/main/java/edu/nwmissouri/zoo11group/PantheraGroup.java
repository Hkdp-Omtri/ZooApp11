package edu.nwmissouri.zoo11group;

import java.util.ArrayList;

/**
 *This is PantheraGroup group class
 * @author Pinninti Harshika
 */
public class PantheraGroup {
     private static ArrayList<Panthera> myGroup;

    /**
     * Create a static group of Panthera
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Panthera("Harshi"));
        myGroup.add(new Panthera("Saari"));
        myGroup.add(new Panthera("Rachu"));
        

        return myGroup.size();
    }

    public static void run() {
        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        System.out.println("Hey - look at the Panthera!");
        for (Panthera panthera : myGroup) {
            panthera.speak();
            panthera.move();
        }

        System.out.println("Nice Panthera - that was fun!");
        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }
}
    

