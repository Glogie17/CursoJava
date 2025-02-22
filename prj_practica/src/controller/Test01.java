package controller;
import model.Producto;
import model.*;
/**
 *
 * String sede, String nom_prod, String codigo, double precio, int cantidad
 */
public class Test01 {

     
    public static void main(String[] args) {
        
        ProductoFarmacia prodN1 = new ProductoFarmacia("Paracetamol", 3, "fiebre");
        System.out.println(prodN1);
        
        ProductoFerreteria prodN2 = new ProductoFerreteria("Tornillo", 1,"metal");
        System.out.println(prodN2);
        
        PlatoRestaurante prodN3 = new PlatoRestaurante("Ceviche", 30,"comida marina");
        System.out.println(prodN3);
    }
}
