//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, 
//y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el 
//carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
//se mantienen sin cambios.
//VER CUADRO EJERCICIO 11 DE LA GUIA DEL ENCUENTO DE HOY
//Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación. 
//Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
//La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
package Encuentro_7y8;

import java.util.Scanner;

public class Ejercicio_guia1 {

    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra terminada con un punto(.)");
        String frase = leer.nextLine();
        
        intercambioVocales(frase);

    }

    public static void intercambioVocales(String frase) {
        int i = 0;
        String fraseModificada = "";
        String caracterActual;
        

        do {
            switch (frase.substring(i, i + 1)) {
                case "a":
                    fraseModificada = fraseModificada.concat("@");
                    break;
                case "e":
                    fraseModificada = fraseModificada.concat("#");
                    break;
                case "i":
                    fraseModificada = fraseModificada.concat("$");
                    break;
                case "o":
                    fraseModificada = fraseModificada.concat("%");
                    break;
                case "u":
                    fraseModificada = fraseModificada.concat("*");
                    break;

                default:
                    caracterActual = (frase.substring(i, i + 1));
                    fraseModificada = fraseModificada.concat( caracterActual );

            }

            i++;
        } while (!frase.substring(i,i+1).equals("."));
        System.out.println("La frase codificada es: " +fraseModificada);
    }
}