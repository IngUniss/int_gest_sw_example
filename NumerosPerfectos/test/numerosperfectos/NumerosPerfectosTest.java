/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numerosperfectos;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Magdiel
 */
public class NumerosPerfectosTest {
    
    @Test
    public void testEsPerfecto() {
        int n = 6,contador =6;
        String resultado = NumerosPerfectos.EsPerfecto(n, contador);
        Assert.assertEquals("Perfecto", resultado);
    }
    @Test
    public void testNoEsPerfecto() {
        int n = 8,contador =7;
        String resultado = NumerosPerfectos.EsPerfecto(n, contador);
        Assert.assertEquals("No es perfecto", resultado);
    }
    
}
