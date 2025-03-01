package model;

public class Conductor extends Persona{
    private String nro_lic;
    private String vehiculo;

    public Conductor(String dni, String nombres, String nro_lic, String vehiculo) {
        super(dni, nombres);
        this.nro_lic = nro_lic;
        this.vehiculo = vehiculo;
    }

    public String getNro_lic() {
        return nro_lic;
    }

    public void setNro_lic(String nro_lic) {
        this.nro_lic = nro_lic;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nro_lic=" + nro_lic + ", vehiculo=" + vehiculo + " " + super.toString() + '}';
    }


    
    
}
