
package controller;

public class Participacion {
    public static void main(String[] args) {
        //Determinar nsi un alumno a aprobado o desaprobado el curso de java prog
        double nota = 16;
        
        if (nota < 0 || nota > 20) {
            System.out.println("CALIFICACIÓN INVÁLIDA");
        } else if (nota < 10) {
            System.out.println("DESAPROBADO");
        } else if (nota >= 10 && nota < 14) {
            System.out.println("PARA SUSTITUTORIO");
        } else { // nota >= 14 y dentro del rango válido
            System.out.println("APROBADO");
        }
        
    }
}
