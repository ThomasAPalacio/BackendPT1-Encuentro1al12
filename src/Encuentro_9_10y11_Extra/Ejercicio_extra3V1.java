//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
//Después haremos otra función o procedimiento que imprima el vector.
package Encuentro_9_10y11_Extra;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_extra3V1 {

    public static void main(String[] args) {
        int n;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un tamaño para el vector: ");
        n = leer.nextInt();
        
        int[] vector = new int[n];
        
        rellenarVector(vector);
        imprimirVector(vector);
        
    }
    public static void rellenarVector(int[] vector) {
        
        Random rand = new Random();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = 1+ rand.nextInt(10); 
        }
        
    }
    
    public static void imprimirVector(int[] vector) {
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
        }
        
        System.out.println(" ");
    }
}
