
package controller;
import model.*;
public class Test02 {
    public static void main(String[] args) {
        Cliente cli1;
        
        cli1 = new ClienteNatural("2155544", "ABEL ABAD", 2000);
        
        if (cli1 instanceof ClienteJuridico){
            System.out.println("cli1 es un tipo de Cliente Juridico");
        } else {
            System.out.println("cli1 es un tipo de Cliente Natural");
        }
    }
}
