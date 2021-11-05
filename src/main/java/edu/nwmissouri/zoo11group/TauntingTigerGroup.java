package edu.nwmissouri.zoo11group;

import java.util.ArrayList;

/**
 *
 * @author Sarath Arrepu (S545027)
 */
public class TauntingTigerGroup {
    private static ArrayList<TauntingTiger> myGroup;

    /**
     * Create a static group of TauntingTigerGroup
     *
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        myGroup.add(new TauntingTiger("Ben"));
        myGroup.add(new TauntingTiger("Fred"));
        myGroup.add(new TauntingTiger("Albert"));

        return myGroup.size();
    }

    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Taunting Tiger!");
        for (TauntingTiger TauntingTiger : myGroup) {
            TauntingTiger.speak();
            TauntingTiger.move();
        }

        System.out.println("Nice Taunting Tiger - that was fun!");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    
}
