/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo11group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alekhya(S545229)
 */
public class ProngHornTest {
    
    public ProngHornTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of speak method, of class ProngHorn.
     */
    @Test
    public void testSpeak() {
        System.out.println("speak");
        ProngHorn instance = new ProngHorn("Alekhya");
        instance.speak();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class ProngHorn.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        ProngHorn instance = new ProngHorn("Alekhya");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mul method, of class ProngHorn.
     */
    @Test
    public void testMul() {
        System.out.println("mul");
        int a = 0;
        int b = 0;
        ProngHorn instance = new ProngHorn("Alekhya");
        instance.mul(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sub method, of class ProngHorn.
     */
    @Test
    public void testSub() {
        System.out.println("sub");
        int a = 0;
        int b = 0;
        ProngHorn instance = new ProngHorn("Alekhya");
        instance.sub(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getProngHornAddition method, of class ProngHorn.
     */
    @Test
    public void testGetProngHornAddition() {
        System.out.println("getProngHornAddition");
        double valueOne = 0.0;
        int valueTwo = 0;
        ProngHorn instance = new ProngHorn("Alekhya");
        double expResult = 0.0;
        double result = instance.getProngHornAddition(valueOne, valueTwo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of profess1 method, of class ProngHorn.
     */
    @Test
    public void testProfess1() {
        System.out.println("profess1");
        ProngHorn instance = new ProngHorn("Alekhya");
        instance.profess1();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class ProngHorn.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        ProngHorn.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
