//Escriba un programa en el cual se ingrese un valor limite positivo, 
//y a continuacion solicite numeros al usuario hasta que la suma de los numeros 
//introducidos supere el limite inicial.

package Encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        int num, lim, suma;
        
        suma=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese valor limite positivo");
        lim = leer.nextInt();
        
        do {
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            suma=suma+num;
        } while (lim>=suma);
        
        System.out.println("Ya has superado el limite que estableciste anteriormente");
    }
    
}
