

package trabajo.equipo;

public class MCD {
    public static int result(int a,int b){
     if(b==0){
     return a;
     }
     return result(b,a%b);
        
    }
  // algoritmo para saber máximo común divisor 

}
