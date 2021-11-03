/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author Alekhya Gandra
 */
public class RopeRidesAdventure extends ZooAdventure {
    
    int noOfMembers;
    double speed;
    
   
    
    public int  height()
    {
        int height = 10 ;
        return height;
    }
    public void isWinner()
    {
        System.out.println("The performer is winner ");
    }
    @Override
    public void ageLimit()
    {
        System.out.println("The age limit is 22 years ");
    }
    @Override
    public void idProof()
    {
        System.out.println("ID proof is verified");
    }
    @Override
    public void safetyMeasures()
    {
        System.out.println("SafetyMeasures are taken");
    }
}
