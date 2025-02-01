
package controller;

public class DecisionMultiplesOpciones {
    public static void main(String[] args) {
        //Determinar el mes a que corresponde un numero. Por ejm:
        // si es 10 = Octubre
        
        int mesNro=17;
        
        switch(mesNro){
            case 1: 
                System.out.println("ENERO");
                break;
            case 2: 
                System.out.println("FEBRERO");
                break;
            case 3: 
                System.out.println("MARZO");
                break;
            case 4: 
                System.out.println("ABRIL");
                break;
            case 5: 
                System.out.println("MAYO");
                break;
            case 6: 
                System.out.println("JUNIO");
                break;
            case 7: 
                System.out.println("JULIO");
                break;
            case 8: 
                System.out.println("AGOSTO");
                break;
            case 9: 
                System.out.println("SEPTIEMBRE");
                break;
            case 10: 
                System.out.println("OCTUBRE");
                break;
            case 11: 
                System.out.println("NOVIEMBRE");
                break;
            case 12: 
                System.out.println("DICIEMBRE");
                break;
            default:
                System.out.println("opcion no valida");
                
        }
        
        
        
    }
}
