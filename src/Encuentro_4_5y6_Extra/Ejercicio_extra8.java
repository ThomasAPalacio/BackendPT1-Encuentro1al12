//Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura 
//y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. 
//Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
//Nota: recordar el uso de la sentencia break.
package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extra8 {

    public static void main(String[] args) {
        int num, numImpar, numPar, cont;

        numImpar = 0;
        numPar = 0;
        num = 0;
        cont = 0;

        Scanner leer = new Scanner(System.in);
        do {

            System.out.println("Ingrese un numero");
            num = leer.nextInt();

            if (num < 0) {
                continue;
            }

            if ((num % 5) == 0) {
                break;
            }

            if ((num % 2) == 0) {
                numPar = numPar + 1;
            } else {
                if ((num % 2) != 0) {
                    numImpar = numImpar + 1;
                }
            }
            
            cont++;

        } while ((num % 5) != 0);

        System.out.println("La cantidad de numeros fueron: " +cont);
        System.out.println("La cantidad de numeros pares es: " + numPar);
        System.out.println("La cantidad de numeros impares es: " + numImpar);

    }

}
