//Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
//por debajo de 1.60 mts. y el promedio de estaturas en general.
package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extra6 {

    public static void main(String[] args) {
        int N, i, cont1, cont2;
        double estaturas1, estaturas2, estaturas3;

        cont1 = 0;
        cont2 = 0;
        estaturas1 = 0;
        estaturas2 = 0;
        estaturas3 = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas:");
        N = leer.nextInt();

        for (i = 1; i <= N; i++) {
            System.out.println("Ingrese la estaturas de las personas, las que son por debajo de 1.60 se tomara el promedio aparte");
            estaturas1 = leer.nextDouble();

            if (estaturas1 <= 1.60) {
                estaturas2 = estaturas1 + estaturas2;
                cont1 = cont1 + 1;
            }
            if (estaturas1 > 1.60) {
                estaturas3 = estaturas1 + estaturas3;
                cont2 = cont2 + 1;
            }
        }
        System.out.println("El promedio de la estatura de 1.60 hacia bajo es de: " + (estaturas2 / cont1));
        System.out.println("El promedio de la estutura de 1.60 hacia arriba es de: " + (estaturas3 / cont2));
    }
}
