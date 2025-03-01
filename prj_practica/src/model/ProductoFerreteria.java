/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class ProductoFerreteria extends Producto {
    private String material;
    

    public ProductoFerreteria(String nombre, double precio,String material) {
        super(nombre, precio);
        this.material = material;
        
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "ProductoFerreteria{" + "material= " + material + super.toString() + '}';
    }

    
    
    
}
