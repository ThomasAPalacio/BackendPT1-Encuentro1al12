//Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno 
//y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. 
//Ejemplo: si se ingresa el número 3:
//1
//12
//123

package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extraa13 {

    public static void main(String[] args) {
        int num, i, aux;
        
        aux=0;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero y se mostrara en forma de escalera:");
        num = leer.nextInt();
        
        for (i=1 ; i<=num ; i++) {
            
            aux=aux*10+i;
            System.out.println(aux);
            
        }
    }
    
}