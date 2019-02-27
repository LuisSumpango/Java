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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leer por teclado dos arreglos de 10 numeros enteros y mezclar
        
        Scanner entrada = new Scanner (System.in);
        
        int a[];
        int a2[];
        int a3[];
        
        a = new int [10]; 
        a2 = new int [10]; 
        a3 = new int [20];
        
        System.out.println("Ingrese el un numero:.");
        for (int i = 0; i < 10; i++){
            System.out.println((i+1)+" Ingrese un numero:.");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("Segundo arreglo:.");
        for (int i = 0; i < 10; i++){
            System.out.println((i+1)+" Ingrese un numero");
            a2[i] = entrada.nextInt();
        }
        
        int j=0;
        for (int i = 0; i < 10; i++){
            a3[j] = a[i];
            j++;
            a3[j] = a2[i];
            j++;
        }
        System.out.println("");
        System.out.println("El ultimo arreglo es:.");
        for(int i = 0; i < 20; i++){
            System.out.println(a3[i]+"");
        }
        System.out.println("");
    }
    
}
