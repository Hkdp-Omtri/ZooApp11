/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo11group;

/**
 *This is PolarBear class 
 * @author Maddelavedu Pravallika(s545254)
 */
public class PolarBear extends Animal {
    
     public PolarBear(String name) {
       super(name); 
    }
    
    @Override
    public void move() {
        System.out.println(" Its head from side to side when it wants to play with another");
    }
    
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an polarBear! \n",this.name);
    }
    
    public int oopsException() {
  int d = 10;
  int n = 0;
  try 
  {
   int multiplication = n * d;
   System.out.println("This will no the executed");
  } 
  catch (ArithmeticException e)
  {
   System.out.println("Exception = " + e);
  }
  return multiplication;
}

    /**
     *
     * @param main exception Handling class
     */
    public static void main(String args[]){
   PolarBear B = new PolarBear("B");
   B.speak();
   B.move();
   B.oopsException();
   }
}
    
    
}
