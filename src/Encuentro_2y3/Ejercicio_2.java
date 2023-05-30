//Escribir un programa que pida tu nombre, lo guarde en una variable y lo
//muestre por pantalla.
package Encuentro_2y3;

import java.util.Scanner;

public class Ejercicio_2 {
    
    public static void main(String[] args) {
       String nombrePersona;
       
       Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese un nombre:");
        nombrePersona = leer.nextLine();
        
        System.out.println("Hola!! " +nombrePersona+ " bienvenido a JAVA :D");
    }
    
}
