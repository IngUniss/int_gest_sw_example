

import junit.framework.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import MaxComunDiv.MaxComunDiv;


public class MaxComunDivTest {
    private MaxComunDiv obj;

   /* @Before
    public void constructor() {
        obj  = new MCaxComunDiv();
    }*/
    
    @Test
    public void testMaxComunDiv() {
    int a = 8;
    int b = 12;
    int expresult =4;
    int result= MaxComunDiv.result(a,b);
     assertEquals(expresult, result);
    }

   
   }

