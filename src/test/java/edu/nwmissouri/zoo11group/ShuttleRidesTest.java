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
 * @author S545027
 */
public class ShuttleRidesTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public ShuttleRidesTest() {
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
     * Test of testTicketprice method, of class ShuttleRides.
     */
    @Test
    public void testTicketprice() {
        //System.out.println("ticketprice");
        ShuttleRides instance = new ShuttleRides();
        instance.ticketprice();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "The ticket price is $10";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of testNoofseats method, of class ShuttleRides.
     */
    @Test
    public void testNoofseats() {
        //System.out.println("noofseats");
        ShuttleRides instance = new ShuttleRides();
        instance.noofseats();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "The number of seats is six";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of testShuttletype method, of class ShuttleRides.
     */
    @Test
    public void testShuttletype() {
        //System.out.println("shuttletype");
        ShuttleRides instance = new ShuttleRides();
        instance.shuttletype();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "This a minivan";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}
