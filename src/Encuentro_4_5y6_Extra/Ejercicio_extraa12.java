//Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
//con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
//0-0-0
//0-0-1
//0-0-2
//0-0-E
//0-0-4
//0-1-2
//0-1-E
//Nota: investigar función equals() y como convertir números a String.

package Encuentro_4_5y6_Extra;

public class Ejercicio_extraa12 {

    public static void main(String[] args) {
        
           for (int i = 0; i < 1000; i++) {
            int centenas = i / 100;
            int decenas = (i / 10) % 10;
            int unidades = i % 10;
        String contador = "" + centenas + "-" + decenas + "-" + unidades;
        contador = contador.replace("3", "E");
            System.out.println(contador);
                   
        }
               
    }
}
