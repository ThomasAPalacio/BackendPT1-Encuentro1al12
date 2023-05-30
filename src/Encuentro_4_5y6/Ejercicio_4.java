//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
//Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
//en caso contrario, se debera imprimir “INCORRECTO”. 
//Nota: investigar la funcion Substring y equals() de Java.

package Encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio_4 {
    
    public static void main(String[] args) {
        String frase;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase que tenga una A en el principio");
        frase = leer.next();
        
        if (frase.substring(0,1).equals("A")) {
            System.out.println("CORRECTO!");
        }else{
            System.out.println("INCORRECTO!");
    }
    }
    }
