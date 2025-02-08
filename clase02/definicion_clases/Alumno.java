
/**
 * Write a description of class Alumno here.
 * 
 * @author Angie Tello
 * @version 1.0
 */
public class Alumno
{
    // Atributos con acceso privado
    private int cod_alum;
    private String dni;
    private String apellidos;
    private String nombres;
    private String especialidad;
    private String fec_nacm;
    private String fec_inscrip;
    private int año_estudios;
    
    //metodos / operaciones
    public void registrarAlumno(int cod, String ape, String nom, int año_est) {
        cod_alum = cod;
        apellidos = ape;
        nombres = nom;
        año_estudios = año_est;
    } 
    public int obtenerAñoEstudios() {
        return año_estudios;
    } 
    public void mostrarCarnet() {
            System.out.println("Codigo: " + cod_alum);
            System.out.println("Apellido: " + apellidos);
            System.out.println("Nombres: " + nombres);
            System.out.println("Año de estudios: " + año_estudios);
    } 
    
}
