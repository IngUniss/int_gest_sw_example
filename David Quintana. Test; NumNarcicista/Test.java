package javaapplication1;

import javaapplication1.EsNarcicista;
import junit.framework.TestCase;


public class Test extends TestCase{
    private EsNarcicista es;
    
    public void setUp(){
        es = new EsNarcicista();
    }
    
    @org.junit.Test
    public void test1(){
        assertTrue(es.narcicista(153) == true);
    }
    @org.junit.Test
    public void test2(){
        assertTrue(es.narcicista(370) == true);
    }
    @org.junit.Test
    public void test3(){
        assertTrue(es.narcicista(407) == true);
    }
    @org.junit.Test
    public void test4(){
        assertTrue(es.narcicista(12) == false);
    }
    @org.junit.Test
    public void test5(){
        assertTrue(es.narcicista(6) == true);
    }@org.junit.Test
    public void test6(){
        assertTrue(es.narcicista(999999) == false);
    }
}
