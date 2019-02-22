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
public class Ejercicio28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float precio = (float) 0.0;
        float cantidad = (float) 0.0;
        float IVA = (float) 0.09;
        
        System.out.println("Ingrese el precio del producto:. ");
        precio = entrada.nextFloat();
        System.out.println("Ingrese la cantidad de productos:.");
        cantidad = entrada.nextFloat();
        
        if (precio > 0 && cantidad > 0)
        {
            System.out.println("El precio unitario es de:. " + (precio-(precio*IVA)));
            System.out.println("El el total a pagar es de:. " + ((cantidad*precio)-(cantidad*precio*IVA)));
        }
        else
        {
            System.out.println("Productos o precio invalidos");
        }
    }
    
}
