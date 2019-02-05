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
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fecnac = 0;
        int FECAC = 2019;
        int edad = 0;
        System.out.println("Ingresa tu año de nacimiento");
        fecnac = sc.nextInt();
        
        edad = FECAC - fecnac;
        System.out.println("Tu edad es:. "+ edad);
    }
    
}
