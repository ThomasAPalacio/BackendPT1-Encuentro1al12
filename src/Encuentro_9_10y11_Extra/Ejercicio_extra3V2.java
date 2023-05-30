//Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
//Después haremos otra función o procedimiento que imprima el vector.
package Encuentro_9_10y11_Extra;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_extra3V2 {

    public static void main(String[] args) {
        int n;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un tamaño para el vector: ");
        n = leer.nextInt();

        int[] vector = new int[n];

        vector = rellenarVector(n);
        System.out.println(imprimirVector(vector));

    }

    public static int[] rellenarVector(int n) {
        int[] vector = new int[n];
        Random rand = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = 1 + rand.nextInt(10);
        }
        return vector;
    }

    public static String imprimirVector(int[] vector) {
        String res = "";
        for (int i = 0; i < vector.length; i++) {
            res += vector[i] + " "; 
        }
        return res;
    } 
}