/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo11group;

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
public class BungeJumpAdventureTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public BungeJumpAdventureTest() {
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
     * Test of ageLimit method, of class BungeJumpAdventure.
     */
    @Test
    public void testAgeLimit() {

        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.ageLimit();
        // TODO review the generated test code and remove the default call to fail.

        String expected = "the age limit is 20+ years";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of idProof method, of class BungeJumpAdventure.
     */
    @Test
    public void testIdProof() {
        //System.out.println("idProof");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.idProof();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "We need valid passport";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of safetyMeasures method, of class BungeJumpAdventure.
     */
    @Test
    public void testSafetyMeasures() {
        //System.out.println("safetyMeasures");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "For BungeJump you have to sign death wavier";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of lengthofjump method, of class BungeJumpAdventure.
     */
    @Test
    public void testLengthofjump() {
        //System.out.println("");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        instance.lengthofjump();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        String expected = "This a 100 meter jump";
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of duration method, of class BungeJumpAdventure.
     */
    @Test
    public void testDuration() {
        System.out.println("duration");
        BungeJumpAdventure instance = new BungeJumpAdventure();
        double expResult = 10.0;
        double result = instance.duration();
        assertEquals(expResult, result);
    }

   

}
