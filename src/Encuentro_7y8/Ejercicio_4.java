//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro }
//para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
//ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
package Encuentro_7y8;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        boolean res;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero para saber si es primo o no: ");
        int num = leer.nextInt();

       res = esPrimo(num);
        
    }

    public static boolean esPrimo(int num) {
        int i, cont;
        boolean res;

        cont = 0;

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont = cont + 1;
            }
        }

        if (cont == 2) {
            res = true;
        } else {
            res = false;
        }

        System.out.println("El numero es primo? " + res);
        return res;
    }

}
