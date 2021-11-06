
package edu.nwmissouri.zoo11group;

/**
 *
 * @author Alekhya Gandra
 */
public class RopeRidesAdventure extends ZooAdventure {
    
    int noOfMembers;
    double speed;
    
   
    /**
     * height method gives the height
     * @return  height
     */
    public int  height()
    {
        int height = 10 ;
        return height;
    }
    /**
     * isWinner method 
     */
    public void isWinner()
    {
        System.out.println("The performer is winner ");
    }
    /**
     * ageLimit method 
     */
    @Override
    public void ageLimit()
    {
        System.out.println("The age limit is 22 years ");
    }
    /**
     * idProof method
     */
    @Override
    public void idProof()
    {
        System.out.println("ID proof is verified");
    }
    /**
     * safetyMeasures method
     */
    @Override
    public void safetyMeasures()
    {
        System.out.println("SafetyMeasures are taken");
    }
    /**
     * run method to display the statement
     */
    public static void run() {
        System.out.println("*************************************");                      
        System.out.println("This is the Rope Rides Adventure want to experience it!"); }
}
