/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

import java.util.Scanner;

/**
 *
 * @author Pinninti Harshika
 */
public class CycleRides {
    private int distance;
    private int speed;

    @Override
    public String toString() {
        return "CycleRides{" + "distance=" + distance + ", speed=" + speed + ", count=" + count + ", Time=" + Time + '}';
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTime() {
        return Time;
    }

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
    
