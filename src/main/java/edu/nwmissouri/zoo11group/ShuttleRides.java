/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *This is ShuttleRides class 
 * @author SarathArrepu S545027
 */
public class ShuttleRides {
    private String customerName;

    @Override
    public String toString() {
        return "ShuttleRides{" + "customerName=" + customerName + ", doubleAxle=" + doubleAxle + ", noofcustomers=" + noofcustomers + '}';
    }
/**
 * 
 * @return customerName value
 */
    public String getCustomerName() {
        return customerName;
    }
/**
 * 
 * @param customerName sets customerName value
 */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
/**
 * 
 * @return doubleAxle value
 */
    public boolean isDoubleAxle() {
        return doubleAxle;
    }
/**
 * 
 * @param doubleAxle sets doubleAxle value
 */
    public void setDoubleAxle(boolean doubleAxle) {
        this.doubleAxle = doubleAxle;
    }
/**
 * 
 * @return noofcustomers value
 */
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
    
    public void ExcepTest {
      try {
         int arr[] = new int[2];
         System.out.println("Access element three :" + arr[3]);
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
      }

    /*
    This is run method
    */
    public static void run() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");                      
        System.out.println("Do you want to Join the Shuttle Rides"); }
}
