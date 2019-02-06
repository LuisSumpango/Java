/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        String producto = "";
        float total = 0;
        float precio = 0;
        
        while (precio >= 0)
        {
            System.out.println("Ingrese el nombre del producto:.");
            producto = ingresar.next();
            System.out.println("Ingrese el precio del producto:.");
            precio = ingresar.nextFloat();
            
            if (precio >= 1)
            {
                total = (total+precio);
            }
                
        }
        System.out.println("El total es de:"+ total);
        if (total >= 1500)
        {
            System.out.println("Con el descuento el total es de:."+ (total*0.1));    
        }
        else if (total >= 500)
        {
            System.out.println("Con el descuento el total es de:."+ (total*0.05));
        }
        
        
        
    }
    
}
