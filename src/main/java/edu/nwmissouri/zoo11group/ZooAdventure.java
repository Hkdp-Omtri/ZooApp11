/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author S545407
 */
public abstract class ZooAdventure {
    private String Adventurename;
    private int NumberOfCustomers;

    @Override
    public String toString() {
        return "ZooAdventure{" + "Adventurename=" + Adventurename + ", NumberOfCustomers=" + NumberOfCustomers + '}';
    }

    public String getAdventurename() {
        return Adventurename;
    }

    public void setAdventurename(String Adventurename) {
        this.Adventurename = Adventurename;
    }

    public int getNumberOfCustomers() {
        return NumberOfCustomers;
    }

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
