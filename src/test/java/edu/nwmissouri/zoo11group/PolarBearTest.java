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
<<<<<<< HEAD
 * @author Pravallika(S545254)
=======
 * @author Maddelavedu Pravallika(s545254)
>>>>>>> 847f39f46648749a16844ced7488ab0d5725c9df
 */
public class PolarBearTest {
    
    public PolarBearTest() {
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
     * Test of move method, of class PolarBear.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        PolarBear instance = new PolarBear("Pravallika");
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of speak method, of class PolarBear.
     */
    @Test
    public void testSpeak() {
        System.out.println("speak");
        PolarBear instance = new PolarBear("Pravallika");
        instance.speak();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
