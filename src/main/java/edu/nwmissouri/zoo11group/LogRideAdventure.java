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

    public void waterCapacity() {
        System.out.println("The water capacity is 10,000 liter");
    }
    @Override
    public void ageLimit(){
        System.out.println("The age limit should be above 18 years");
    }
    @Override
    public void idProof(){
        System.out.println("Governemnt issued card is required");
    }
    @Override
    public void safetyMeasures(){
        System.out.println("Need to precautionary measures before entering");
    }
}
