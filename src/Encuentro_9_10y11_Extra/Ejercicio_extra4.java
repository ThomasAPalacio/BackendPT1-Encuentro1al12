//Los profesores del curso de programación de Egg necesitan llevar un registro de 
//las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
//Durante el período de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos 
//y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
//Al final del programa los profesores necesitan obtener por pantalla la cantidad 
//de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio 
//mayor o igual al 7 de sus notas del curso.
package Encuentro_9_10y11_Extra;

import java.util.Scanner;

public class Ejercicio_extra4 {
    
    public static void main(String[] args) {
        int alumnos = 10;
        
        Scanner leer = new Scanner(System.in);
        
        double[] vector = {0.10, 0.15, 0.25, 0.50};
        double[][] matriz = new double[alumnos][5];
        
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingresar notas alumno " + (i + 1) + " y nota " + (j + 1) + ": ");
                matriz[i][j] = leer.nextDouble();
                //promedio ponderado
                matriz[i][4] += matriz[i][j] * vector[j];
            }
        }
        int cont = 0;
        for (int i = 0; i < alumnos; i++) {
            if (matriz[i][4] >= 7) {
                cont++;
            }
        }
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < 5; j++) {
                // cortar a dos decimales
                System.out.print(String.format("%.2f", matriz[i][j]) + " ");
            }
            System.out.println("");
        }
        System.out.println("La cantidad de aprobados es: " + cont);
        System.out.println("La cantidad de desaprobados es: " + (alumnos - cont));
        
    }
    
}
