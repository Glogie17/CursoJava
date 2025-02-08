
package Controller;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        /*
        Ingresar 10 números y solo mostrar la suma de los negativos.
 
        Scanner scanner = new Scanner(System.in);
        int suma_nega=0;
        int cont=0;
        double num=0;
        
        while(cont<10){
            System.out.println("Ingrese un numero:");
            num = scanner.nextDouble();
            if(num<0){
                suma_nega = suma_nega + cont;
            }
           cont = cont + 1; 
        }
        
        System.out.println("La suma de los negativos es: " + suma_nega);
        scanner.close();
        */
        /*
        Leer números enteros positivos de teclado, hasta que el usuario ingrese 
        el 0. Informar cuál fue el mayor número ingresado.*/
        
        // Leer números enteros positivos de teclado, hasta que el usuario 
        // ingrese el 0. Informar cuál fue el mayor número ingresado.
        Scanner scanner = new Scanner (System.in);
        int mayor = -1 , num = -1 ;
        System.out.println("Ingrese numeros enteros positivos(0 para salir): ");
        while(num !=0){
            num = scanner.nextInt();
            if (num<0){
                System.out.println("Por favor ingrese un numero positivo");
            } else if (num>mayor && num !=0){
                mayor = num; }
            if (mayor != -1){
                System.out.println("El mayor numero ingresado fue: " + mayor);
            }else{
                System.out.println("No se ingresaron numeros validos");
            }
            
        }
    }
}
