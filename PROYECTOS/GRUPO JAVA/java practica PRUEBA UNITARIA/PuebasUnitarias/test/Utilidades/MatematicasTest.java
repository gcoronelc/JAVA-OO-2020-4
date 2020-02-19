/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Utilidades;

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
public class MatematicasTest {
    
    public MatematicasTest() {
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
     * Test of mayor method, of class Matematicas.
     */
    @org.junit.Test
    public void testMayor() {
        System.out.println("mayor");
        double n1 = 0.0;
        double n2 = 0.0;
        double expResult = 0.0;
        double result = Matematicas.mayor(n1, n2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of esNumeroPrimo method, of class Matematicas.
     */
    @org.junit.Test
    public void testEsNumeroPrimo() {
        System.out.println("esNumeroPrimo");
        int n = 0;
        boolean expResult = false;
        boolean result = Matematicas.esNumeroPrimo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
