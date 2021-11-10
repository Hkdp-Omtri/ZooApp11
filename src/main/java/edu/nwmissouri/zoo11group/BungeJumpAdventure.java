/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 * This is a BungeJumpAdventure class 
 * @author Sarath Arrepu
 */
public class BungeJumpAdventure extends ZooAdventure {
    
    private boolean signedsafetywavier;


    @Override
    public String toString() {
        return "BungeJumpAdventure{" + "signedsafetywavier=" + signedsafetywavier + ", totcustomer=" + totcustomer + '}';
    }
/**
 * 
 * @return isSignedsafetywavier value
 */
    public boolean isSignedsafetywavier() {
        return signedsafetywavier;
    }
/**
 * 
 * @param signedsafetywavier sets the value of setSignedsafetywavier
 */
    public void setSignedsafetywavier(boolean signedsafetywavier) {
        this.signedsafetywavier = signedsafetywavier;
    }
/**
 * @return customer value of customer
 */
    public int getTotcustomer() {
        return totcustomer;
    }
    /**
     * 
     * @param totcustomer to set the customer
     */

    public void setTotcustomer(int totcustomer) {
        this.totcustomer = totcustomer;
    }
    private int totcustomer;
    /*
    This is ageLimit method displays age
    */
    @Override
    public void ageLimit() {
        System.out.println("the age limit is 20+ years");
    }
    /*
    This is idProof method and it asks for idProof
    */
    @Override
    public void idProof() {
        System.out.println("We need valid passport");
    }
    /*
    This is safetyMeasures method
    */
    @Override
    public void safetyMeasures() {
        System.out.println("For BungeJump you have to sign death wavier");
    }
    /*
    This is lengthofjump method it has length of the jump
    */
    public void lengthofjump() {
        System.out.println("This a 100 meter jump");
    }
 /**
  * 
  * @return duration value of time
  */
    public double duration() {
        return 10.0;
    }
    /*
    This is run method displays 
    */
    public static void run() {
        System.out.println("********************************");
        System.out.println("Bunge Jump Adventure");
    }

}

