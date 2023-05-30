//Una obra social tiene tres clases de socios:
//Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
//en todos los tipos de tratamientos.
//Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
//para los mismos tratamientos que los socios del tipo A.
//Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos 
//sobre dichos tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, 
//y luego un valor real que represente el costo del tratamiento (previo al descuento) 
//y determine el importe en efectivo a pagar por dicho socio.
package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extra5 {

    public static void main(String[] args) {
        int letra;

        Scanner leer = new Scanner(System.in);

        System.out.println("BIENVENIDO! ¿Que socio es? (indique con un numero del 1 al 3)");
        System.out.println("Cabe recalcar que el tratamiento esta valiendo $100 (sin descuento)");
        System.out.println("1 - Socios tipo A");
        System.out.println("2 - Socios tipo B");
        System.out.println("3 - Socios tipo C");
        letra = leer.nextInt();

        switch (letra) {

            case 1:
                System.out.println("Usted es un socio tipo A por esto se le da un descuento de 50% para el medicamento");
                System.out.println("Su descuento es de: " + (100 * 0.50)+ "$ en efectivo");
                break;

            case 2:
                System.out.println("Usted es un socio tipo B por esto se le da un descuento de 35% para el medicamento");
                System.out.println("Su descuento es de: " + (100 * 0.35)+ "$ en efectivo");
                break;

            case 3:
                System.out.println("Usted es un socio tipo C por eso no se le da ningun descuento, lo lamentamos :( ");
                break;

            default:
                System.out.println("No existe esa opcion");

        }
    }
}
