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
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1 = 0;
        int numero2 = 0;
        
        System.out.println("Ingrese el numero 1:. ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el numero 2:. ");
        numero2 = entrada.nextInt();
        
        if (numero1 >= 0 && numero2 >= 0)
        {
            int suma = numero1 + numero2;
            int multiplicacion = numero1 * numero2;
            System.out.println("La suma de:. " + numero1 + " + " + numero2 + " es de:. " + suma);
            System.out.println("La multiplicacion de:. " + numero1 + " * " + numero2 + " es de:. " + multiplicacion);
        }
        else
        {
            System.out.println("Los numeros deben de ser positivos");
        }
        
    }
    
}
