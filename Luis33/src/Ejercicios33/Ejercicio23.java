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
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero = (float) 0.0;
        
        System.out.println("Ingrese el numero que desea elevar al cubo:. ");
        numero = entrada.nextFloat();
        
        System.out.println("El resultado es de:. " + Math.pow(numero, 3));
    }
    
}
