
package controller;


public class OperacionesAritmeticas {
    public static void main(String[] args) {
    double a= 147 , b=39;
    
    System.out.println ("La suma de a+b es: " + (a+b));
    System.out.println ("La resta es: " + (a-b));
    System.out.println ("La multiplicacion es: " + (a*b));
    System.out.println ("La division es: " + (a%b));
    
    a++; //aumentar en la unidad
    System.out.println("El valor de a despues de a++ es "+a);
    b++; //aumentar en la unidad
    System.out.println("El valor de a despues de b++ es "+b);
    }
}
