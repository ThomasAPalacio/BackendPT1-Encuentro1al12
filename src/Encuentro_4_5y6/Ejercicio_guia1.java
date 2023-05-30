//Implementar un programa que le pida dos números enteros al usuario y
//determine si ambos o alguno de ellos es mayor a 25.
package Encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio_guia1 {

    public static void main(String[] args) {
      int num1, num2;
      
      Scanner leer = new Scanner (System.in);
      
        System.out.println("Ingrese un numero");
        num1 = leer.nextInt();
        
        System.out.println("Ingrese un numero");
        num2 = leer.nextInt();
        
        if (num1>25) {
        System.out.println("El primer numero que ingreso es mayor al numero 25");
        
        } else {
                
        } if (num2>25) { 
        System.out.println("El segundo numero que ingreso es mayor al numero 25");
            
        } else {
            
        } if (num1>25 && num2>25) {
                System.out.println("Ambos numeros que ingreso son mayores a 25");
            
        } else {
            
        } if (num1<25 && num2<25)
            System.out.println("Ambos numeros que ingreso son menores a 25");
    }
    
    }
