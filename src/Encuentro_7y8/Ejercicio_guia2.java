//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que 
//el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, 
//sino informe que no lo son.

package Encuentro_7y8;

import java.util.Scanner;

public class Ejercicio_guia2 {
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero:");
        int num1 = leer.nextInt();
        
         System.out.println("Ingrese el segundo numero:");
        int num2 = leer.nextInt();
        
        esMultiplo(num1, num2);
        
    }
     public static void esMultiplo (int num1, int num2) {
         
         if ((num1 % num2) == 0) {
             System.out.println("Es MULTIPLO");
         } else {
             System.out.println("No es MULTIPLO");
         }
         
     }
}
