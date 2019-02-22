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
public class e9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float precio = (float) 0.0;
        int horas = 0;
        int horas_extra = 0;
        
        System.out.println("Ingresa precio de hora:");
        precio = entrada.nextFloat();
        System.out.println("Ingresa horas trabajadas:.");
        horas = entrada.nextInt();
        System.out.println("Ingresa horas extra trabajadas:.");
        horas_extra = entrada.nextInt();
        
        System.out.println("Tu sueldo es:."+ ((precio * horas) +(precio * (horas_extra * 2))));
    }
    
}
