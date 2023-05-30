//Realizar un algoritmo que llene un vector con los 100 primeros números enteros 
//y los muestre por pantalla en orden descendente.
package Encuentro_9_10y11;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int i, cont;
        int[] vector = new int[100];
        int[] vector2 = new int[100];

        cont = 0;

        for (i = 0; i < 100; i++) {
            vector[i] = i + 1; 
        }

        for (i = 99; i >= 0; i -= 1) {
            vector2[cont] = vector[i];
            cont = cont + 1;

        }

        for (i = 0; i < 100; i++) {
            System.out.println(vector2[i]);
        }

    }

}
