
package edu.nwmissouri.zoo11group;

/**
 *This is RopeRidesAdventure class 
 * @author Alekhya Gandra
 */
public class RopeRidesAdventure extends ZooAdventure {
    
    int noOfMembers;

    @Override
    public String toString() {
        return "RopeRidesAdventure{" + "noOfMembers=" + noOfMembers + ", speed=" + speed + '}';
    }
/**
 * 
 * @return noOfMembers
 */
    public int getNoOfMembers() {
        return noOfMembers;
    }
/**
 * 
 * @param noOfMembers sets noOfMembers value
 */
    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }
/**
 * 
 * @return speed value
 */
    public double getSpeed() {
        return speed;
    }
/**
 * 
 * @param speed sets speed value
 */
    public void setSpeed(double speed) {
        this.speed = speed;
    }
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
