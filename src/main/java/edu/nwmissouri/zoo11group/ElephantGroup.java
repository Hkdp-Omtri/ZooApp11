package edu.nwmissouri.zoo11group;

import java.util.ArrayList;

/**
 *
 * @author Homakesavadurgaprasad OMTRI (S544929)
 */
public class ElephantGroup {
    
    private static ArrayList<Elephant> myGroup;

    /**
     * Create a static group of Bearcat
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new Elephant("Homesh"));                               
        myGroup.add(new Elephant("Homi"));                                                       
        myGroup.add(new Elephant("Omtri"));                                                               

        return myGroup.size();
    }

    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");                      
        System.out.println("Hey - look at the Elephant!");                         
        for (Elephant elephant : myGroup) {                                   
            elephant.speak();
            elephant.move();                                  
        }

        System.out.println("Nice Elephant - that was really fun!");              
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");                               
    }
}
