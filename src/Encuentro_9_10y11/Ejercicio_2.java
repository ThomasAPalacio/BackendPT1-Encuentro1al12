//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
//y le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra 
//el numero y si se encuentra repetido
package Encuentro_9_10y11;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int i, num;        

        Scanner leer = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Ingrese un tamaño del vector");
        int N = leer.nextInt();

        int[] vector = new int[N];

        for (i = 0; i < N; i++) {
            vector[i] = rand.nextInt(100);
            System.out.println(vector[i]);
        }

        System.out.println("Ingrese un numero a buscar dentro del vector:");
        num = leer.nextInt();

        boolean encontrado = false;
        
        for (i = 0; i < N; i++) {
            if (vector[i] == num) {
                System.out.println("El numero buscado se encuentra en la posicion: " + i + " del vector");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("El numero que ingreso para buscar no se encuentra...");
        }
    }

}
