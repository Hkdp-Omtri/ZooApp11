
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo11group;

/**
 * This Class extends Animal class
 * @author Sarath Arrepu
 */
public class TauntingTiger extends Animal {
    /**
     * This is the parametrized constructor
     * @param name
     */
    public TauntingTiger(String name) {
        super(name);
    }
    /**
     * This method is about the animal speaking
     */
    @Override
    public void speak() {
        System.out.println("I roar");
    }
    /**
     * This method is about the animal movement
     */
    @Override
    public void move() {
        System.out.println("I hunt");
    }
    /**
     * This method is about the animal eating
     */
    public void eat() {
        System.out.println("I eat meat");
    }
    /**
     * This method is about the animal type
     */
     public void type() {
        System.out.println("I am a wild animal");
    }
    
    public int exceptions() {
          
        int a = 0;
        b = 2;
        int div;
        try
        {
          div = b/a;
        }
        // doesn't matches with ArithmeticException
        catch(NumberFormatException ex)
        {
           System.out.println("NumberFormatException is occured"); 
        }
        return div;
    }
    
       public static void main(String[] args){
           TauntingTiger tommy = new TauntingTiger("tommy");
           for(int i =0;i<4;i++){
           tommy.eat();
           tommy.eat();
           tommy.speak();
           tommy.move();
           tommy.type();
           }
       }
    
    
}
