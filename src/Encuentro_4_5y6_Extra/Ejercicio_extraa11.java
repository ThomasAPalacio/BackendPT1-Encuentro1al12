//Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
//Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
//Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
//Nota: recordar que las variables de tipo entero truncan los números o resultados.

package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extraa11 {

    public static void main(String[] args) {
     int num, cont;
     
     cont=0;
     
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero y el programa devolvera la cantidad de digitos:");
        num = leer.nextInt();
        
        while(num !=0){
            num = num / 10;
            cont++;
        }
        
        System.out.println("La cantidad de digitos es: " +cont);
        
    }
    
}
