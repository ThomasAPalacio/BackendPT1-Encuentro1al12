//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida 
//por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
//la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor 
//y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
package Encuentro_7y8;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar moneda para realizar el cambio (libras, dolares o yenes):");
        String moneda = leer.nextLine();
        System.out.println("Ingresar cantidad de Euros");
        double cant = leer.nextInt();
        double monedaTotal = cambioDeMoneda(cant, moneda);
        System.out.println("Los " + cant + " de Euros son " + monedaTotal + " " + moneda);

    }

    public static double cambioDeMoneda(double cant, String moneda) {
        double valor = 0;
        switch (moneda) {
            case "libras":
                valor = (0.86 * cant);
                break;
            case "dolares":
                valor = 1.28611 * cant;
                break;
            case "yenes":
                valor = 129.852 * cant;
                break;
            default:
                System.out.println("La moneda ingresada no es valida");
                break;
        }

        return valor;
    }
}
