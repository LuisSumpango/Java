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
public class e6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float AUMENTO = (float) 0.08;
        float DESCUENTO = (float) 0.025;
        float sueldo = (float) 0;
        float aumentos = (float) 0;
        float descuentos = (float) 0;
        
        System.out.println("Ingresa tu sueldo:.");
        sueldo = entrada.nextFloat();
        aumentos = sueldo * AUMENTO;
        descuentos = sueldo * DESCUENTO;
        System.out.println("Tu descuento es: "+ (descuentos));
        System.out.println("Tu aumento es:" + (aumentos));
        System.out.println("Tu sueldo actual:." + ((sueldo - descuentos)+ aumentos));
        
    }
    
}
