//Dada una cantidad de grados centígrados se debe mostrar su
//equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
//+ (9 * C / 5).
package Encuentro_2y3;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una temp. en grados centrigrados:");
        double cent = leer.nextDouble();
        double fahren = 32 + (9 * cent / 5);
        System.out.println(cent + "° equivalen a " + fahren + "° Fahrenheit");
    }
    
}
