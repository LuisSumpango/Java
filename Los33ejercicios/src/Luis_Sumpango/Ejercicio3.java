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
public class Ejercicio3 {

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
        if(numero >= 0 && numero <=9999){
            int longitud = String.valueOf(numero).length();
            aux = String.valueOf(numero);
            for(int i = (longitud); i-1 >= 0 ; i--)
            {    
                al_reves = al_reves + (aux.subSequence(i-1, i));    
            }
            if(Integer.valueOf(al_reves) == numero)
            {
                System.out.println("Los numeros son palindromos");
            }
            else
            {
                System.out.println("Los numeros no son palindromos");
            }
        }
        else
        {
            System.out.println("No esta en el rango");
        }
    }
    
}
