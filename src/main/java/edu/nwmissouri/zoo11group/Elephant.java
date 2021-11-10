/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo11group;

/**
 *This is Elephant class 
 * @author Homakesavadurgaprasad OMTRI (S544929)
 */
public class Elephant extends Animal {

    /**
     * This method is used to get the string from the parent class
     *
     * @param name Elephant
     */

    public Elephant(String name) {
        super(name);
    }

    /**
     * This is used to print name of the Animal
     *
     */

    public void speak() {
        System.out.println(" I'm an Elephant! ");
    }

    /**
     * This is used to print Animal food
     *
     */

    @Override
    public void move() {
        System.out.println(" I could not able to swim in water but would like to walk! ");
    }

}
