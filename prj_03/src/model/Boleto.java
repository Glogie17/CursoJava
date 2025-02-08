
package model;

public class Boleto {
    private int cod_boleto;
    private String origen;
    private String destino;
    private static int cont =0; //Esta variable es unica paraa todas las instancias de boleto

    public Boleto(String origen, String destino) {
        this.cont++;
        this.cod_boleto = this.cont;
        this.origen = origen;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Boleto{" + "cod_boleto=" + cod_boleto + ", origen=" + origen + ", destino=" + destino + '}';
    }
    
    
}
