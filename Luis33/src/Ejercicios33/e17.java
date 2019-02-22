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
public class e17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float TASA = (float) 0.10;
        float sueldo = (float) 0;
        float venta1 = (float) 0;
        float venta2 = (float) 0;
        float venta3 = (float) 0;
        float remuneracion = (float) 0;
        
        System.out.println("Ingrese sueldo base:");
        sueldo = entrada.nextFloat();
        System.out.println("Ingrese valor de la primera venta:");
        venta1 = entrada.nextFloat();
        System.out.println("Ingrese valor de la segunda venta:");
        venta2 = entrada.nextFloat();
        System.out.println("Ingrese valor de la tercera venta:");
        venta3 = entrada.nextFloat();
        
        remuneracion = (venta1 + venta2 + venta3) * TASA;
        
        System.out.println("Tu sueldo es: " + sueldo);
        System.out.println("tu comision es: "+ remuneracion);
        System.out.println("Total:"+ (sueldo+remuneracion));
        
    }
    
}
