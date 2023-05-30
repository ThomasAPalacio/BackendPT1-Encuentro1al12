//Crear un programa que dado un número determine si es par o impar.
package Encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int num;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero y el programa determinara si es par o impar");
        num = leer.nextInt();
   
        if (num%2 != 0) {
            System.out.println("El numero: " +num+ " es impar");
            
          } else {
            
            System.out.println("El numero: " +num+ " es par");
        }
        }
        
    }
