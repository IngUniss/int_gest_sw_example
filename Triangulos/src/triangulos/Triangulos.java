/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangulos;

import java.util.Scanner;

/**
 *
 * @author ADDIEL
 */
public class Triangulos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Angulo 1:");
        a=sc.nextInt();
        System.out.println("Angulo 2:");
        b=sc.nextInt();
        System.out.println("Angulo 3:");
        c=sc.nextInt();
        if(a+b+c==180)
            System.out.println(tipoTriangulo(a,b,c));
        else
            System.err.println("La suma de los angulos debe medir 180");
        
    }
    public static String tipoTriangulo(int a, int b, int c){
        if(a==90||b==90||c==90)
            return "triangulo rectangulo";
        else if(a>90||b>90||c>90)
            return "triangulo obtusangulo";
        else
            return "triangulo acutangulo";
            
    }
    
        
    
}
