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
public class e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float PRECIO = (float)10.5;
        float km = (float)0.0;
        
        System.out.println("Ingres cantidad de km:.");
        km = entrada.nextFloat();
        System.out.println("Su total a pagar es:." + (km * PRECIO));
    }
    
}
