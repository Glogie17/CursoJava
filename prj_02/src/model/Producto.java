/*

 */
package model;

import java.util.Objects;


public class Producto {
    //atributos
    private int cod_prod;
    private String nombre;
    private double precio;
    private int stock;
    
    //constructores
    public Producto(int cod_prod, String nombre, double precio, int stock) {
        //this es una referencia a la clase curso
        if (cod_prod != 0){
            this.cod_prod = 0;
        } else {
            System.out.println("El codigo no puede ser CERO");
        
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    //sobrecarga de constructores
    public Producto(int cod_prod, String nombre) {
        this.cod_prod = cod_prod; 
        this.nombre = nombre;
        this.precio = 0.0;  //Inicializar el resto de atributos;
        this.stock = 0;
    }
    
    // constructor vacio
    public Producto() {
        this.cod_prod = cod_prod;
        this.nombre = "SIN NOMBRE";
        this.precio = 0.0;  //Inicializar el resto de atributos;
        this.stock = 0;
    }

    public boolean  EsVendible(){
        boolean esVendible = true;
        if (cod_prod == 0 || nombre.equals("SIN NOMBRE") || stock == 0 || precio == 0){
            esVendible = false;
        }
        return esVendible;
    }
    
    //GET metodo para obtener
    public int getCod_prod() {
        return cod_prod;
    }

    //SET metodo para guardar o asignar el codigo del producto
    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" + "cod_prod=" + cod_prod + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.cod_prod;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.cod_prod != other.cod_prod) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
}
