//Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla 
//el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar el resultado 
//por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
//Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
//se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? 
//Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar 
//el menú
package Encuentro_4_5y6;

import java.util.Scanner;


public class Ejercicio_6 {

   
    public static void main(String[] args) {
         int num1, num2, opcion;
        String opcion2 = "N";

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        do {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma de los numeros es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("La resta de los numeros es:" + (num1 - num2));
                    break;

                case 3:
                    System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                    break;

                case 4:
                    System.out.println("La division de los numero es: " + (num1 / num2));
                    break;

                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcion2 = leer.next();
                    break;

                default:
                    System.out.println("No existe el valor esa opcion...");
            }
            
        } while (!opcion2.equals("S"));
        
        System.out.println("Usted ha salido del menu");
    }
    
}
