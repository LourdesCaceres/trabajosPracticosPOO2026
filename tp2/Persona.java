
/**
 * Write a description of class Persona here.
 * 
 * @author (LourdesCaceres) 
 * @version (1.0)
 */
//Para trabajar con fechas, agregar:    
import java.util.*;
 
public class Persona {
    // instance variables 
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setAnioNacimiento(p_anio);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getDNI(){
        return nroDni;
    }
    private void setDNI(int p_dni){
        nroDni = p_dni;
    }
    public String getNombre(){
        return nombre;
    }
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    public String getApellido(){
        return apellido;
    }
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    public int getAnioNacimiento(){
        return anioNacimiento;
    }
    private void setAnioNacimiento(int p_anio){
        anioNacimiento = p_anio;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */    
    public int edad(int p_anioN){
        Calendar fechaHoy = new GregorianCalendar();
        int anioActual = fechaHoy.get(Calendar.YEAR);
        return (anioActual - p_anioN);
    }
    public String nomYApe(){
        return getNombre()+" "+getApellido();    //concatenar nombre y apellido
    }
    public String apeYNom(){
        return getApellido()+" "+getNombre(); //concatenar apellido y nombre
    }
    public void mostrar(){
        //mostrar nombre y apellido
        System.out.print("Nombre y Apellido: "+nomYApe()+"\n");
        System.out.print("DNI: "+getDNI()+"\t");
        System.out.print("Edad: "+edad(getAnioNacimiento())+" años\n");
    }
}