/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author SarathArrepu
 */
public class ShuttleRides {
    private String customerName;

    @Override
    public String toString() {
        return "ShuttleRides{" + "customerName=" + customerName + ", doubleAxle=" + doubleAxle + ", noofcustomers=" + noofcustomers + '}';
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isDoubleAxle() {
        return doubleAxle;
    }

    public void setDoubleAxle(boolean doubleAxle) {
        this.doubleAxle = doubleAxle;
    }

    public int getNoofcustomers() {
        return noofcustomers;
    }

    public void setNoofcustomers(int noofcustomers) {
        this.noofcustomers = noofcustomers;
    }
    private boolean doubleAxle;
    private int noofcustomers;
    /*
    This is ticketprice method displays ticketprice
    */
    
    public void ticketprice(){
        System.out.println("The ticket price is $10");
    }
    /*
    This is noofseats method displays noofseats
    */
    public void noofseats(){
        System.out.println("The number of seats is six");
    }
    /*
    This is shuttletype method 
    */
    public void shuttletype(){
        System.out.println("This a minivan");
    }
    /*
    This is run method
    */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");                      
        System.out.println("Do you want to Join the Shuttle Rides"); }
}
