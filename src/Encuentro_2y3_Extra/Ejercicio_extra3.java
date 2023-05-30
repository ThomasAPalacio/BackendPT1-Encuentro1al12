//Define variables donde puedas alojar los resultados 
//y prueba usar dos operadores de cada tipo.

package Encuentro_2y3_Extra;

import java.util.Scanner;

public class Ejercicio_extra3 {
    
    public static void main(String[] args) {
        int num1, num2;
        double num3, num4;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el numero uno y dos y ambos se multiplicaran");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
                
        System.out.println("Ingrese el numero tres y cuatro y ambos se dividiran");
        num3 = leer.nextDouble();
        num4 = leer.nextDouble();
        
        System.out.println("El resultado del primer calculo es: " + (num1*num2));
        System.out.println("El resultado del segundo calculo es: " +(num3/num4));
    }
    
}
