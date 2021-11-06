package edu.nwmissouri.zoo11group;

/**
 *
 * @author Alekhya Gandra
 */
public class AnimalRides {

    int animalName;
    int noOfMembers;

    @Override
    public String toString() {
        return "AnimalRides{" + "animalName=" + animalName + ", noOfMembers=" + noOfMembers + ", speed=" + speed + '}';
    }

    /**
     *
     * @return animalName
     */
    public int getAnimalName() {
        return animalName;
    }

    /**
     *
     * @param animalName sets the animalName value
     */
    public void setAnimalName(int animalName) {
        this.animalName = animalName;
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
     * @param noOfMembers sets the noOfMembers value
     */

    public void setNoOfMembers(int noOfMembers) {
        this.noOfMembers = noOfMembers;
    }

    /**
     *
     * @return speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     *
     * @param speed sets the speed value
     */

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    double speed;

    /**
     * method noofseats
     */
    public void noofseats() {

    }

    /**
     * method ticketPrice gives the ticketprice
     */
    public void ticketPrice() {
        System.out.println("The ticketPrice is :" + 50.00);
    }

    /**
     * method timeCalculation gives the time in hours
     */
    public void timeCalculation() {
        System.out.println("The amount of time spent is :" + "2 Hours ");
    }

    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("Hey - look at the Elephant!");
    }

}
