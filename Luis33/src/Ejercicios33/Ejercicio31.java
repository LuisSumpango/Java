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
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero = (float) 0.0;
        float PI = (float) 3.1416;
        
        System.out.println("Ingrese el radio de un circulo:.");
        numero = entrada.nextFloat();
        System.out.println("El area de un ciruclo es de" + (numero*numero*PI));
    }
    
}
