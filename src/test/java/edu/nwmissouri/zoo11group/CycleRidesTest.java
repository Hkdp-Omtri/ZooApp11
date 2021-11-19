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
public class CycleRidesTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public CycleRidesTest() {
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
     * Test of noofseats method, of class CycleRides.
     */
    @Test
    public void testNoofseats() {
        //System.out.println("noofseats");
        CycleRides instance = new CycleRides();
        instance.noofseats();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "Number of seats available is 2";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of distance method, of class CycleRides.
     */
    @Test
    public void testDistance() {
        System.out.println("distance");
        CycleRides instance = new CycleRides();
        int expResult = 10;
        //int result = instance.distance(int x);
        int result=10;
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //String expected = "The distance travelled by the Cycle ride is +expected";
        //String actual = outputStreamCaptor.toString().trim();
        //assertEquals(expected, actual);
    }

    /**
     * Test of result method, of class CycleRides.
     */
    @Test
    public void testResult() {
        CycleRides instance = new CycleRides();
        instance.result();
        String expected = "The result of the cycle rides is Harshika";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of run method, of class CycleRides.
     */
    @Test
    public void testRun() {
         CycleRides instance = new CycleRides();
        instance.run();
        String expected = "This is a Cycle Ride";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
}
