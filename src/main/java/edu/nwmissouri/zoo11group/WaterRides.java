/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author Pinninti Harshikas
 */
public class WaterRides extends ZooAdventure {

    private String adventureName;
    private int noOfCustomer;

    @Override
    public String toString() {
        return "WaterRides{" + "adventureName=" + adventureName + ", noOfCustomer=" + noOfCustomer + ", noOfPeople=" + noOfPeople + ", totalCost=" + totalCost + '}';
    }

    public String getAdventureName() {
        return adventureName;
    }

    public void setAdventureName(String adventureName) {
        this.adventureName = adventureName;
    }

    public int getNoOfCustomer() {
        return noOfCustomer;
    }

    public void setNoOfCustomer(int noOfCustomer) {
        this.noOfCustomer = noOfCustomer;
    }

    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }
    private int noOfPeople;
    private int totalCost;

    /**
     * ageLimit method
     */
    @Override
    public void ageLimit() {
        System.out.println("The age limit of the children is above 5 years");
        System.out.println("The age limit of the children is below 50 years");

    }

    /**
     * idProof method
     */
    @Override
    public void idProof() {
        System.out.println("The id proof required for the children in adhar card");

    }

    /**
     * safetyMeasures method
     */
    @Override
    public void safetyMeasures() {
        System.out.println("The Saftey measures required are No carrying extra lugguage");
    }

    /**
     * method typeOfRide
     */
    public void typeOfRide() {
        System.out.println("Enter the type of the Ride u want to do in WaterRides");

    }
    /**
     * method run 
     */

    public static void run() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("What games do you wanna join in water rides");
        System.out.println("Look there is a Aqua Loop Game");
    }

    /**
     * totalCostOfRide method gives the totalcost
     * @param noOfPeople
     * @return totalcost
     */
    public int totalCostOfRide(int noOfPeople) {

        int costOfTicket = 56;
        totalCost = noOfPeople * costOfTicket;
        return totalCost;
    }

}
