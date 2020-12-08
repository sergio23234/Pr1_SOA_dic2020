/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.prueba1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergi
 */
public class loginpruebaTest {
    
    public loginpruebaTest() {
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
     * Test of pruebalogin method, of class loginprueba.
     */
    @Test
    public void testPruebalogin() {
        System.out.println("pruebalogin");
        String nombre = "sergio";
        String contra = "contra1";
        loginprueba instance = new loginprueba();
        String expResult = "sergio__contra";
        String result = instance.pruebalogin(nombre, contra);
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
