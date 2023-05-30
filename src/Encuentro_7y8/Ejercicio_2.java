//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos  
//de las personas ingresadas por teclado e indique si son mayores o menores de edad. 
//Después de cada persona, el programa debe preguntarle al usuario si quiere 
//seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
package Encuentro_7y8;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {

        mayorEdad();

    }

    public static void mayorEdad() {

        String opcion = "";
        Scanner leer = new Scanner(System.in);

        while (!(opcion.equals("no"))) {

            System.out.println("ingrese el nombre de la persona");
            String nombre = leer.next();
            System.out.println("ingrese la edad de la persona");
            int edad = leer.nextInt();
            System.out.println("------------------------------------");
            System.out.println("el nombre de la persona es: " + nombre);
            if (edad >= 18) {
                System.out.println("la persona es mayor de edad");
            } else {
                System.out.println("la persona es menor de edad");
            }

            System.out.println("desea seguir ingresando personas? si/no");
            opcion = leer.next();
        }

    }

}
