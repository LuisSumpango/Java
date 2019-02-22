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
public class Ejercicio33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float libras = (float) 0.0;
        float KILOGRAMOS = (float) 2.2046;
        
        System.out.println("Ingrese la cantidad en libras:. ");
        libras = entrada.nextInt();
        System.out.println("La cantidad en Kilogramos es de:. " + (libras*KILOGRAMOS));
    }
    
}
