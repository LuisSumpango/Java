/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios33;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float sueldo = (float) 0.0;
        float AUMENTO = (float) 0.25;
        float nuevo_sueldo = (float) 0.0;
        
        System.out.println("Ingrese su sueldo");
        sueldo = entrada.nextFloat();
        nuevo_sueldo = (sueldo*AUMENTO)+sueldo;
        System.out.println("Su nuevo sueldo es de:. " + nuevo_sueldo);
        
    }
    
}
