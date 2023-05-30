//Escribir un programa que pida una frase y la muestre toda en mayúsculas
//y después toda en minúsculas.
//Nota: investigar la función toUpperCase() y toLowerCase() en Java.
package Encuentro_2y3;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase y se mostrara la frase completamente en minuscula y otra con solamente mayusculas:");
        frase = leer.nextLine();
        String mayus = frase.toUpperCase();
        String minus = frase.toLowerCase();
        System.out.println(mayus);
        System.out.println(minus);
        
    }
    
}
