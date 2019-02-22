/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luis_Sumpango;

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
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        String aux = "";
        String al_reves = "";
        
        System.out.print("Ingrese el numero:.");
        numero = Integer.valueOf(entrada.next());
        
        if(numero >= 0 && numero < 10000){
            int longitud = String.valueOf(numero).length();
            aux = String.valueOf(numero);
            for(int i = (longitud); i-1 >= 0 ; i--)
            {  
                al_reves = al_reves + (aux.subSequence(i-1, i));    
            }
            System.out.println(al_reves);
        }
        else
        {
            System.out.println("Cifra fuera del rango");
        }
    }
    
}
