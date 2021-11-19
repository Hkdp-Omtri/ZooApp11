/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo11group;

/**
 * This is ProngHorn animal class.(derived subclass of the superclass Animal)
 *
 * @author Alekhya Gandra
 */
public class ProngHorn extends Animal {

    /* This is parameter constructor which initialize the instance variables according to parameters passed
 * @param name is passed to the constructor
 * 
     */

    public ProngHorn(String name) {
        super(name);
    }
    
    /* Enum genertaion 
     * 
    
    */
    
    
    public enum Gender {
        Male,
        Female,
        Unknown
    }

    /**
     * This is speak method which is used to to print the message print the
     * statement
     */

    @Override
    public void speak() {
    
        System.out.printf("I'm %s. I'm a ProngHorn!", this.name);
    }

    /**
     * This is move method which is used to to print the message print the
     * statement
     */
    @Override
    public void move() {
     
          System.out.println("When I move, I walk, walk, walk.");
    }
    
    /** function mul gives multiplication 
     * 
     * @param a
     * @param b 
     */
    public void mul(int a ,int b)
    {
        System.out.println(a * b);
    }
    
    /** function sub gives subtarction
     * 
     * @param a
     * @param b 
     */
    
    public void sub(int a ,int b)
    {
        System.out.println(a-b);
    }
    
   
    

     /**
     * Custom ProngHorn function - your class must use a unique function name
     * unique first parameter identifier unique second parameter identifier do
     * something creative
     *
     * @param valueOne double input
     * @param valueTwo int input
     * @return double sum
     */
    public double getProngHornAddition(double valueOne, int  valueTwo) {
        return valueOne + valueTwo;
    }
    /**
     * function profess1 calls the getProngHornAddition method
     
     */
    
    
     public void profess1() {
        double a = 2.5;
        int b = 2;
        double c = getProngHornAddition(a, b);
        System.out.printf("I know ProngHornAddition! %4.2f plus %d is %4.2f \n", a, b, c);
    } 
    /**
    * function exceptions
    */
    
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
    
   /**
    * main method 
    
    */
    public static void main (String args[]) {
        ProngHorn p = new ProngHorn("Alekhya");
        p.speak();
        p.move();
        p.mul(3,2);
        p.sub(3,2);
        p.profess1();
        p.exceptions();
        
        Gender c = Gender.Male;
        System.out.println("The gender of pronghorn is : " + c);
       

    }
}
