
package model;

public class Yape extends FormaPago{
    private String nro_telefono;
    
    public Yape(){
        super ("Pago en Yape");
        nro_telefono = "";
        
    }

    public String getNro_telefono() {
        return nro_telefono;
    }

    public void setNro_telefono(String nro_telefono) {
        this.nro_telefono = nro_telefono;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
}
