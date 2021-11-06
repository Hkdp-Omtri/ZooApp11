/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author Homakesavadurgaprasad Omtri(S544929)
 */
public class LogRideAdventure extends ZooAdventure {

    private int entryTime;
    private double capacity;

    /*
    This is waterCapacity method display the capacity of water 
     */
    public void waterCapacity() {
        System.out.println("The water capacity is 10,000 liter");
    }

    /*
    This is ageLimit method display the age limit
     */
    @Override
    public void ageLimit() {
        System.out.println("The age limit should be above 18 years.");
    }

    /*
    This is idProof method display government id card
     */
    @Override
    public void idProof() {
        System.out.println("Governemnt issued card is required.");
    }

    /*
    This is safetyMeasures method tells the precautionary measures
     */
    @Override
    public void safetyMeasures() {
        System.out.println("Need to take precautionary measures before entering .");
    }

    /*
    This is run method displays 
     */
    public static void run() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("This is the LogRide Adventure");
    }
}
