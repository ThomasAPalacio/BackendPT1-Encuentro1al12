//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, 
//etcétera (hasta 5 dígitos).
package Encuentro_9_10y11;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_3 {
    
    public static void main(String[] args) {
       int i;
        Scanner leer = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        
        int[] vector = new int[N];
        
        for (i=0 ; i<N ; i++) {
            vector[i] = rand.nextInt(99999);
            
             if (vector[i]<= 9) {
            System.out.println("El numero: " + vector[i] +  " tiene un digito");
        } else {
        if (vector[i]>9 && vector[i]<99) {
            System.out.println("El numero: " + vector[i] +  " tiene dos digitos");
        } else {
        if (vector[i]>99 && vector[i]<999) {
            System.out.println("El numero: " + vector[i] +  " tiene tres digitos");
        } else {
        if (vector[i]>999 && vector[i]<9999) {
            System.out.println("El numero: " + vector[i] +  " tiene cuatro digitos");
        } else {
        if (vector[i]>9999 && vector[i]<99999) {
            System.out.println("El numero: " + vector[i] +  " tiene cinco digitos");
        }
        }
        }
        }
        }
        }
        
       
        
    }
    
}
