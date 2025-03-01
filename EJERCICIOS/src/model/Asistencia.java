/*
Crea un programa que registre la asistencia de los estudiantes en una clase. 
Usa un arreglo de booleanos para saber quién asistió y muestra un resumen 
de la asistencia.
 */
package model;

class Asistencia {
    public static void main(String[] args) {
        String[] estudiantes = {"Ana", "Carlos", "Luis", "María", "Jorge"};
        boolean[] asistencias = {true, false, true, true, false}; // true = asistió, false = faltó

        System.out.println("Resumen de asistencia:");
        for (int i = 0; i < estudiantes.length; i++) {
            if (asistencias[i]) {
                System.out.println(estudiantes[i] + " ASISTIÓ.");
            } else {
                System.out.println(estudiantes[i] + " FALTÓ.");
            }
        }
    }
}


