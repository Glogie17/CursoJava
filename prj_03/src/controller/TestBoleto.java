
package controller;

import model.Boleto;


public class TestBoleto {
    public static void main(String[] args) {
        //Una empresa vende boletos en todas sus sedes
        Boleto b1 = new Boleto("lima", "Trujllo");
        System.out.println(b1);
        Boleto b2 = new Boleto("Ica", "Arequipa");
        System.out.println(b2);
        Boleto b3 = new Boleto("Tacna", "Moquegua");
        System.out.println(b3);
    }
}
