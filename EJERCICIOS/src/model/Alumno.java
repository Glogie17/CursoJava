/*
Crea una clase Alumno con nombre y una lista de notas. Luego, 
implementa métodos para agregar notas, calcular el promedio y mostrar 
detalles del alumno.
 */
package model;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Double> notas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) return 0;
        
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public void mostrarDetalles() {
        System.out.println("Alumno: " + nombre);
        System.out.println("Notas: " + notas);
        System.out.println("Promedio: " + calcularPromedio());
    }
}


