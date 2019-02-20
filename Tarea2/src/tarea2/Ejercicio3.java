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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero = 0;
        int necesario = 0;
        int al_reves = 0;
        int cantidad = 0;
        do
        {
            System.out.println("Ingrese un numero:.");
            numero = entrada.nextInt();
        } 
        while (numero < 10);
 
        //le damos la vuelta al número
        necesario = numero;
        while (necesario!=0){
            cantidad = necesario % 10;
            al_reves = al_reves * 10 + cantidad;
            necesario = necesario / 10;
        }
 
        if(numero == al_reves)
        {
            System.out.println("El numero es capicua:.");
        }else
        {
            System.out.println("El numero no es capicua");
        }
    }
}
