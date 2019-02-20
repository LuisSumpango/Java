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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int año = 0;
        int mes = 0;
        int dia = 0;
        
        System.out.println("Ingrese el año:.");
        año = entrada.nextInt();
        System.out.println("Ingrese el mes:");
        mes = entrada.nextInt();
        System.out.println("Ingrese el dia:.");
        dia = entrada.nextInt();
        
        if (año > 0)
        {
            if(mes > 0 && mes <= 12){
                if (dia > 0 && dia <= 30)
                {
                    System.out.println("La fecha es correcta");
                }
                else
                {
                    System.out.println("La fecha es incorrecta");
                }
            }
            else
            {
                System.out.println("Fecha incorrecta");
            }
        }
        else
        {
            System.out.println("La fecha es incorrecta");
        }
    }
    
}
