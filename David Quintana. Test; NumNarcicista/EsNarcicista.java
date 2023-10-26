package javaapplication1;

public class EsNarcicista {
   public boolean narcicista(int n){
    int aux = n;
       int suma = 0;
       String s = ""+n;
       
       while (aux != 0) {           
           suma += (int) Math.pow(aux % 10, s.length());
           aux /= 10;
       }
       if (n == suma)
           return true;
       return false;
   }
}
