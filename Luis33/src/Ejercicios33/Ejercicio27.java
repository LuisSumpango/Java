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
public class Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int año = 0;
        int fecha_de_nacimiento = 0;
        
        System.out.println("Ingrese el año actual:.");
        año = entrada.nextInt();
        System.out.println("Ingrese el año de nacimiento:.");
        fecha_de_nacimiento = entrada.nextInt();
        int edad = año-fecha_de_nacimiento;
        
        if (fecha_de_nacimiento > 0 && año > 0 && fecha_de_nacimiento < año)
        {
            System.out.println("Su edad actual:. " + edad);
        }
        else
        {
            System.out.println("La fecha es incorrecta");
        }
    }
    
}
