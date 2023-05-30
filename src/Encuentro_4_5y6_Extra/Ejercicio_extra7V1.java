//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números 
//(n>0). El valor de n se solicitará al principio del programa y los números serán introducidos 
//por el usuario. Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle 
//“do - while”.
package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extra7V1 {

    public static void main(String[] args) {
        int N, i, num, valorMin, valorMax;
        double prom;
        
        valorMin = 100;
        valorMax = 0;
        i = 0;
        num = 0;
        prom=0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Cuantos numeros quiere agregar?");
        N = leer.nextInt();

        do {
            System.out.println("Ingrese numeros:");
            num = leer.nextInt();
            
            prom=prom+num;
            
            if (num>valorMax) {
                valorMax=num;
            }
            if (num<valorMin) {
                valorMin=num;
            }
            
            i++;
        } while (i != N);

        if (N == 0) {
            System.out.println("No ha agregado ningun numero");
        }
        
        System.out.println("El valor Minimo es: " +valorMin);
        System.out.println("El valor Maximo es: " +valorMax);
        System.out.println("El promedio de los numeros ingresados es: " +(prom/N));
        
    }

}
