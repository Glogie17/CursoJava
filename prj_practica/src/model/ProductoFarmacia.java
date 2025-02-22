
package model;


public class ProductoFarmacia extends Producto {
    private String uso;
    

    public ProductoFarmacia(String nombre, double precio,String uso) {
        super(nombre, precio);
        this.uso = uso;
        
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    @Override
    public String toString() {
        return "ProductoFarmacia{" + "uso=" + uso + super.toString() + '}';
    }

    

    

    

    
    
}
