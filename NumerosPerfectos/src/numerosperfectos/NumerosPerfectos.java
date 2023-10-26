/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package numerosperfectos;

import java.util.Scanner;

/**
 *
 * @author Magdiel
 */
public class NumerosPerfectos {
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador=0;
        System.out.println("Entre un numero y le digo si es perfecto o no");
        n = sc.nextInt();
        if(n>=0){
            for(int i = 1; i<n;i++){
                if(n%i == 0)
                    contador +=i;
            }
        }else
            System.err.println("El valor no debe ser negativo");
        
        System.out.println(EsPerfecto(n,contador));   
    }
    public static String EsPerfecto(int n,int contador){
        if(n==contador)
            return "Perfecto";
        else
            return "No es perfecto";
    }
    
}
