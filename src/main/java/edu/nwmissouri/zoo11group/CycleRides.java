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
public class CycleRides extends ZooRides{
    private int distance;
    private int speed;
    private int count;
    private int Time;
    @Override
    public void ticketprice() {
    }
    @Override
    public void noofseats() {
        
    }
    public int distance(int x) {
        int speed = 50;
        int time = 5;
        distance = speed /time;
        System.out.println("The distance travelled by the Cycle ride is");
       return distance;  
    }
    public void result() {
    System.out.println("The result of the cycle rides is :" );
    System.out.println("Harshika won the first price");   
    }    
    }   
    