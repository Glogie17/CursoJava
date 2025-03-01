/*
Crea un programa que administre una lista de usuarios en una aplicación. 
Debe permitir agregar, eliminar y mostrar usuarios.
 */
package controller;
import java.util.ArrayList;
public class GestionUsuarios {
    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();

        // Agregar usuarios
        usuarios.add("Ana");
        usuarios.add("Carlos");
        usuarios.add("Luis");

        // Mostrar lista
        System.out.println("Usuarios registrados:");
        for (String usuario : usuarios) {
            System.out.println(usuario);
        }

        // Eliminar un usuario
        usuarios.remove("Carlos");
        System.out.println("\nDespués de eliminar a Carlos:");
        for (String usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}
