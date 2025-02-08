/*
Elabore un programa que realice la conversión de cm. a
pulgadas. Donde 1cm = 0.39737 pulgadas. Por lo tanto, el
usuario proporcionará el dato de N cm. y el programa dirá a
cuantas pulgadas es equivalente.
 */
package Controller;

import java.util.Scanner;


public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Crear un objeto Scanner
        double med,conv;
     
        System.out.println("Ingrese la medida en cm: ");
        med = scanner.nextDouble();
        
        conv = 0.39737 * med;
        
        System.out.println("Convirtiendo de cm a pulgadas: " + conv);
        
        scanner.close();  // Cerramos el Scanner para liberar recursos
    } 

}
