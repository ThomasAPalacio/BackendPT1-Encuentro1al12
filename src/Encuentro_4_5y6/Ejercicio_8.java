//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
//Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*     *
//*     *
//* * * *
package Encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio_8 {

    public static void main(String[] args) {
        int num, i, j;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = leer.nextInt();

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if ((j > 1) && (j < num) && (i > 1) && (i < num)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");

        }

    }

}
