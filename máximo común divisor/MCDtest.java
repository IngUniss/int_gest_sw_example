

import junit.framework.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import trabajo.equipo.MCD;


public class MCDtest {
    private MCD obj;

   /* @Before
    public void constructor() {
        obj  = new MCD();
    }*/
    
    @Test
    public void testMCD() {
    int a = 8;
    int b = 12;
    int expresult =4;
    int result= MCD.result(a,b);
     assertEquals(expresult, result);
    }

   
   }

