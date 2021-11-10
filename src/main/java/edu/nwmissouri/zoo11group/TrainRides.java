/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 * This is TrainRides class which defines the rides available in rides
 *
 * @author S545407
 */
public class TrainRides extends ZooRides {

    private String reservedNo = "";
    private double speed = 0.0;
    private double time = 0.0;

    /**
     *
     * @return string of all the declared variables
     */
    @Override
    public String toString() {
        return "TrainRides{" + "reservedNo=" + reservedNo + ", speed=" + speed + ", time=" + time + ", distance=" + distance + '}';
    }

    /**
     *
     * @return reservedNo it will gives you the reserved number
     */
    public String getReservedNo() {
        return reservedNo;
    }

    /**
     *
     * @param reservedNo seats reservedNo will be
     */
    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
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

    /**
     *
     * @return time value
     */
    public double getTime() {
        return time;
    }

    /**
     *
     * @param time sets the time value
     */
    public void setTime(double time) {
        this.time = time;
    }

    /**
     *
     * @return distance value
     */
    public double getDistance() {
        return distance;
    }

    /**
     *
     * @param distance sets the distance value
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }
    private double distance;

    /**
     *
     */
    @Override
    public void ticketprice() {

    }

    /**
     * it will defines the no of seats
     */
    @Override
    public void noofseats() {
        System.out.println("No.Of Seats Alloted ");
    }

    /**
     * it will define the train rides
     */
    public static void trainRides() {

    }

    /**
     *
     * @return String value of seat number
     */
    public static String seatNumber() {
        System.out.println("The alloted seat number for your ride");
        return "FAXeZBc";
    }

    /**
     *
     * @return double value of the speed
     */
    public static double speedCalculation() {
        System.out.println("Calculating the speed of the train");
        return 0.0;
    }

    /**
     * it will execute the run method
     */
    public static void run() {
        System.out.println("======= THIS IS TRAIN RIDES ==========");
        System.out.println("I Am Here To Present About Available Train Rides ");
    }

}
