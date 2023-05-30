//Crear un programa que pida una frase y si esa frase es igual a “eureka” 
//el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
//Nota: investigar la función equals() en Java.
package Encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        String palabra;
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Intente adivinar la palabra secreta: ");
        palabra = leer.next();

        if (palabra.equals("eureka")) {
            System.out.println("CORRECTO! adivino la palabra secreta :D");
        }else{
            System.out.println("INCORRECTO! no puedo adivinar la palabra secreta D:");
            palabra = leer.next();
        }
                
        
    }

}
