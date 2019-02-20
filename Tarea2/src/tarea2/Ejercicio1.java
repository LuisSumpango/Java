/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float numero = (float) 0.0;
        System.out.println("Ingrese un numero de 0 a 9999");
        numero = entrada.nextFloat();
        if (numero > -1 && numero < 10 )
        {
            System.out.println("El numero tiene solo 1 cifra");
        }
        else if (numero > 9 && numero < 100)
        {
            System.out.println("El numero tiene 2 cifras");
        }
        else if (numero > 99 && numero < 1000)
        {
            System.out.println("El numero tiene 3 cifras");
        }
        else if (numero > 999 && numero < 10000)
        {
            System.out.println("El numero tiene 4 cifras");
        }
        else
        {
            System.out.println("Valor fuera del rango");
        }
    }
    
}
