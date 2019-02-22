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
public class Ejercicios24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float peso = (float) 0.0;
        float GRAMOS = (float)1000;
        float LIBRAS = (float) 2.20462;
        float TONELADAS = (float) 0.001;
        
        System.out.println("Ingrese el peso en Kilos:.");
        peso = entrada.nextFloat();
        System.out.println("Su peso en Gramos:. " + peso*GRAMOS);
        System.out.println("Su peso en libras:. " + peso*LIBRAS);
        System.out.println("Su peso en toneladas:. " + peso*TONELADAS);
    }
    
}
