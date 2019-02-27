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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer 5 numeros y mostrarlos en el mismo orden ingresado
        Scanner entrada = new Scanner(System.in);
        int numeros[];
        numeros = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero ");
            numeros[i] = Integer.valueOf(entrada.next());
        }
        System.out.println("Los valores son ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
