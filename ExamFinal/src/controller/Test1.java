package controller;
import model.*;
public class Test1 {
    public static void main(String[] args) {
        
        Pasajero p1 = new Pasajero   ("12345645", "Claudio", "ARE12","B12" );
        Conductor c1 = new Conductor ("96325800", "Pepito","852369" ,"ACU-526");
        //Pasaporte -> Persona // relacion de uno a uno
        Viaje via1 = new Viaje ("235","Lima","Arequipa",p1, c1);
        System.out.println(via1);

    }
}
