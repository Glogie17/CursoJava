package controller;
import model.Cliente;
import model.ClienteJuridico;
/**
 *
 * @author Alumno
 */
public class Test01 {
    public static void main(String[] args) {
        /*
        // Cliente no puede instanciar, por ser abstracto
        // El fin Cliente es servir de modeo para otros tipos de cliente
        Cliente clien1 = new Cliente("Juan", 1500);
        System.out.println(clien1);
        */
        
        
        model.ClienteNatural clienN1 = new model.ClienteNatural("12345678", "ANA ABAD", 
                                           5000,"Av. Lima 123", "ana@gmail.com", 2015);
        System.out.println(clienN1);
        System.out.println("Antiguedad del cliente natural : " + clienN1.getAntiguedad() + " años");
        
        ClienteJuridico clienJ1 = new ClienteJuridico("20102030401", "Empresa ABC", "Av. Tupac Amaru 1010", 
                100000, "empabc@abc.com", 2020, "10020030", "José Perez");
        System.out.println(clienJ1);
        
    }
}