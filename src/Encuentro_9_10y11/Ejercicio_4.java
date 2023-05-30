//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta 
//de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas 
//por columnas (o viceversa).
package Encuentro_9_10y11;

import java.util.Random;

public class Ejercicio_4 {

    public static void main(String[] args) {
        int i,j;
        int [][] matriz = new int[4][4];
         Random rand = new Random();
        
         System.out.println("La matriz es: ");
         
        for (i=0 ; i<4 ; i++) {
           for (j=0 ; j<4 ; j++) {
               matriz[i][j] = 1+ rand.nextInt(9);
               System.out.print(matriz[i][j] + " ");
           } 
            System.out.println("");
        }
        
        System.out.println("La matriz transpuesta es: ");
        
        for (i = 0; i < 4; i++) {
            for ( j = 0; j < 4; j++) {
               System.out.print(matriz[j][i] +" ");
            }
            System.out.println("");       
        }
    } 
}
