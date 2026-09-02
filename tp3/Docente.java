
/**
 * Clase que representa la abstracción de un Docente que trabaja en una Escuela.
 * Permite la registrar su nombre, y calcular el monto de sueldo. 
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 31/08/2026
 */
public class Docente {
    // variables de instancia
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    /**
     * Constructor de la clase Docente
     */
    public Docente(String p_nombre, String p_grado, double p_sueldo, double p_asignacion){

        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldo);
        this.setAsignacionFamiliar(p_asignacion);
    }

    //Mutadores (SETTER)
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    private void setSueldoBasico(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    private void setAsignacionFamiliar(double p_asignacion){
        this.asignacionFamiliar = p_asignacion;
    }

    //Observadores (GETTERS)
    public String getNombre(){
        return this.nombre;
    }
    public String getGrado(){
        return this.grado;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    public double getAsigFamiliar(){
        return this.asignacionFamiliar;
    }
    
    /**
     * Calcula el sueldo total de cada docente, sumando el basico mas la asignacion familiar
     * 
     * @return  el monto total del sueldo 
     */
    public double calcularSueldo(){
        return this.getSueldoBasico() + this.getAsigFamiliar();
    }

}