//Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A 
//es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo. 
//Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT 
//y se obtiene cambiando sus filas por columnas (o viceversa).
package Encuentro_9_10y11;

public class Ejercicio_5 {

    public static void main(String[] args) {
        int i, j;
        int[][] matriz = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};
        int[][] matrizTraspuesta = new int[3][3];
        boolean check = true;

        System.out.println("La matriz es: ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matrizTraspuesta[i][j] = matriz[j][i];
                System.out.print(matrizTraspuesta[i][j] + " ");
            }
            System.out.println("");
        }

        for (i = 0; i < 3; i++) {
            if (matriz[i][i] != 0) {
                check = false;
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (matriz[i][j] != (-matrizTraspuesta[i][j])) {
                    check = false;
                }
            }
        }

        if (check) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz no es antisimetrica");
        }
    }
}
