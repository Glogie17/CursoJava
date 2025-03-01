package controller;
import java.util.ArrayList;
import model.*;
/**
 *
 * @author Alumno
 */
public class Coleccion1 {
    public static void main(String[] args) {
        ArrayList colec1 = new ArrayList();
        // Guardar elementos
        colec1.add(3.14);
        colec1.add("Angie");
        colec1.add(2025);
        colec1.add(new Automovil("ABC555", "TOYOTA", 2020));
        colec1.add(new Automovil("ABC444", "NISSAN", 2005));
        colec1.add(new Conductor("Q12345678", "AIII-Profesional", "ABEL ABAD"));
        colec1.add("Ultimo elemento");
        
        // Recuperar y mostrar cada elemento
        // Pero de los vehículos solo mostrar la placa
        for(Object e: colec1) {
            // Obtener cada objeto y mostrarlo
            if(e instanceof Automovil) {
                System.out.println(((Automovil)e).getPlaca()); 
            } else {
                System.out.println(e); // se muestra el objeto e
            }
        }
    }
}
