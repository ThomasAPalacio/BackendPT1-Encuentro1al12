//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
//Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.

package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extra3 {

    public static void main(String[] args) {
        String letra;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Escriba una letra y el programa detectara si es una vocal o no:");
        letra = leer.next();
            
        while ((!letra.substring(0,1).equals("A")) && (!letra.substring(0,1).equals("E")) && (!letra.substring(0,1).equals("I")) && (!letra.substring(0,1).equals("O")) && (!letra.substring(0,1).equals("U"))) {
            
            System.out.println("ERROR! eso no es una vocal");
            letra = leer.next();
        }
        
        System.out.println("CORRECTO! eso es una vocal");
    }
    
}
