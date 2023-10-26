package triangulos;


import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author ADDIEL
 */
public class TriangulosTest {
//Este es para el rectangulo
    @Test
    public void testTrianguloRectangulo(){
        int a = 90,b = 45,c = 45;
        String resultado = Triangulos.tipoTriangulo(a,b,c);
        Assert.assertEquals("triangulo rectangulo", resultado);
        }
//Este es para el obtusangulo
        @Test
        public void testTrianguloObtusangulolo(){
        int a = 100,b = 40,c = 40;
        String resultado = Triangulos.tipoTriangulo(a, b, c);
        Assert.assertEquals("triangulo obtusangulo", resultado);
        }
//Este es para el acutangulo
        @Test
        public void testTrianguloAcutangulo(){
        int a = 60, b = 60,c = 60;
        String resultado = Triangulos.tipoTriangulo(a,b,c);
        Assert.assertEquals("triangulo acutangulo", resultado);
        }
        
        
    
}
