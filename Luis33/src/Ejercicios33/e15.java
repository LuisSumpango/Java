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
public class e15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int años = 0;
        int meses = 0;
        int edad = 0;
        System.out.println("Ingresa años ");
        años = entrada.nextInt();
        System.out.println("Ingresa meses ");
        meses = entrada.nextInt();
        edad = (años * 12) + meses;
        System.out.println("tu edad en meses es:."+ edad);
        
    }
    
}
