
package controller;
import model.*;


public class Test2 {
    public static void main(String[] args) {
        Persona p1 = new Persona ("12345645", "Miguel Angel");
        Persona p2 = new Persona ("98745632", "Ana Maria");
        

        //EquipoFutbol -> Persona // de uno a muchos
        EquipoFutbol eq = new EquipoFutbol ("Boca Junior");
        eq.addJugador(p1);
        eq.addJugador(p2);
        
        eq.addJugador ( new Persona ("8523685", "Abel"));
        eq.addJugador ( new Persona ("9874561", "Santiago"));
        System.out.println(eq);
        eq.mostrarJugadores();
           
    }
}
