//Para trabajar con fechas, agregar la clase:    
import java.util.*;

/**
 * Clase que representa la abstracción de una Persona dentro del sistema.
 * Permite registrar datos personales y calcular su edad actual.
 * 
 * @author Lourdes Gabriela Caceres
 * @version 1.0 13/08/2026
 */
public class Persona {
    
    // variables de instancia
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    /**
     * Constructor de la clase Persona
     * @param p_dni Número de documento de la persona
     * @param p_nombre Nombre de la persona
     * @param p_apellido Apellido de la persona
     * @param p_anio Año de nacimiento de la persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setAnioNacimiento(p_anio);
    }

    //Observadores (Getters)
    public int getDNI(){
        return nroDni;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int getAnioNacimiento(){
        return anioNacimiento;
    }
    
    //Mutadores (Setters)
    private void setDNI(int p_dni){
        nroDni = p_dni;
    }

    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }

    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }

    private void setAnioNacimiento(int p_anio){
        anioNacimiento = p_anio;
    }
    
    /**
     * Método que calcula la edad de la persona en funcion del año actual.
     * 
     * @return La cantidad de años (edad) cumplidos hasta la fecha actual.
     */    
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioActual = fechaHoy.get(Calendar.YEAR);
        return (anioActual - getAnioNacimiento());
    }
    
    /**
     * Método que concatena el nombre y apellido de la persona
     * 
     * @return Cadena con el formato "Nombre Apellido"
     */
    public String nomYApe(){
        return getNombre()+" "+getApellido(); 
    }
    
    /**
     * Concatena el apellido y nombre de la persona
     * 
     * @return Cadena con el formato "Apellido Nombre"
     */
    public String apeYNom(){
        return getApellido()+" "+getNombre(); 
    }
    
    /**
     * Muestra por pantalla los datos personales de la persona:
     * Nombre y Apellido, DNI y edad actual a la fecha.
     */
    public void mostrar(){
        System.out.print("\n\nNombre y Apellido: "+nomYApe());
        System.out.print("\nDNI: "+getDNI()+"\t");
        System.out.print("Edad: "+edad()+" años");
    }
}