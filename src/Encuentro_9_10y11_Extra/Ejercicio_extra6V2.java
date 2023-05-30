//Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario 
//las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
//Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
//Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados 
//con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
//Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
//de Java substring(), Length() y Math.random().
package Encuentro_9_10y11_Extra;

import java.util.Scanner;

public class Ejercicio_extra6V2 {

    public static void main(String[] args) {
        String[] palabras = new String[5];
        String[][] sopaLetras = new String[20][20];
        leerPalabras(palabras);
        ponerSopa(palabras, sopaLetras);
        escribirSopa(sopaLetras);
    }

    public static void leerPalabras(String[] palabras) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese palabras (entre 3 y 5 letras):");
        for (int i = 0; i < palabras.length; i++) {

            do {
                System.out.print("Palabra " + (i + 1) + ": ");
                palabras[i] = sc.nextLine();
            } while (palabras[i].length() < 3 || palabras[i].length() > 5);

        }
    }

    public static void ponerSopa(String[] palabras, String[][] sopaLetras) {
        int filaSopa, colSopa;
        for (int i = 0; i < palabras.length; i++) {
            colSopa = (int) (Math.random() * (20 - palabras[i].length()));
            do {
                filaSopa = (int) (Math.random() * 20);
                if (sopaLetras[filaSopa][colSopa] == null) {
                    break;
                }
            } while (true);

            System.out.println("Palabra " + palabras[i] + " fila " + filaSopa + " col " + colSopa);
            for (int j = 0; j < palabras[i].length(); j++) {
                sopaLetras[filaSopa][colSopa + j] = palabras[i].substring(j, j + 1);
            }

        }
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[0].length; j++) {
                if (sopaLetras[i][j] == null) {
                    sopaLetras[i][j] = "" + (int) (Math.random() * 10);
                }
            }
        }
    }

    public static void escribirSopa(String[][] sopaLetras) {
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[0].length; j++) {
                System.out.print(" " + sopaLetras[i][j]);
            }
            System.out.println("");
        }

    }

}