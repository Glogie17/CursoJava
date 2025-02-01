
package controller;

public class DecisionDosOpciones {
    public static void main(String[] args) {
        //Determinar nsi un alumno a aprobado o desaprobado el curso de java prog
        
        double nota=17.8;
        
        if (nota>=14){
            System.out.println("Aprobado con " + nota);
        }else{
            System.out.println("Desaprobado con " + nota);
        }
    }
}
