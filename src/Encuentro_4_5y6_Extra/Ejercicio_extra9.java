//Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
//realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
//Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
//este resultado es el residuo, y el número de restas realizadas es el cociente.
//Por ejemplo: 50 / 13:
//50 – 13 = 37 una resta realizada
//37 – 13 = 24 dos restas realizadas
//24 – 13 = 11 tres restas realizadas
//dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
//¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extra9 {

    public static void main(String[] args) {
        int dividendoYresto, divisor;
        double cociente;

        cociente = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dividendo:");
        dividendoYresto = leer.nextInt();

        System.out.println("Ingrese el divisor:");
        divisor = leer.nextInt();

        while (dividendoYresto>divisor) {
            
            dividendoYresto=dividendoYresto-divisor;
            cociente++;
            
        }
        
        System.out.println("El resto de la division es: " +dividendoYresto);
        System.out.println("El cociente de la division es: " +cociente);
     {
            
        }
    }

}
