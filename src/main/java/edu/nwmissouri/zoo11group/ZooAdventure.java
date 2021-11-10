/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *This is PolarBear class 
 * @author S545407
 */
public abstract class ZooAdventure {
    private String Adventurename;
    private int NumberOfCustomers;

    @Override
    public String toString() {
        return "ZooAdventure{" + "Adventurename=" + Adventurename + ", NumberOfCustomers=" + NumberOfCustomers + '}';
    }
/**
 * 
 * @return Adventurename name
 */
    public String getAdventurename() {
        return Adventurename;
    }
/**
 * 
 * @param Adventurename sets Adventurename value
 */
    public void setAdventurename(String Adventurename) {
        this.Adventurename = Adventurename;
    }
/**
 * 
 * @return NumberOfCustomers value
 */
    public int getNumberOfCustomers() {
        return NumberOfCustomers;
    }
/**
 * 
 * @param NumberOfCustomers sets NumberOfCustomers value
 */
    public void setNumberOfCustomers(int NumberOfCustomers) {
        this.NumberOfCustomers = NumberOfCustomers;
    }
    
    public static void run () 
    {
        
    }
    public void ageLimit(){
    }
    public void idProof(){
    }
    public void safetyMeasures(){
    }
    
}
