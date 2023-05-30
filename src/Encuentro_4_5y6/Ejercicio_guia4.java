//Escriba un programa que lea 20 números. Si el número leído es igual a cero se
//debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
//programa deberá calcular y mostrar el resultado de la suma de los números
//leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
//de la sentencia break.
package Encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio_guia4 {

    public static void main(String[] args) {
        int contador, suma, num;
        
        contador=0;
        suma=0;
        
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("Ingrese un numero entero:");
            num = leer.nextInt();
            contador++;
            if (num>0) {
                suma = suma + num;
            }
            if (num==0) {
            System.out.println("Se capturó el numero cero");
            break;
            }
        } while (contador<20);
        
        System.out.println("La suma de los numeros es: "+suma);
    }
    
}
