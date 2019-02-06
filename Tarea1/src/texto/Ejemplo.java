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
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingresar = new Scanner (System.in);
        int valor1 = 0;
        System.out.println("Ingrese un valor ");
        //valor1 = entrar.next();
        valor1 = Integer.valueOf(ingresar.next());
        
        float valor2 = (float) 0.0;
        System.out.println("Ingrese un valor:. ");
        valor2 = Float.valueOf(ingresar.next());
        
        double valor3 = 0;
        System.out.println("Ingrese un valor");
        valor3 = Double.valueOf(ingresar.next());
    }
    
}
