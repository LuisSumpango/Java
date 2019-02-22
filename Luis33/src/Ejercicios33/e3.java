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
public class e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double PRECIO = 1.5;
        int horas = 0;
        int gratis = 0;
        System.out.println("Ingrese la cantidad de horas utilizada:.");
        horas = entrada.nextInt();
        
        gratis = (horas / 5);
        System.out.println("Tu total a pagar es de:." + (horas * PRECIO));
        System.out.println("por el uso de internet obtuviste "+ gratis + " horas gratis");
        
        
    }
    
}
