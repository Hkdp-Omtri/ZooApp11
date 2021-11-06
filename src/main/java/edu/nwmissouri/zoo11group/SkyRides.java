/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

import java.util.ArrayList;

/**
 *
 * @author S545254
 */
public class SkyRides extends ZooRides {
    
    private double Price;
    private double Miles;
    private static ArrayList<SkyRides> myGroup;
     /**
     *
     */
    @Override
    public void ticketprice(){
        
}

    /**
     *
     */
   
    
   public static void run() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");                      
        System.out.println("Hey look do you wanna join sky rides");                         
//        for (SkyRides skyrides : myGroup) {                                   
//            skyrides.noofseats();
//            skyrides.skyrides();                                  
//        }

        System.out.println("The sky rides have many games look at it");              
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");                               
    }
    @Override
    public void noofseats(){
        
    }
    public void skyrides(){
        System.out.println("skyride");
    }
    public double compartment(){
        System.out.println("compartment number alloted");
        
        return 0.0;
    
    }
    public void timeLimit(){
        System.out.println("time limit for ride will be");
        
    }
}
