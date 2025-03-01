
package controller;

public class Arreglo3 {
    public static void main(String[] args) {
        model.Automovil veh1 = new model.Automovil("ABC100","KIA", 2005);
        System.out.println(veh1);
        
        //Creacion de arreglo
        int cantidad = 5;
        model.Automovil vehs[];
        
        //Indicar la cantidad de vehiculos
        vehs = new model.Automovil [cantidad];
                
        //Inicializarlos con null
        for (int i = 0; i < cantidad; i++){
            vehs[i] = null;
        }
        
        //Mucho mas adelante de puede usar
        
        //Asignando valor al elemento de indice 3
        vehs[3] = new model.Automovil("cvb256", "VOLVO", 2020);
        vehs[1] = new model.Automovil("ASD859", "NISSAN", 2015);
        
        //Mostrar los datos
        System.out.println("LISTA DE VEHICULOS");
        for (int i = 0; i < cantidad ; i++){
            if (vehs[i] != null){
                System.out.println(vehs[i]);

            }
        }

    }
}
