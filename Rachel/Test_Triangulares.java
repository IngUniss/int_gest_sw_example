package javaapplication1;

import junit.framework.TestCase;

public class Test_Triangulares extends TestCase{
    private Num_Triangulares tri;
    
    public void setUp(){
        tri = new Num_Triangulares();
    }
    
    @org.junit.Test
    public void test1(){
        assertTrue(tri.triangulares(100, 40, 40) == true);
    }
    @org.junit.Test
    public void test2(){
        assertTrue(tri.triangulares(-20, -90, 70) == false);
    }
    @org.junit.Test
    public void test3(){
        assertTrue(tri.triangulares(100, 0, 80) == false);
    }
    @org.junit.Test
    public void test4(){
        assertTrue(tri.triangulares(60, 60, 60) == true);
    }
    @org.junit.Test
    public void test5(){
        assertTrue(tri.triangulares(100, 100, 100) == false);
    }
}
