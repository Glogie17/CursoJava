
package controller;

public class Arreglo2 {
    public static void main(String[] args) {
        double precio[];//definicion de que la variable es un arreglo
        precio = new double[5]; //se disponga un espacio para 5 doubles
        
        //Asignar los valores a todas posiciones de la variable precios
        precio[0] = 25.5 * 1.1; //Asignar un valor a la posicion cero de precios
        precio[1]  = 198.9 * 1.1;
        precio[2]  = 45.50 * 1.1;
        precio[3]  = 1999.90 * 1.1;
        precio[4]  = 29.9 * 1.1;
        
        for (int i=0 ; i<5; i++){
            System.out.println("Precio es "+ precio[i] + ", IGV es " + precio[i]*0.18);
        }        
        
    }
}
