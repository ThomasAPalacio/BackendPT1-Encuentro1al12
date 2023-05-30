//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, 
//sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un cuadrado 
//por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que 
//los números introducidos son correctos, es decir, están entre el 1 y el 9.
package Encuentro_9_10y11;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        int sumaFila = 0;
        int sumaColumn = 0;
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        int[] vectorDiagonal1 = new int[3];
        int[] vectorDiagonal2 = new int[3];
        int[] vectorFila = new int[3];
        int[] vectorColumn = new int[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese valores para la matriz");
                int valores = leer.nextInt();
                if (valores >= 1 && valores <= 9) {
                    matriz[i][j] = valores;
                } else {
                    System.out.println("Error");
                    break;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        //suma filas, columnas y diagonales 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    sumaDiagonal1 += matriz[i][j];
                }
                if (i + j == matriz.length - 1) {
                    sumaDiagonal2 += matriz[i][j];
                }
                sumaFila += matriz[i][j];
                sumaColumn += matriz[j][i];
            }
            vectorFila[i] = sumaFila;
            vectorColumn[i] = sumaColumn;
            sumaFila = 0;
            sumaColumn = 0;
            System.out.println(vectorFila[i] + " " + vectorColumn[i] + " " + sumaDiagonal1 + " " + sumaDiagonal2);
        }
        //vectorDiagonal1[0]=sumaDiagonal1;
        //vectorDiagonal2[1]=sumaDiagonal2;
        //vectorDiagonal2[0]=sumaDiagonal2;
        //vectorDiagonal1[1]=sumaDiagonal1;             
        //vectorDiagonal1[2]=sumaDiagonal1;
        //vectorDiagonal2[2]=sumaDiagonal2;

        for (int i = 0; i < vectorColumn.length; i++) {
            if (vectorFila[i] == vectorColumn[i] && vectorFila[i] == sumaDiagonal1 && vectorFila[i] == sumaDiagonal2) {
                System.out.println("La matriz es magicaa!! wii!!!");
            } else {
                System.out.println("La matriz no es magica");
            }
        }
    }
}
