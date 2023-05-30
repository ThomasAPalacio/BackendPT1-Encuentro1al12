//Define una variable que aloje tu nombre y otra que guarde tu edad. 
//Imprime ambas variables por pantalla.
//Recomendamos que hagan el siguiente experimento: 
//tipear en minúsculas la palabra sout 
//y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
//Esto nos va a generar un System.out.println() para poder escribir lo que queramos.

package Encuentro_2y3_Extra;

import java.util.Scanner;

public class Ejercicio_extra4 {

    public static void main(String[] args) {
        String nombrePersona;
        String edad;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de una persona y se mostrara por pantalla");
        nombrePersona = leer.next();
        
        System.out.println("Ingrese la edad de una persona y se motrara por pantalla");
        edad = leer.next();
        
        System.out.println("La persona se llama: " +nombrePersona+ " y tiene: " +edad+ " años de edad");
        
    }
    
}
