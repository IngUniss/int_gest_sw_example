

package MaxComunDiv;

public class MaxComunDiv {
    public static int result(int a,int b){
     if(b==0){
     return a;
     }
     return result(b,a%b);
        
    }

// Funcion para hallar maximo comun divisor
}
