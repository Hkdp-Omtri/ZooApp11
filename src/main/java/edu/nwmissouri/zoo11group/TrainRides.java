/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author S545407
 */
public class TrainRides extends ZooRides{
   private String reservedNo; 
   private double speed;
   private double time;

    @Override
    public String toString() {
        return "TrainRides{" + "reservedNo=" + reservedNo + ", speed=" + speed + ", time=" + time + ", distance=" + distance + '}';
    }

    public String getReservedNo() {
        return reservedNo;
    }

    public void setReservedNo(String reservedNo) {
        this.reservedNo = reservedNo;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
   private double distance;
   
    /**
     *
     */
    @Override
    public void ticketprice(){
        
}

    /**
     *
     */
    @Override
    public void noofseats(){
    }
    public static void trainRides(){
    
    }
    public static String seatNumber(){
        System.out.println("The alloted seta number for your ride");
       return null;
   }
    public static double speedCalculation(){
        System.out.println("Calculating the speed of the train");
       return 0;
   }
  public static void run() {
       System.out.println("======= THIS IS TRAIN RIDES ==========");
       System.out.println("I Am Here To Present About Available Train Rides "); }
   
}
