/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

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
        
        char letras[] = new char[26];
        for (int i = 65, x = 0; i <= 90; i++, x++)
        {
            letras[x] = (char) i;
        }   
        
        String texto = "";
        int decision = -1;
        
        do
        {
            System.out.println("Elija un indice rango entre 0 y"+(letras.length -1));
            decision = Integer.valueOf(entrada.next());
            
            if (!(decision >= 0 && decision <= letras.length -1))
            {
                System.out.println("El numero ingresado esta fuera del alcance de lo establecido");
            }
            else
            {
                if (decision != -1)
                {
                    texto += letras[decision];
                }
            }
        } while (decision != -1);
        System.out.println(texto);
        
    }
    
}
