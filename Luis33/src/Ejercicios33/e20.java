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
public class e20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hombres = 0;
        int mujeres = 0;
        int total = 0;
        
        System.out.println("Ingresa la cantidad de hombres:");
        hombres = entrada.nextInt();
        System.out.println("Ingresa la cantidad de mujeres:");
        mujeres = entrada.nextInt();
        total = hombres + mujeres;
        
        System.out.println("El porcentaje de mujeres es:" + ((mujeres *100) / total));
        System.out.println("El porcentaje de hombres es:" + ((hombres *100) / total));
    }
    
}
