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
 * @author Pravallika(S545254)
 */
public class RollerCoasterAdventureTest {
    
    public RollerCoasterAdventureTest() {
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
     * Test of toString method, of class RollerCoasterAdventure.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        String expResult = "RollerCoasterAdventure{nameOfThePerson=null, isCondition=false}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNameOfThePerson method, of class RollerCoasterAdventure.
     */
    @Test
    public void testGetNameOfThePerson() {
        System.out.println("getNameOfThePerson");
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        String expResult = "";
        String result = instance.getNameOfThePerson();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNameOfThePerson method, of class RollerCoasterAdventure.
     */
    @Test
    public void testSetNameOfThePerson() {
        System.out.println("setNameOfThePerson");
        String nameOfThePerson = "";
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        instance.setNameOfThePerson(nameOfThePerson);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isIsCondition method, of class RollerCoasterAdventure.
     */
    @Test
    public void testIsIsCondition() {
        System.out.println("isIsCondition");
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        boolean expResult = false;
        boolean result = instance.isIsCondition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIsCondition method, of class RollerCoasterAdventure.
     */
    @Test
    public void testSetIsCondition() {
        System.out.println("setIsCondition");
        boolean isCondition = false;
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        instance.setIsCondition(isCondition);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ageLimit method, of class RollerCoasterAdventure.
     */
    @Test
    public void testAgeLimit() {
        System.out.println("ageLimit");
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        instance.ageLimit();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of idProof method, of class RollerCoasterAdventure.
     */
    @Test
    public void testIdProof() {
        System.out.println("idProof");
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        instance.idProof();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of safetyMeasures method, of class RollerCoasterAdventure.
     */
    @Test
    public void testSafetyMeasures() {
        System.out.println("safetyMeasures");
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        instance.safetyMeasures();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of condition method, of class RollerCoasterAdventure.
     */
    @Test
    public void testCondition() {
        System.out.println("condition");
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        boolean expResult = false;
        boolean result = instance.condition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of color method, of class RollerCoasterAdventure.
     */
    @Test
    public void testColor() {
        System.out.println("color");
        RollerCoasterAdventure instance = new RollerCoasterAdventure();
        instance.color();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class RollerCoasterAdventure.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        RollerCoasterAdventure.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
