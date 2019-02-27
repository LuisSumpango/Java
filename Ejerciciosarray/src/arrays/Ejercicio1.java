/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer 5 numeros y mostrarlos en orden inverso al introducido
        Scanner escaner = new Scanner(System.in);
        int arreglo[];
        arreglo = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("introduzca un valor ");
            arreglo[i] = Integer.valueOf(escaner.next());
        }
        
        System.out.println("Los valores son");
        
        for (int i = 4; i >=  0; i--) {
            System.out.println(arreglo[i]);
        }
    }
    
}
