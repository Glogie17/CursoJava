/*
Hacer un algoritmo que imprima el nombre de un artículo,
clave, precio original y su precio con descuento. El
descuento lo hace en base a la clave, si la clave es 01
el descuento es del 10 % y si la clave es 02 el
descuento en del 20 % (solo existen dos claves).
 */
package Controller;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        char art;
        double po, dscto, pd=0 ,tp;
        int clave;
        
        
        System.out.println("Digite el precio original");
        po = scanner.nextDouble();
        System.out.println("Digite la clave");
        clave = (int) scanner.nextDouble();
        
        switch (clave){
            case 1:
                pd = po * 0.1;
                System.out.println("El descuento es de: " + pd);
                break;
            case 2:
                pd = po * 0.2;
                System.out.println("El descuento es de: " + pd);
                break;
            default:
                System.out.println("Error! No es una clave valida");
        }
        tp = po - pd;
        System.out.println("Total a pagar con descuento: " + tp);
        
    }
}
