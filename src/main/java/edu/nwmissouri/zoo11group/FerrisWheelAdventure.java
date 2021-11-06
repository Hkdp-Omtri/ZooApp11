/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author S545407
 */
public class FerrisWheelAdventure extends ZooAdventure {
    private int noOfRotations;
    private double height;

    @Override
    public String toString() {
        return "FerrisWheelAdventure{" + "noOfRotations=" + noOfRotations + ", height=" + height + '}';
    }
/**
 * 
 * @return noOfRotations value
 */
    public int getNoOfRotations() {
        return noOfRotations;
    }
/**
 * 
 * @param noOfRotations sets noOfRotations
 */
    public void setNoOfRotations(int noOfRotations) {
        this.noOfRotations = noOfRotations;
    }
/**
 * 
 * @return height value
 */
    public double getHeight() {
        return height;
    }
/**
 * 
 * @param height sets height value
 */
    public void setHeight(double height) {
        this.height = height;
    }
    /**
     *
     */
    @Override
    public void ageLimit(){
    }
    /**
     * 
     */
    @Override
    public void idProof(){
    }

    /**
     *
     */
    @Override
    public void safetyMeasures(){
        
    }
    
    public double heightOfPole(){
        System.out.println("Height of the pole will be very high");
        return 0;
    }
    public void experience(){
        System.out.println("checking the experience conducted by zoo adventure");}
    
public static void run() {
System.out.println("============ THIS IS FERRISWHEEL ADVENTURE =============");
System.out.println("We Are Here To Take Any Adventure"); }
}
