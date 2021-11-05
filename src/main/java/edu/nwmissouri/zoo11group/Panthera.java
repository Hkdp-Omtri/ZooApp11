
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo11group;

/**
 *This Class extends Animal class
 * @author Pinninti Harshika
 */
public class Panthera extends Animal {

    /**
     * This is parameter constructor which initialize the instance variables
     * according to parameters passed
     *
     * @param name is passed to the constructor super constructor is used
     */
    public Panthera(String name) {
        super(name);
    }

    /**
     * This is speak method which is used to to print the message print the
     * statement
     */
    @Override
    public void speak() {
        System.out.println("I am Panthera");
    }

    /**
     * This is move method which is used to to print the message print the
     * statement that describes the aardvark movements
     */
    @Override
    public void move() {
        System.out.println("I can eat and walk");
    }

}
