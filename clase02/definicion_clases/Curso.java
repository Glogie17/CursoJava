
/**
 * Write a description of class Curso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curso
{
    // Atributos con acceso privado
    private int cod_curso;
    public String nom_curso;
    private String horario;
    private String fec_inici;
   
 
    
    //metodos / operaciones
    public void registrarCurso (int cod, String nom, String hor, String fec) {
        cod_curso = cod;
        nom_curso = nom;
        horario = hor;
        fec_inici = fec;
    } 
     
    public void mostrar() {
            System.out.println("Codigo: " + cod_curso);
            System.out.println("Nombre del curso: " + nom_curso);
            System.out.println("Horario: " + horario);
            System.out.println("Fecha de Inicio: " + fec_inici);
    } 
    
    public void ModificarFechaInico(String nuevaFecha) {
        fec_inici = nuevaFecha;
        
    }
}
