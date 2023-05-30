//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
//y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
package Encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio_guia3 {
    
    public static void main(String[] args) {
        int nota;
        
        Scanner leer = new Scanner(System.in);
        
         System.out.println("Ingrese una nota del 0 al 10");
         nota = leer.nextInt();
        
         while(nota < 0 || nota > 10){
        
            System.out.println("ERROR! esa nota no es valida, ingrese otra");
            nota = leer.nextInt();
            
        }
       
        System.out.println("FELICIDADES! la nota: " + nota + " es valida");
    }
    
}
