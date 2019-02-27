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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** Leer 5 números por teclado y a continuación 
        realizar la media de los números positivos, 
        la media de los negativos y contar el número de ceros.*/
        Scanner entrada = new Scanner (System.in);
        int numeros[];
        numeros = new int[5];
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("introduzca un valor ");
            numeros[i] = Integer.valueOf(entrada.next());
            if(numeros[i] > 0){
                positivos++;
            }
            else if(numeros[i] < 0){
                negativos++;
            }
            else{
                ceros++;
            }
        }
        
        System.out.println("La cantidad de positivos es "+ positivos);
        System.out.println("La cantidad de negativos es "+ negativos);
        System.out.println("La cantidad de ceros es "+ ceros);
    }
    
}
