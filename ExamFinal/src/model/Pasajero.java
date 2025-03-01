package model;

public class Pasajero extends Persona {
    private String cod_pasajero;
    private String nro_asiento;

    public Pasajero(String dni, String nombres, String cod_pasajero, String nro_asiento) {
        super(dni, nombres);
        this.cod_pasajero = cod_pasajero;
        this.nro_asiento = nro_asiento;
    }

    public String getCod_pasajero() {
        return cod_pasajero;
    }

    public void setCod_pasajero(String cod_pasajero) {
        this.cod_pasajero = cod_pasajero;
    }

    public String getNro_asiento() {
        return nro_asiento;
    }

    public void setNro_asiento(String nro_asiento) {
        this.nro_asiento = nro_asiento;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "cod_pasajero=" + cod_pasajero + ", nro_asiento=" + nro_asiento + " " + super.toString() + '}';
    }
    
    
}
