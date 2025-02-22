
package model;


public class TarjetaCredito extends FormaPago {
    private int cantCuotas;
    private String nro_tarjeta;
    
    public TarjetaCredito(){
        super("Tarjeta de credito: ");
        cantCuotas = 1;
        nro_tarjeta = "";
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }
    
    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    
    
}
