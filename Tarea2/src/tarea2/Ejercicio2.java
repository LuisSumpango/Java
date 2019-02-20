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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero = 0;
        int modular = 0;
        int respuesta = 0;
        System.out.println("Ingrese un numero entre el rango de 0 a 9999:.");
        numero = entrada.nextInt();
        while (numero != 0)
        {
            modular = numero % 10;
            numero = numero / 10;
            respuesta = respuesta * 10 + modular;
        }
        System.out.println(respuesta);
    }
    
}
