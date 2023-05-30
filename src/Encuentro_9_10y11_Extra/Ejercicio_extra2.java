//Escriba un programa que averigüe si dos vectores de N enteros son iguales 
//(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
package Encuentro_9_10y11_Extra;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_extra2 {

    public static void main(String[] args) {
        int n1;
        boolean res = true;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el tamaño el vector:");
        n1 = leer.nextInt();

        int[] vector1 = new int[n1];
        int[] vector2 = new int[n1];

        Random rand = new Random();

        for (int i = 0; i < n1; i++) {
            vector1[i] = rand.nextInt(10);
            vector2[i] = rand.nextInt(10);
        }

        System.out.println("El vector 1 es: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(" " + vector1[i]);
        }

        System.out.println("El vector 2 es: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(" " + vector2[i]);
        }

        for (int i = 0; i < n1; i++) {
            if (vector1[i] != vector2[i]) {
                res = false;
                break;
            }
        }

        if (res) {
            System.out.println("La vectores son iguales");
        } else {
            System.out.println("Lo vectores son diferentes");
        }

    }

}
