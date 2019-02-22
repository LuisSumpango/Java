/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios33;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float nota1 = (float) 0.0;
        float nota2 = (float) 0.0;
        float nota3 = (float) 0.0;
        float promedio = (float) 0.0;
        
        System.out.println("Ingrese la nota No.1:. ");
        nota1 = entrada.nextFloat();
        System.out.println("Ingrese la nota No.2:. ");
        nota2 = entrada.nextFloat();
        System.out.println("Ingrese la nota No.3:. ");
        nota3 = entrada.nextFloat();
        promedio = (nota1+nota2+nota3)/3;
        
        if (promedio >=  16)
        {
            System.out.println("El promedio total es de 20 y Gano");
        }
        else if(promedio >= 9.5)
        {
            System.out.println("Aprobado:. " + promedio);
        }
        else if (promedio > 0)
        {
            System.out.println("Desaprobado:. " + promedio);
        }
        else
        {
            System.out.println("El valor es negativo");
        }
    }
    
}
