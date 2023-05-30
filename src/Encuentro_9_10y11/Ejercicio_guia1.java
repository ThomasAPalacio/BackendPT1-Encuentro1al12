//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
//y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
package Encuentro_9_10y11;

import java.util.Scanner;

public class Ejercicio_guia1 {

    public static void main(String[] args) {
        int i;
        String [] nombres = new String [5];
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los nombres de su grupo:");
        
        for (i=0 ; i<5 ; i++) {
            nombres[i] = leer.next();
        }
        
        System.out.println("Los nombres del grupo son: ");
        
        for (i=0 ; i<5 ; i++) {
            if (i==4) {
                System.out.println( "y " + nombres[i]);
            } else {
                System.out.print(nombres[i] + ", ");
            }
        }
        
    }
    
}
