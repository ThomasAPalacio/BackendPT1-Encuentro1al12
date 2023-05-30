//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos. 
//Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
//para averiguar la media de edad de los hijos de todas las familias.

package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extraa14 {

    public static void main(String[] args) {
        int N, M, i, j, edad;
        double prom;
        
        prom=0;
        edad=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de la cantidad de familias:");
        N = leer.nextInt();
        
        System.out.println("Cuantos hijos tiene cada familia:");
        M = leer.nextInt();
        
        for (i=0 ; i<N ; i++) {
            for (j=0 ; j<M ; j++) {
                System.out.println("Cuantos años tiene cada hijo?");
                edad = leer.nextInt();
                
                prom=prom+edad;
            }
        }
        
        System.out.println("La media de la edad de todos los hijos de las familias es: " + (prom / (N*M)));
        
    }
    
}
