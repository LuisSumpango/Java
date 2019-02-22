/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios33;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float metros = (float) 0.0;
        float PIES = (float) 3.28;
        float PULGADAS = (float) 39.37;
        
        System.out.println("Ingrese la distancia en metros:.");
        metros = entrada.nextFloat();
        System.out.println("La distancia en Pies es de:. " + (metros*PIES));
        System.out.println("La distancia en Pulgadas es de:. " + (metros*PULGADAS));
        
    }
    
}
