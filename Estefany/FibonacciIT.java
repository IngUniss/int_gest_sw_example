/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class FibonacciIT {
    
    public FibonacciIT() {
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
     * Test of main method, of class Fibonacci.
     */
    @Test
    public void testMain() {
        int a = 5;
        Fibonacci obj = new Fibonacci();
        int expResultado[] = {0, 1, 1, 2, 3};
        int result[] = obj.secuencia(a);
        assertArrayEquals(expResultado, result);
    }
    
}
