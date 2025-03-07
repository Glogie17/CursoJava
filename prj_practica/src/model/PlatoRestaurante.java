
package model;

public class PlatoRestaurante extends Producto {
    private String tipo;

    public PlatoRestaurante(String nombre, double precio, String tipo ) {
        super(nombre, precio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "PlatoRestaurante{" + "tipo= " + tipo + super.toString() + '}';
    }
    
    

    
    
}
