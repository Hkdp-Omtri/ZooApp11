/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

import java.util.Scanner;

/**
 *This is CycleRides rides 
 * @author Pinninti Harshika
 */
public class CycleRides {
    private int distance;
    private int speed;

    @Override
    public String toString() {
        return "CycleRides{" + "distance=" + distance + ", speed=" + speed + ", count=" + count + ", Time=" + Time + '}';
    }
/**
 * 
 * @return distance value
 */
    public int getDistance() {
        return distance;
    }
/**
 * 
 * @param distance sets the distance value
 */
    public void setDistance(int distance) {
        this.distance = distance;
    }
/**
 * 
 * @return getSpeed value
 */
    public int getSpeed() {
        return speed;
    }
/**
 * 
 * @param speed sets the speed value
 */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
/**
 * 
 * @return count value 
 */
    public int getCount() {
        return count;
    }

    /**
     * 
     * @param count sets the count value
     */
    public void setCount(int count) {
        this.count = count;
    }
    /**
     * 
     * @return time
     */

    public int getTime() {
        return Time;
    }
/**
 * 
 * @param Time sets the time value
 */
    public void setTime(int Time) {
        this.Time = Time;
    }
    private int count;
    private int Time;
    /**
     * ticketprice method
    */
    public void ticketprice() {
    }
    /**
     * noofseats method
     */
    public void noofseats() {
        
    }
    /**
     * distance method which gives distance
     * @param x
     * @return distance
     */
    public int distance(int x) {
        int speed = 50;
        int time = 5;
        distance = speed /time;
        System.out.println("The distance travelled by the Cycle ride is");
       return distance;  
    }
    /**
     * result method which displays the result
     */
    public void result() {
    System.out.println("The result of the cycle rides is :" );
    System.out.println("Harshika won the first price");   
    }    
    /**
     * run method which displays the statement
     */
    public static void run() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");                      
        System.out.println("This is a Cycle Ride"); }
    }   
    
