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
public class CarRidesTest {
    
    public CarRidesTest() {
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
     * Test of toString method, of class CarRides.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CarRides instance = new CarRides();
        String expResult = "CarRides{price=0.0, time=0.0, distance=0.0, age=0}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class CarRides.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        CarRides instance = new CarRides();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class CarRides.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        CarRides instance = new CarRides();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class CarRides.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        CarRides instance = new CarRides();
        double expResult = 0.0;
        double result = instance.getTime();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTime method, of class CarRides.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        double time = 0.0;
        CarRides instance = new CarRides();
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDistance method, of class CarRides.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        CarRides instance = new CarRides();
        double expResult = 0.0;
        double result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDistance method, of class CarRides.
     */
    @Test
    public void testSetDistance() {
        System.out.println("setDistance");
        double distance = 0.0;
        CarRides instance = new CarRides();
        instance.setDistance(distance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class CarRides.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        CarRides instance = new CarRides();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class CarRides.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        CarRides instance = new CarRides();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of carRides method, of class CarRides.
     */
    @Test
    public void testCarRides() {
        System.out.println("carRides");
        CarRides instance = new CarRides();
        instance.carRides();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of coach method, of class CarRides.
     */
    @Test
    public void testCoach() {
        System.out.println("coach");
        CarRides instance = new CarRides();
        instance.coach();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calculation method, of class CarRides.
     */
    @Test
    public void testCalculation() {
        System.out.println("calculation");
        CarRides instance = new CarRides();
        instance.calculation();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of ticketprice method, of class CarRides.
     */
    @Test
    public void testTicketprice() {
        System.out.println("ticketprice");
        CarRides instance = new CarRides();
        instance.ticketprice();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of noofseats method, of class CarRides.
     */
    @Test
    public void testNoofseats() {
        System.out.println("noofseats");
        CarRides instance = new CarRides();
        instance.noofseats();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class CarRides.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        CarRides.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
