/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *This is RollerCoasterAdventure class 
 * @author Maddelavedu Pravallika(s545254)
 */
public class RollerCoasterAdventure extends ZooAdventure {
    private String nameOfThePerson;
    private boolean isCondition;

    @Override
    public String toString() {
        return "RollerCoasterAdventure{" + "nameOfThePerson=" + nameOfThePerson + ", isCondition=" + isCondition + '}';
    }
/**
 * 
 * @return nameOfThePerson value
 */
    public String getNameOfThePerson() {
        return nameOfThePerson="";
    }

    /**
     * 
     * @param nameOfThePerson sets the nameOfThePerson value
     */
    public void setNameOfThePerson(String nameOfThePerson) {
        this.nameOfThePerson = nameOfThePerson;
    }
/**
 * 
 * @return isCondition value
 */
    public boolean isIsCondition() {
        return isCondition;
    }
/**
 * 
 * @param isCondition sets isCondition
 */
    public void setIsCondition(boolean isCondition) {
        this.isCondition = isCondition;
    }
     /**
     * This is ageLimit method displays Age
     */
    @Override
    public void ageLimit(){
        System.out.println("AgeLimit is 18+ years");
    }
    /**
     *  This is the idProof technique, which requires idProof.
     */
    @Override
    public void idProof(){
        System.out.println("we need aadhar card");
    }

    /**
     * This is safetyMeasures method
     */
    @Override
    public void safetyMeasures(){
       System.out.println("RollerCoater you have to sign death wavier"); 
    }
   /**
    * this is condition method to check the rollercoaster
    */
    public boolean condition(){
        System.out.println("checking the condition is true or false if false mention danger");
        
        return false;
    }
    /**
     * this is color method displays color of the ride
     */
    public void color(){
        System.out.println("Color of the roller coster will mentioned as per changes");
         }
    /**
     * this is run method
     */
    public static void run() {
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");                      
        System.out.println("This is the RollerCoaster Adventure!"); }
    
}
