/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package texto;

/**
 *
 * @author luis
 */
public class operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        int division = 0;
        suma = a + b + c;
        resta = a - b - c;
        division = b/a;
        multiplicacion = b*a*c;
        System.out.println("La suma es:. "+ suma);
        
        System.out.println("La division de"+ b + "/" + a + "es "+ division);
        
        System.out.println("La multiplicacion de todos los numeros es de: "+ multiplicacion);
        
        System.out.println("La resta es:. "+ resta);
    }
    
}
