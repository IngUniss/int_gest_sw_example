package javaapplication1;

public class Num_Triangulares {
    public boolean triangulares(int a, int b, int c){
        if(a<=0 || b<=0 || c<=0)
            return false;
        
        if((a + b + c) > 180)
            return false;
        
        if((a + b + c) == 180)
            return true;
        
        return false;
    }
}
