/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorialpruebasunitarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Trabajos
 */
public class funcionesTest {
    
    public funcionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class funciones.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        int a = 1;
        int b = 1;
        funciones instance = new funciones();
        int expResult = 2;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class funciones.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        int a = 5;
        int b = 3;
        funciones instance = new funciones();
        int expResult = 2;
        int result = instance.restar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of miltiplicar method, of class funciones.
     */
    @Test
    public void testMiltiplicar() {
        System.out.println("miltiplicar");
        int a = 5;
        int b = 5;
        funciones instance = new funciones();
        int expResult = 25;
        int result = instance.miltiplicar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class funciones.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        int a = 25;
        int b = 5;
        funciones instance = new funciones();
        int expResult = 5;
        int result = instance.dividir(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
