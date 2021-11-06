
package edu.nwmissouri.zoo11group;

/**
 *
 * @author Alekhya Gandra
 */
public class RopeRidesAdventure extends ZooAdventure {
    
    int noOfMembers;
    double speed;
    
   
    
    public int  height()
    {
        int height = 10 ;
        return height;
    }
    public void isWinner()
    {
        System.out.println("The performer is winner ");
    }
    @Override
    public void ageLimit()
    {
        System.out.println("The age limit is 22 years ");
    }
    @Override
    public void idProof()
    {
        System.out.println("ID proof is verified");
    }
    @Override
    public void safetyMeasures()
    {
        System.out.println("SafetyMeasures are taken");
    }
    public static void run() {
        System.out.println("*************************************");                      
        System.out.println("This is the Rope Rides Adventure want to experience it!"); }
}
