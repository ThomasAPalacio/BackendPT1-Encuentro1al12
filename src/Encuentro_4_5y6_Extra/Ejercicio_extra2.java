//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
//A continuación, realizar las instrucciones necesarias para que: 
//B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
//Mostrar los valores iniciales y los valores finales de cada variable. 
//Utilizar sólo una variable auxiliar.
package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extra2 {

    public static void main(String[] args) {
        int A, B, C, D, aux;
        
        aux=0;
        A=1;
        B=2;
        C=3;
        D=4;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("El valor de A es: " +A);
        System.out.println("El valor de B es: " +B);
        System.out.println("El valor de C es: " +C);
        System.out.println("El valor de D es: " +D);
       
        
       aux=B;
       B=C;
       C=A;
       A=D;
       D=aux;
       
      
       
       
        System.out.println("Ahora A tiene el valor de D: " +A);
        System.out.println("Ahora B tiene el valor de C: " +B);
        System.out.println("Ahora C tiene el valor de A: " +C);
        System.out.println("Ahora D tiene el valor de B: " +D);
        
    }
    
}