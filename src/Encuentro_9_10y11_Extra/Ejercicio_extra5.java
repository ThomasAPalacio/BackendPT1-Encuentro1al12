//Realizar un programa que llene una matriz de tamaño NxM con valores aleatorios 
//y muestre la suma de sus elementos.
package Encuentro_9_10y11_Extra;

import java.util.Scanner;

public class Ejercicio_extra5 {

    public static void main(String[] args) {
        int N, M, suma = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño de la matriz:");
        N = leer.nextInt();

        System.out.println("Ingrese la cantidad de columnas:");
        M = leer.nextInt();

        int[][] matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 9) + 1;
                suma += matriz[i][j];
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("La suma es: " +suma);

    }

}
