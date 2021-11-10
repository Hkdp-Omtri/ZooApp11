/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo11group;

import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author S545407
 */
public class TrainRidesTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public TrainRidesTest() {
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
     * Test of toString method, of class TrainRides.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        TrainRides instance = new TrainRides();
        String expResult = "TrainRides{reservedNo=, speed=0.0, time=0.0, distance=0.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getReservedNo method, of class TrainRides.
     */
    @Test
    public void testGetReservedNo() {
        System.out.println("getReservedNo");
        TrainRides instance = new TrainRides();
        String expResult = "";
        String result = instance.getReservedNo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setReservedNo method, of class TrainRides.
     */
    @Test
    public void testSetReservedNo() {
        System.out.println("setReservedNo");
        String reservedNo = "";
        TrainRides instance = new TrainRides();
        instance.setReservedNo(reservedNo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class TrainRides.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        TrainRides instance = new TrainRides();
        double expResult = 0.0;
        double result = instance.getSpeed();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class TrainRides.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        double speed = 0.0;
        TrainRides instance = new TrainRides();
        instance.setSpeed(speed);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class TrainRides.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        TrainRides instance = new TrainRides();
        double expResult = 0.0;
        double result = instance.getTime();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTime method, of class TrainRides.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        double time = 0.0;
        TrainRides instance = new TrainRides();
        instance.setTime(time);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDistance method, of class TrainRides.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        TrainRides instance = new TrainRides();
        double expResult = 0.0;
        double result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDistance method, of class TrainRides.
     */
    @Test
    public void testSetDistance() {
        System.out.println("setDistance");
        double distance = 0.0;
        TrainRides instance = new TrainRides();
        instance.setDistance(distance);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ticketprice method, of class TrainRides.
     */
    @Test
    public void testTicketprice() {
        System.out.println("ticketprice");
        TrainRides instance = new TrainRides();
        instance.ticketprice();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of no of seats method, of class TrainRides.
     */
    @Test
    public void testNoofseats() {
        String expected = "";
        System.out.println("noofseats");
        TrainRides instance = new TrainRides();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        instance.noofseats();

    }

    /**
     * Test of trainRides method, of class TrainRides.
     */
    @Test
    public void testTrainRides() {
        System.out.println("trainRides");
        TrainRides.trainRides();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of seatNumber method, of class TrainRides.
     */
    @Test
    public void testSeatNumber() {
        System.out.println("seatNumber");
        String expResult = "FAXeZBc";
        String result = TrainRides.seatNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of speedCalculation method, of class TrainRides.
     */
    @Test
    public void testSpeedCalculation() {
        System.out.println("speedCalculation");
        double expResult = 0.0;
        double result = TrainRides.speedCalculation();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class TrainRides.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        TrainRides.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
