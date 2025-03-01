package controller;
import model.*;

public class Test1 {
    public static void main(String[] args) {
        Persona p1 = new Persona ("12345645", "Miguel Angel");
        Persona p2 = new Persona ("98745632", "Ana Maria");
        //Pasaporte -> Persona // relacion de uno a uno
        Pasaporte pass1 = new Pasaporte ("0012345678", p1);
        System.out.println(pass1);

    }
}
