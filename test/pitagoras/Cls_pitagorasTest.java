/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 312C-17
 */
public class Cls_pitagorasTest {
    
    public Cls_pitagorasTest() {
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
     * Test of calcular_hipotenusa method, of class Cls_pitagoras.
     */
    @Test
    public void testCalcular_hipotenusa() {
        System.out.println("calcular_hipotenusa");
        double a = 3;
        double b = 4;
        double expResult = 5;
        double result = Cls_pitagoras.calcular_hipotenusa(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
