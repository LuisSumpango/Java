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
public class e19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int total = 0;
        
        System.out.println("Ingresa nota1:.");
        nota1 = entrada.nextInt();
        System.out.println("Ingresa nota2:.");
        nota2 = entrada.nextInt();
        System.out.println("Ingresa nota3:.");
        nota3 = entrada.nextInt();
        
        total = nota1 + nota2 + nota3;
        System.out.println("Tu nota final es:" + total);
    }
    
}
