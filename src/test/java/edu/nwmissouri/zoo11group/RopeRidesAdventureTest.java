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
public class RopeRidesAdventureTest {
    
    public RopeRidesAdventureTest() {
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
     * Test of toString method, of class RopeRidesAdventure.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RopeRidesAdventure instance = new RopeRidesAdventure();
        String expResult = "RopeRidesAdventure{noOfMembers=0, speed=0.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNoOfMembers method, of class RopeRidesAdventure.
     */
    @Test
    public void testGetNoOfMembers() {
        System.out.println("getNoOfMembers");
        RopeRidesAdventure instance = new RopeRidesAdventure();
        int expResult = 0;
        int result = instance.getNoOfMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNoOfMembers method, of class RopeRidesAdventure.
     */
    @Test
    public void testSetNoOfMembers() {
        System.out.println("setNoOfMembers");
        int noOfMembers = 0;
        RopeRidesAdventure instance = new RopeRidesAdventure();
        instance.setNoOfMembers(noOfMembers);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class RopeRidesAdventure.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        RopeRidesAdventure instance = new RopeRidesAdventure();
        double expResult = 0.0;
        double result = instance.getSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class RopeRidesAdventure.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        double speed = 0.0;
        RopeRidesAdventure instance = new RopeRidesAdventure();
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of height method, of class RopeRidesAdventure.
     */
    @Test
    public void testHeight() {
        System.out.println("height");
        RopeRidesAdventure instance = new RopeRidesAdventure();
        int expResult = 10;
        int result = instance.height();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isWinner method, of class RopeRidesAdventure.
     */
    @Test
    public void testIsWinner() {
        System.out.println("isWinner");
        RopeRidesAdventure instance = new RopeRidesAdventure();
        instance.isWinner();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ageLimit method, of class RopeRidesAdventure.
     */
    @Test
    public void testAgeLimit() {
        System.out.println("ageLimit");
        RopeRidesAdventure instance = new RopeRidesAdventure();
        instance.ageLimit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of idProof method, of class RopeRidesAdventure.
     */
    @Test
    public void testIdProof() {
        System.out.println("idProof");
        RopeRidesAdventure instance = new RopeRidesAdventure();
        instance.idProof();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of safetyMeasures method, of class RopeRidesAdventure.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        RopeRidesAdventure instance = new RopeRidesAdventure();
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class RopeRidesAdventure.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        RopeRidesAdventure.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
