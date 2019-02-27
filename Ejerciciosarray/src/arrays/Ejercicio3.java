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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer 10 numeros enteros y debemos mostrarlos de la siguiente manera
        //la primera posicion con la ultima posicion y asi
        Scanner entrada = new Scanner (System.in);
        int numeros[];
        numeros = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("introduzca un valor ");
            numeros[i] = Integer.valueOf(entrada.next());
        }
        System.out.println("los valores son");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("valor"+ numeros[i]+numeros[9-i]);
        }
    }
    
}
