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
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        
        System.out.println("Ingrese el numero 1 positivo:. ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el numero 2 positivo:. ");
        numero2 = entrada.nextInt();
        System.out.println("Ingrese el numero 3 positivo:. ");
        numero3 = entrada.nextInt();
        int suma = numero1 + numero2 + numero3;
        int resta = numero1 - numero2 - numero3;
        int multiplicacion = numero1 * numero2 * numero3;
        
        if (suma > 0 && resta > 0 && multiplicacion > 0)
        {
            System.out.println("La suma de todos los numeros es de:. " + suma);
            System.out.println("La resta de todos los numeros es de:. " + resta);
            System.out.println("La multiplicacion de todos los numeros es de:. " + multiplicacion);
        }
        else
        {
            System.out.println("El resultado es negativo");
        }
        
    }
    
}
