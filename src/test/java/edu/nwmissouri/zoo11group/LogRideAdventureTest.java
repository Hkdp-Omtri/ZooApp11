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
 * @author S544929
 */
public class LogRideAdventureTest {
    
    public LogRideAdventureTest() {
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
     * Test of getEntryTime method, of class LogRideAdventure.
     */
    @Test
    public void testGetEntryTime() {
        System.out.println("getEntryTime");
        LogRideAdventure instance = new LogRideAdventure();
        int expResult = 0;
        int result = instance.getEntryTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEntryTime method, of class LogRideAdventure.
     */
    @Test
    public void testSetEntryTime() {
        System.out.println("setEntryTime");
        int entryTime = 0;
        LogRideAdventure instance = new LogRideAdventure();
        instance.setEntryTime(entryTime);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class LogRideAdventure.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        LogRideAdventure instance = new LogRideAdventure();
        String expResult = "LogRideAdventure{entryTime=0, capacity=0.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCapacity method, of class LogRideAdventure.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        LogRideAdventure instance = new LogRideAdventure();
        double expResult = 0.0;
        double result = instance.getCapacity();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacity method, of class LogRideAdventure.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        double capacity = 0.0;
        LogRideAdventure instance = new LogRideAdventure();
        instance.setCapacity(capacity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of waterCapacity method, of class LogRideAdventure.
     */
    @Test
    public void testWaterCapacity() {
        System.out.println("waterCapacity");
        LogRideAdventure instance = new LogRideAdventure();
        instance.waterCapacity();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ageLimit method, of class LogRideAdventure.
     */
    @Test
    public void testAgeLimit() {
        System.out.println("ageLimit");
        LogRideAdventure instance = new LogRideAdventure();
        instance.ageLimit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of idProof method, of class LogRideAdventure.
     */
    @Test
    public void testIdProof() {
        System.out.println("idProof");
        LogRideAdventure instance = new LogRideAdventure();
        instance.idProof();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of safetyMeasures method, of class LogRideAdventure.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        LogRideAdventure instance = new LogRideAdventure();
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class LogRideAdventure.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        LogRideAdventure.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
