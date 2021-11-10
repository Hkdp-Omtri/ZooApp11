/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *This is CarRides class
 * @author Homakesavadurgaprasad Omtri (S544929)
 */
public class CarRides {

    @Override
    public String toString() {
        return "CarRides{" + "price=" + price + ", time=" + time + ", distance=" + distance + ", age=" + age + '}';
    }
/**
 * 
 * @return price value of advanture
 */
    public double getPrice() {
        return price;
    }
/**
 * 
 * @param price sets the price value
 */
    public void setPrice(double price) {
        this.price = price;
    }
/**
 * 
 * @return time value of time
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
 * @return distance value of distance 
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
/**
 * 
 * @return age value of customer
 */
    public int getAge() {
        return age;
    }
/**
 * 
 * @param age sets the age value
 */
    public void setAge(int age) {
        this.age = age;
    }

    private double price;
    private double time;
    private double distance;
    private int age;

    /*
    This is CarRides method displays age limit
     */
    public void carRides() {
        System.out.println("The age must me above 18 years");
    }

    /*
    This is coach method to chose the slot number
     */
    public void coach() {
        System.out.println("Choose which time of slot number needed ");
    }

    /*
    This is calculation method to accept death waiver
     */
    public void calculation() {
        System.out.println("For BungeJump you have to sign death wavier");
    }

    /*
    This is t meicketprice display null
     */
    public void ticketprice() {

    }

    /*
    This is noofseats display null
     */

    public void noofseats() {

    }

    /*
    This is run method displays 
     */
    public static void run() {
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("Hey look buddies it is a Car Ride");
    }

}
