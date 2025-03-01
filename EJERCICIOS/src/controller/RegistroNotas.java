
package controller;
import model.*;
/**
 *
 * @author User
 */
public class RegistroNotas {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan");
        
        alumno1.agregarNota(18);
        alumno1.agregarNota(15);
        alumno1.agregarNota(12);
        
        alumno1.mostrarDetalles();
    }
}
