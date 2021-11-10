/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo11group;

import java.util.ArrayList;
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
 * @author Maddelavedu Pravallika(S545254)
>>>>>>> 847f39f46648749a16844ced7488ab0d5725c9df
 */
public class SkyRidesTest {
    
    public SkyRidesTest() {
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
     * Test of toString method, of class SkyRides.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SkyRides instance = new SkyRides();
        String expResult = "SkyRides{Price=0.0, Miles=0.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class SkyRides.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        SkyRides instance = new SkyRides();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class SkyRides.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double Price = 0.0;
        SkyRides instance = new SkyRides();
        instance.setPrice(Price);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMiles method, of class SkyRides.
     */
    @Test
    public void testGetMiles() {
        System.out.println("getMiles");
        SkyRides instance = new SkyRides();
        double expResult = 0.0;
        double result = instance.getMiles();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMiles method, of class SkyRides.
     */
    @Test
    public void testSetMiles() {
        System.out.println("setMiles");
        double Miles = 0.0;
        SkyRides instance = new SkyRides();
        instance.setMiles(Miles);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMyGroup method, of class SkyRides.
     */
    @Test
    public void testGetMyGroup() {
        System.out.println("getMyGroup");
        ArrayList<SkyRides> expResult = null;
        ArrayList<SkyRides> result = SkyRides.getMyGroup();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMyGroup method, of class SkyRides.
     */
    @Test
    public void testSetMyGroup() {
        System.out.println("setMyGroup");
        ArrayList<SkyRides> myGroup = null;
        SkyRides.setMyGroup(myGroup);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ticketprice method, of class SkyRides.
     */
    @Test
    public void testTicketprice() {
        System.out.println("ticketprice");
        SkyRides instance = new SkyRides();
        instance.ticketprice();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class SkyRides.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        SkyRides.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of noofseats method, of class SkyRides.
     */
    @Test
    public void testNoofseats() {
        System.out.println("noofseats");
        SkyRides instance = new SkyRides();
        instance.noofseats();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of skyrides method, of class SkyRides.
     */
    @Test
    public void testSkyrides() {
        System.out.println("skyrides");
        SkyRides instance = new SkyRides();
        instance.skyrides();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compartment method, of class SkyRides.
     */
    @Test
    public void testCompartment() {
        System.out.println("compartment");
        SkyRides instance = new SkyRides();
        double expResult = 0.0;
        double result = instance.compartment();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of timeLimit method, of class SkyRides.
     */
    @Test
    public void testTimeLimit() {
        System.out.println("timeLimit");
        SkyRides instance = new SkyRides();
        instance.timeLimit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
