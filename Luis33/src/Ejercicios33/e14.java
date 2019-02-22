/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios33;

import java.util.Scanner;

/**
 *
 * @author Luis_Sumpango
 */
public class e14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int respuesta = 0;
        
        System.out.println("Ingresa el numero1:");
        numero1 = Integer.valueOf(entrada.next());
        System.out.println("Ingresa el numero2:");
        numero2 = Integer.valueOf(entrada.next());
        System.out.println("Ingresa el numero3:");
        numero3 = Integer.valueOf(entrada.next());
        
        respuesta = Integer.valueOf(String.valueOf(numero1)+String.valueOf(numero2)+String.valueOf(numero3));
        System.out.println("El resultado es:" + respuesta);
    }
    
}
