/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author S545254
 */
public class RollerCoasterAdventure extends ZooAdventure {
    private String nameOfThePerson;
    private boolean isCondition;

    @Override
    public String toString() {
        return "RollerCoasterAdventure{" + "nameOfThePerson=" + nameOfThePerson + ", isCondition=" + isCondition + '}';
    }

    public String getNameOfThePerson() {
        return nameOfThePerson;
    }

    public void setNameOfThePerson(String nameOfThePerson) {
        this.nameOfThePerson = nameOfThePerson;
    }

    public boolean isIsCondition() {
        return isCondition;
    }

    public void setIsCondition(boolean isCondition) {
        this.isCondition = isCondition;
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
    public boolean condition(){
        System.out.println("checking the condition is true or false if false mention danger");
        
        return false;
    }
    public void color(){
        System.out.println("Color of the roller coster will mentioned as per changes");
        
    
    }
    public static void run() {
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");                      
        System.out.println("This is the RollerCoaster Adventure!"); }
    
}
