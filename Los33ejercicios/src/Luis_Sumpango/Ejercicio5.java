/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Luis_Sumpango;

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
        Scanner sc = new Scanner(System.in);
        int dia = 0;
        int mes = 0;
        int año = 0;
        System.out.println("Ingrese dia:.");
        dia = Integer.valueOf(sc.next());
        System.out.println("Ingrese mes:.");
        mes = Integer.valueOf(sc.next());
        System.out.println("Ingrese año:.");
        año = Integer.valueOf(sc.next());
        
        if(año > 0){
            if(mes == 1 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                if(dia > 0 && dia <= 31)
                {
                    System.out.println("La fecha:."+dia+"-"+mes+"-"+año+" es correcta (meses de 31 dias)");
                }
                else
                {
                    System.out.println("Dia invalido");
                }
            }
            else if(mes == 2)
            {
                if(dia > 0 && dia <= 28)
                {
                    System.out.println("La fecha:."+dia+"-"+mes+"-"+año+" es correcta (febrero)");
                }
                else
                {
                    System.out.println("dia invalido");
                }
            }
            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
            {
                if(dia > 0 && dia <= 30)
                {
                    System.out.println("La fecha:."+dia+"-"+mes+"-"+año+" es correcta (meses de 30 dias)");
                }
                else
                {
                    System.out.println("Dia invalido");
                }
            }
            else
            {
                System.out.println("El mes es invalido");
            }
        }
        else
        {
            System.out.println("El año es incorrecto");
        }
    }
    
}
