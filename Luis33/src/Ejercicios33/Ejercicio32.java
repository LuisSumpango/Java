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
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float cm = (float) 0.0;
        float PULGADAS = (float) 0.39737;
        
        System.out.println("Ingrese la cantidad en centimetros:.");
        cm = entrada.nextFloat();
        System.out.println("La cantidad en Centimetros es de:. " + (cm*PULGADAS));
    }
    
}
