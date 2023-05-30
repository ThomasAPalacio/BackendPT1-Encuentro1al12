//Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.
package Encuentro_4_5y6_Extra;

import java.util.Scanner;

public class Ejercicio_extra4 {

    public static void main(String[] args) {
        int num;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 10 y se mostrara en romano:");
        num = leer.nextInt();
        
        while (num < 0 || num > 10) {
            
            System.out.println("ERROR! ese numero no es valido ingrese otro:");
            num = leer.nextInt();
            
        }
        
        if (num==1){
            System.out.println(num+"=I");
        } else {
        if (num==2) {
            System.out.println(num+"=II");
        } else {
        if (num==3) {
            System.out.println(num+"=III");
        } else {
        if (num==4) {
            System.out.println(num+"=IV");
        } else {
        if (num==5) {
            System.out.println(num+"=V");
        } else {
        if (num==6) {
            System.out.println(num+"=VI");
        } else {
        if (num==7) {
            System.out.println(num+"=VII");
        } else {
        if (num==8) {
            System.out.println(num+"=VIII");
        } else {
        if (num==9) {
            System.out.println(num+"=IX");
        } else {
        if (num==10)
                System.out.println(num+"=X");
        }
        }
        }
        }
        }
        }
        }
        }
        }
    }
    
}
