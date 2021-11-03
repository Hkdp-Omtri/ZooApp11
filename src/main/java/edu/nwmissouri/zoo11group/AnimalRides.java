/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author Alekhya Gandra
 */
public class AnimalRides extends ZooRides{
    
    int animalName;
    int noOfMembers;
    double speed;
    
      @Override
    public void ticketprice()
    {
        
    }
    @Override
    public void noofseats()
    {
        
    }
    public void  ticketPrice()
    {
        System.out.println("The ticketPrice is :" + 50.00);
    }
    public void noOfSeats()
    {
        System.out.println("Number of Seats available is  :" + 3);
    }
    public void timeCalculation()
    {
        System.out.println("The amount of time spent is :" + "2 Hours ");
    }
}
