/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonacci;

/**
 *
 * @author admin
 */
public class Fibonacci {
    
    public int[] secuencia(int a){
        int sucesion[] = new int[a];
        sucesion[0] = 0;
        sucesion[1] = 1;
        for(int i=2; i<sucesion.length; i++){
            sucesion[i] = sucesion[i-1] + sucesion[i-2];
        } return sucesion;
    }
}
/*Comentario cuya unica utilidad es para hacer un nuevo commit en la tarea de 
gestión de software*/
