/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo11group;

/**
 * This is PolarBear class
 *
<<<<<<< HEAD
 * @author Maddelavedu Pravallika
=======
 * @author Maddelavedu Pravallika(s545254)
>>>>>>> e0415aa47e191b3051560bfdad43bdd1fd1cc771
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
        System.out.printf("I'm %s. I'm an polarBear! \n", this.name);
    }

    public int Exceptionclass() {
        int a = 10;
        for (int i = 3; i >= 0; i--)
		   try {
            System.out.println(a / i);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return a;
    }
    
    public static void main(String[] args) {
        PolarBear p = new PolarBear("p");
        p.speak();
        p.move();
        p.Exceptionclass();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> e0415aa47e191b3051560bfdad43bdd1fd1cc771
