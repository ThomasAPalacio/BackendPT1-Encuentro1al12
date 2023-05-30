//Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números 
//generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no 
//correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta 
//nuevamente. Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extraa10 {

    public static void main(String[] args) {
        int num, aleatorio;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Adivine el resultado de la multiplicacion: ");
        System.out.println("PISTA: El numero es entre 1 y 10");
        num = leer.nextInt();
        
        while(num < 0 || num > 10){
        
            System.out.println("ERROR! esa numero no es valido, ingrese otro:");
            num = leer.nextInt();
            
        }
        
        aleatorio = (int) (Math.random()*10+1);
        
        while (num != aleatorio) {
            
            System.out.println("INCORRECTO!, no adivino el numero intente nuevamente:");
            num = leer.nextInt();
        }
        System.out.println("CORRECTO!, adivino el numero");
    }
    
}
