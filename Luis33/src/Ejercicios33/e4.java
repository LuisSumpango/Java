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
public class e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int DOLARES = 2150;
        int EUROS = 145;
        float dinero = (float)  0.0;
        System.out.println("Ingresa la cantidad a convertir:+");
        dinero = entrada.nextFloat();
        
        System.out.println("La conversion a Dolares es:."+(dinero * DOLARES));
        System.out.println("La conversion a Euro es:."+(dinero * EUROS));
    }
    
}
