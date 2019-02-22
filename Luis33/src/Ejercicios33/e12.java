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
public class e12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*calcular el nuevo salario de un empleado 
        si se le descuenta el 20% de su salario actual.*/
        Scanner dato = new Scanner(System.in);
        float DESCUENTO =(float) 0.20;
        float sueldo = 0;
        
        System.out.println("Ingresa tu sueldo actual:");
        sueldo = Float.valueOf(dato.next());
        System.out.println("Tu nuevo sueldo es: "+ (sueldo - (sueldo * DESCUENTO)));
    }
    
}
