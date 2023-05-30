//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
//con los valores ingresados por el usuario.

package Encuentro_9_10y11_Extra;

import java.util.Scanner;

public class Ejercicio_extra1 {

    public static void main(String[] args) {
       int N = 0, acum, i, num;
       
       acum=0;
       
        Scanner leer = new Scanner(System.in);
        
        int[] vector = new int[N];
        
        System.out.println("Ingrese un tamaño para el vector: ");
        N = leer.nextInt();
        
        for (i = 0; i < N; i++) {
            System.out.println("Llene el vector ingresando numeros: ");
           num = leer.nextInt();
            acum+=num;
        }
        System.out.println("La suma de los numeros ingresado son: " +acum);
    }
    
}
