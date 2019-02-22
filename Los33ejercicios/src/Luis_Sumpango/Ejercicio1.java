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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        
        System.out.println("Ingresa un numero:.");
        numero = entrada.nextInt();
        
        if(numero >= 0 && numero <10000){
            if(numero >= 0 && numero <= 9)
            {
                System.out.println("El numero:. "+ numero+" tiene 1 cifra");
            }
            else if(numero >= 10 && numero <100)
            {
                System.out.println("El numero:. "+ numero +" tiene 2 cifras");
            }
            else if(numero >= 100 && numero <1000)
            {
                System.out.println("El numero:. "+ numero +" tiene 3 cifras");
            }
            else if(numero >= 1000 && numero <10000)
            {
                System.out.println("El numero:. "+ numero +" tiene 4 cifras");
            }
        }
        else
        {
            System.out.println("No valido.");
        }
        
    }
    
}
