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
public class e16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float TASA = (float) 0.025;
        float capital = (float) 0;
        float interes = (float) 0;
        
        System.out.println("Ingresa el capital:");
        capital = entrada.nextFloat();
        interes = (capital * TASA) *12;
        System.out.println("Tu interes es de:." + interes);
        
    }
    
}
