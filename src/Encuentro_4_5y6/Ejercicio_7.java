//Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
//este tipo de dispositivo lee cadenas enviadas por el usuario. 
//Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
//el primer carácter tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, 
//la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
//y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas
//recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan 
//las siguientes funciones de Java Substring(), Length(), equals().

package Encuentro_4_5y6;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        String cadena;
        int ContadorV, ContadorF;
        
        ContadorV=0;
        ContadorF=0;
        
        Scanner leer = new Scanner(System.in);
        
        do {
             System.out.println("Ingrese una cadena");
        cadena = leer.next();
            
        while (cadena.length()!=5) {
            System.out.println("ERROR! lo maximo que puede ingresar en son 5 caracteres");
             cadena = leer.next();
        }
        if ((cadena.substring(0,1).equals("X")) && (cadena.substring(4,5).equals("O"))) {
            
            ContadorV++;
            
             } else {
            
            ContadorF++; 
                
        }
        } while (!cadena.equals("&&&&&"));
        
        
        System.out.println("El informe es:");
        
        System.out.println("Cantidad de cadenas correctas: " + ContadorV);
        System.out.println("Cantidad de cadenas incorrectas: " + (ContadorF-1));
        
    }
    
}
