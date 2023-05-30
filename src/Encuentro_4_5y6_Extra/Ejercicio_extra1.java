//Dado un tiempo en minutos, calcular su equivalente en días y horas. 
//Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extra1 {

    public static void main(String[] args) {
        int dias = 0;
        int horas = 0;
        int minutos = 0;
        
        Scanner leer = new Scanner(System.in);
        
       System.out.println("Ingrese en minutos el tiempo a calcular: ");
        int num = leer.nextInt();

        while (num > 0) {
            if (num >= 1440) {
                dias += 1;
                num -= 1440;
            } else     
            if (num >= 60) {
                horas += 1;
                num -= 60;
            } else {
                minutos += 1;
               num -= 60;
            }

        }
        System.out.println("Los dias son : "+ dias);
        System.out.println("Las horas son : "+ horas);
        System.out.println("Los minutos son : "+ minutos);


    }

}