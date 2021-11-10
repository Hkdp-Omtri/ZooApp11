/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 * This is the class which defines the Ferris wheel
 * @author S545407
 */
public class FerrisWheelAdventure extends ZooAdventure {

    private int noOfRotations;
    private double height;

    /**
     *
     * @return string value of the all variables declared
     */
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
     * this defines the ageLimit
     */
    @Override
    public void ageLimit() {
    }

    /**
     * This defines what idProof is required
     */
    @Override
    public void idProof() {
    }

    /**
     * The safetyMeasures required
     */
    @Override
    public void safetyMeasures() {

    }

    /**
     *
     * @return double value of heightOfPole
     */
    public double heightOfPole() {
        System.out.println("Height of the pole will be very high");
        return 0;
    }

    /**
     * experience of the required
     */
    public void experience() {
        System.out.println("checking the experience conducted by zoo adventure");
    }

    /**
     * execution of run method
     */
    public static void run() {
        System.out.println("============ THIS IS FERRISWHEEL ADVENTURE =============");
        System.out.println("We Are Here To Take Any Adventure");
    }
}
