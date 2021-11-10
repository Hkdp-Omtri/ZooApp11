/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo11group;

import java.io.PrintStream;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author S545035
 */
public class WaterRidesTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public WaterRidesTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of ageLimit method, of class WaterRides.
     */
    @Test
    public void testAgeLimit() {
        //System.out.println("ageLimit");
        WaterRides instance = new WaterRides();
        instance.ageLimit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "The age limit of the children is above 5 years";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of idProof method, of class WaterRides.
     */
    @Test
    public void testIdProof() {
        //System.out.println("idProof");
        WaterRides instance = new WaterRides();
        instance.idProof();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "The id proof required for the children in adhar card";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of safetyMeasures method, of class WaterRides.
     */
    @Test
    public void testSafetyMeasures() {
        //System.out.println("safetyMeasures");
        WaterRides instance = new WaterRides();
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "The Saftey measures required are No carrying extra lugguage";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of typeOfRide method, of class WaterRides.
     */
    @Test
    public void testTypeOfRide() {
        //System.out.println("typeOfRide");
        WaterRides instance = new WaterRides();
        instance.typeOfRide();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "Enter the type of the Ride u want to do in WaterRides";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of run method, of class WaterRides.
     */
    @Test
    public void testRun() {
        //System.out.println("run");
        WaterRides.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
         String expected = "What games do you wanna join in water rides";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of totalCostOfRide method, of class WaterRides.
     */
    @Test
    public void testTotalCostOfRide() {
        System.out.println("totalCostOfRide");
        WaterRides instance = new WaterRides();
        int expResult = 336;
        int result = instance.totalCostOfRide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
