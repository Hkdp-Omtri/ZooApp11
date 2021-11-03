/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo11group;

/**
 *
 * @author Sarath Arrepu
 */
public class BungeJumpAdventure extends ZooAdventure {
    private boolean signedsafetywavier;
    private int totcustomer;
    
    @Override
    public void ageLimit(){
        System.out.println("the age limit is 20+ years");
    }
    @Override
    public void idproof(){
        System.out.println("We need valid passport");
    }
    @Override
    public void safetymeasures(){
        System.out.println("For BungeJump you have to sign death wavier");
    }
    
    public void lengthofjump(){
        System.out.println("This a 100 meter jump");
    }
    
    public double duration(){
        return 10.0;
    }
    
    
}

