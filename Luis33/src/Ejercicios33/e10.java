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
public class e10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float MECU = (float)0.5;
        float largo = 0;
        float ancho = 0;
        
        System.out.println("Ingrese largo de la pared en metros:");
        largo = entrada.nextFloat();
        System.out.println("Ingrese ancho de la pared en metros:"); 
        ancho = entrada.nextFloat();
        System.out.println("La arena necesaria es:."+ ((largo * ancho )*MECU));
        
    }
    
}
