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
public class AnimalRidesTest {
    
    public AnimalRidesTest() {
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
     * Test of toString method, of class AnimalRides.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        AnimalRides instance = new AnimalRides();
        String expResult = "AnimalRides{animalName=0, noOfMembers=0, speed=0.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAnimalName method, of class AnimalRides.
     */
    @Test
    public void testGetAnimalName() {
        System.out.println("getAnimalName");
        AnimalRides instance = new AnimalRides();
        int expResult = 0;
        int result = instance.getAnimalName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setAnimalName method, of class AnimalRides.
     */
    @Test
    public void testSetAnimalName() {
        System.out.println("setAnimalName");
        int animalName = 0;
        AnimalRides instance = new AnimalRides();
        instance.setAnimalName(animalName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNoOfMembers method, of class AnimalRides.
     */
    @Test
    public void testGetNoOfMembers() {
        System.out.println("getNoOfMembers");
        AnimalRides instance = new AnimalRides();
        int expResult = 0;
        int result = instance.getNoOfMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNoOfMembers method, of class AnimalRides.
     */
    @Test
    public void testSetNoOfMembers() {
        System.out.println("setNoOfMembers");
        int noOfMembers = 0;
        AnimalRides instance = new AnimalRides();
        instance.setNoOfMembers(noOfMembers);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class AnimalRides.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        AnimalRides instance = new AnimalRides();
        double expResult = 0.0;
        double result = instance.getSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class AnimalRides.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        double speed = 0.0;
        AnimalRides instance = new AnimalRides();
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of noofseats method, of class AnimalRides.
     */
    @Test
    public void testNoofseats() {
        System.out.println("noofseats");
        AnimalRides instance = new AnimalRides();
        instance.noofseats();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ticketPrice method, of class AnimalRides.
     */
    @Test
    public void testTicketPrice() {
        System.out.println("ticketPrice");
        AnimalRides instance = new AnimalRides();
        instance.ticketPrice();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of timeCalculation method, of class AnimalRides.
     */
    @Test
    public void testTimeCalculation() {
        System.out.println("timeCalculation");
        AnimalRides instance = new AnimalRides();
        instance.timeCalculation();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class AnimalRides.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        AnimalRides.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
