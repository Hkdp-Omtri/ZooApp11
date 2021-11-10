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
 * @author S545407
 */
public class FerrisWheelAdventureTest {

    public FerrisWheelAdventureTest() {
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
     * Test of toString method, of class FerrisWheelAdventure.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        String expResult = "FerrisWheelAdventure{noOfRotations=0, height=0.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNoOfRotations method, of class FerrisWheelAdventure.
     */
    @Test
    public void testGetNoOfRotations() {
        System.out.println("getNoOfRotations");
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        int expResult = 0;
        int result = instance.getNoOfRotations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNoOfRotations method, of class FerrisWheelAdventure.
     */
    @Test
    public void testSetNoOfRotations() {
        System.out.println("setNoOfRotations");
        int noOfRotations = 0;
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        instance.setNoOfRotations(noOfRotations);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHeight method, of class FerrisWheelAdventure.
     */
    @Test
    public void testGetHeight() {
        System.out.println("getHeight");
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        double expResult = 0.0;
        double result = instance.getHeight();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class FerrisWheelAdventure.
     */
    @Test
    public void testSetHeight() {
        System.out.println("setHeight");
        double height = 0.0;
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ageLimit method, of class FerrisWheelAdventure.
     */
    @Test
    public void testAgeLimit() {
        System.out.println("ageLimit");
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        instance.ageLimit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of idProof method, of class FerrisWheelAdventure.
     */
    @Test
    public void testIdProof() {
        System.out.println("idProof");
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        instance.idProof();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of safetyMeasures method, of class FerrisWheelAdventure.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of heightOfPole method, of class FerrisWheelAdventure.
     */
    @Test
    public void testHeightOfPole() {
        System.out.println("heightOfPole");
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        double expResult = 0.0;
        double result = instance.heightOfPole();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of experience method, of class FerrisWheelAdventure.
     */
    @Test
    public void testExperience() {
        System.out.println("experience");
        FerrisWheelAdventure instance = new FerrisWheelAdventure();
        instance.experience();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class FerrisWheelAdventure.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        FerrisWheelAdventure.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
