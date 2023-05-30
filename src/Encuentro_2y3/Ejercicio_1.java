 //Escribir un programa que pida dos números enteros por teclado y calcule
 //la suma de los dos. El programa deberá después mostrar el resultado de
 //la suma 
 
package Encuentro_2y3;

import java.util.Scanner;

public class Ejercicio_1 {

   
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero uno:");
        num1= leer.nextInt();
        
        System.out.println("Ingrese el numero dos:");
        num2= leer.nextInt();
        
        System.out.println("El resultado de la suma es: " +(num1+num2));
    }
    
}
