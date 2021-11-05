/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo11group;
/**
 * This class defines the nature of the Emu animal
 * @author Venkata Prabhakar Takkellapati (S545407)
 */
public class Emu extends Animal {
    /**
     * 
     * @param name invoking name through constructor
     */
    public Emu(String name) {
        super(name);
    }

    /**
     * Determines the animal speak
     */
    @Override
    public void speak() {
        System.out.println("This endangered species is native to the dense forests of the Congo!");
    }
    /**
     * Determines the animal move
     */
    @Override
    public void move() {
        System.out.println("they've become rare in the wild.");
    }    

}
