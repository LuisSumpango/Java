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
public class Ejerciciootro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String numero = "";
        String invertido = "";
        
        System.out.println("Ingrese un numero:.");
        numero = entrada.next();
        
        for (int x =numero.length()-1;x>=0;x--)
            invertido = invertido + numero.charAt(x);
        System.out.println(invertido);
    }
    
}
