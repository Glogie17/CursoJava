package model;

/**
 * Clase para gestionar a las personas naturales como clientes 
 * @author Alumno
 */
// ClienteNatural será hija de Cliente
// ClienteNatural es subclase de la superclase Cliente
// ClienteNatural proviene de Cliente
public class ClienteNatural extends Cliente {
    private String DNI;

    public ClienteNatural(String DNI,String nombre, double capacidad_compra) {
        super(nombre, capacidad_compra);
        this.DNI = DNI;
    }
    
    public ClienteNatural(String DNI,String nombre, double capacidad_compra,
            String domicilio, String email, int año_inscrip) {
        super(nombre, capacidad_compra, domicilio, email, año_inscrip);
        this.DNI = DNI;
    }
    
    // Manipulará año_inscrip
    public int getAntiguedad() {
        // año actual - año_inscrip
        // El acceso a año_inscrip desde esta clase es
        // porque en la clase padre se ha definido con
        // acceso protegido (si fuera privado NO es accesible)
        return 2025 - año_inscrip; 
    }

    // Sobre escribe el método toString de la clase padre
    @Override
    public String toString() {
        return "ClienteNatural{" + "DNI=" + DNI + ", " + super.toString() + '}';
    }
    
    
    
}