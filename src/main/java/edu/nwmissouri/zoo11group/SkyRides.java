/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

import java.util.ArrayList;

/**
 * This is SkyRides class 
 * @author Maddelavedu Pravallika(s545254)
 */
public class SkyRides extends ZooRides {
    
    private double Price;
    private double Miles;

    @Override
    public String toString() {
        return "SkyRides{" + "Price=" + Price + ", Miles=" + Miles + '}';
    }
/**
 * 
 * @return Price
 */
    public double getPrice() {
        return Price;
    }
/**
 * 
 * @param Price sets price value
 */
    public void setPrice(double Price) {
        this.Price = Price;
    }
/**
 * 
 * @return Miles
 */
    public double getMiles() {
        return Miles;
    }
/**
 * 
 * @param Miles sets Miles value
 */
    public void setMiles(double Miles) {
        this.Miles = Miles;
    }
/**
 * 
 * @return myGroup value
 */
    public static ArrayList<SkyRides> getMyGroup() {
        return myGroup;
    }

    public static void setMyGroup(ArrayList<SkyRides> myGroup) {
        SkyRides.myGroup = myGroup;
    }
    private static ArrayList<SkyRides> myGroup;
     /**
     * this is ticketprice method displays Price
     */
    @Override
    public void ticketprice(){
       System.out.println("The ticket price is $10"); 
}

    /**
     * this is run method
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
   /**
    * this is noofseats method displays noofseats
    */
    @Override
    public void noofseats(){
         System.out.println("The number of seats is one");
    }
    /**
     * this is skyrides method
     */
    public void skyrides(){
        System.out.println("skyride");
    }
    /**
     * this is compartment method
     */
    public double compartment(){
        System.out.println("compartment number alloted");
        
        return 0.0;
    
    }
    /**
     * this is timeLimit method
     */
    public void timeLimit(){
        System.out.println("time limit for ride will be");
        
    }
}
