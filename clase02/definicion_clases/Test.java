
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main (String x [])
    {
    //Definicion /creacion del objeto
    // nombre_clase nombre_objeto;
    Alumno alum1;

    // Inicializarel objeto (darle un espacio en memoria)
    // Opcionalmente darle valores inicales
    // alum1 = null; // Es nada (no tiene espacio en memoria)
    
    // ... muchas lineas adelante recien se requiere llenar
    alum1 = new Alumno(); //Asignar espacio en memoria
    
    alum1.registrarAlumno(12345, "Tello", "Angie", 4);
    alum1.mostrarCarnet();
    
    System.out.println("---------------------------------");
    Curso cur1;
    cur1 = new Curso();
    //Podemos sintetizar lo anterior con "Curso cur1 = new Curso();"
    cur1.registrarCurso(122568, "Java", "3pm", "12/02/2025");
    cur1.mostrar();
    System.out.println("---------------");
    cur1.ModificarFechaInico("25/02/2025");
    cur1.mostrar();
    System.out.println("---------------------------------");
    System.out.println(cur1.nom_curso);
    }
}
