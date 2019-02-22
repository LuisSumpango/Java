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
public class e8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        float Mo1 = (float) 0.05;
        float Mo2 = (float) 0.1;
        float Mo3 = (float) 0.12;
        float Mo4 = (float) 0.25;
        float Mo5 = (float) 0.50;
        float Mo6 = (float) 1;
        float mo1 = (float) 0;
        float mo2 = (float) 0;
        float mo3 = (float) 0;
        float mo4 = (float) 0;
        float mo5 = (float) 0;
        float mo6 = (float) 0;
        float total = (float) 0;
        System.out.println("Ingrese cantidad de monedas de 0.05:");
        mo1 = Float.valueOf(dato.next());
        System.out.println("Ingrese cantidad de monedas de 0.10:");
        mo2 = Float.valueOf(dato.next());
        System.out.println("Ingrese cantidad de monedas de 0.12:");
        mo3 = Float.valueOf(dato.next());
        System.out.println("Ingrese cantidad de monedas de 0.25:");
        mo4 = Float.valueOf(dato.next());
        System.out.println("Ingrese cantidad de monedas de 0.5:");
        mo5 = Float.valueOf(dato.next());
        System.out.println("Ingrese cantidad de monedas de 1:");
        mo6 = Float.valueOf(dato.next());
        total = (mo1 * Mo1) + (mo2 * Mo2) + (mo3 * Mo3) + (mo4 * Mo4) + (mo5 * Mo5) + (mo6 * Mo6); 
        System.out.println("Total: "+ total);
    }
    
}
