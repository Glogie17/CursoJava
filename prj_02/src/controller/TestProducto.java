
package controller;
import model.Producto;


public class TestProducto {
    
    public static void main(String[] args) {
       Producto p1 = new Producto(12345, "Galletas SAN JORGE", 3.5 , 150);
       Producto p2 = new Producto(25836, "Leche GLORIA");
       Producto p3 = new Producto ();
       Producto p4 = new Producto(25836, "Leche GLORIA");
       
       //mostrar 
        System.out.println("p1 es " + p1);
        System.out.println("p2 es " + p2);
        System.out.println("p3 es " + p3);
        
        //Prueba de Negocio
        //Para vender producto: tener stock,  precio, codigo, ...
        if(p1.EsVendible()){
            System.out.println("El producto " + p1.getNombre() +" ES VENDIBLE");
        } else {
            System.out.println("El producto "+ p1.getNombre()+" NO se puede vender");

        } 
        
        
        //cOMPARAR UN OBJETO CON OTRO
        if (p1.equals(p2)) {
            System.out.println(p1.getNombre() + " es igual a " + p2.getNombre() );
        }else{
            System.out.println(p1.getNombre() + " es diferente a " + p2.getNombre() );

        }
        
        if (p2.equals(p4)) {
            System.out.println(p2.getNombre() + " es igual a " + p4.getNombre() );
        }else{
            System.out.println(p2.getNombre() + " es diferente a " + p4.getNombre() );

        }
        
        //Comparacion por sus valores HASH
        if (p1.hashCode() == p2.hashCode()) {
            System.out.println(p1.getNombre() + " es igual a " + p2.getNombre() );
        }else{
            System.out.println(p1.getNombre() + " es diferente a " + p2.getNombre() );

        }
    }
    
    
}
