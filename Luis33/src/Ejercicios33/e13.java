/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios33;

import java.util.Scanner;

/**
 *
 * @author Luis_Sumpango
 */
public class e13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int sumaC = 0;
        int proC = 0;
        
        System.out.println("Ingresa el primer numero:");
        numero1 = entrada.nextInt();
        System.out.println("Ingresa el primer numeroS:");
        numero2 = entrada.nextInt();
        sumaC = (numero1 * 2) + (numero2 *numero2);
        proC = ((numero1 * numero1 * numero1)+(numero2 * numero2 * numero2))/3;
        
        System.out.println("La primera operacion es: " + sumaC);
        System.out.println("La segunda operacion es: " + proC);
    }
    
}
