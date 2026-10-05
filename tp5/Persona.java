import java.util.*;
/**
 * Modificación de la clase Persona, cambia uno de los atributos que solian ser de tipo
 * int por uno de tipo Calendar. Agrega además un método para saber si es el cumpleaños de la persona.
 * 
 * @author Chavez, Tobías Acdel
 * @version 2.0 - 01/09/2026
 */
public class Persona{
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    /**
     * PRIMER CONSTRUCTOR DE LA CLASE PERSONA: constructor anterior, usa el año de nacimiento.
     * 
     * @param p_dni: int - dni de la persona.
     * @param p_nombre: String - nombre de la persona.
     * @param p_apellido: String - apellido de la persona.
     * @param p_anio: int - año de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setAnioNacimiento(p_anio);
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE PERSONA: usa la fecha completa de nacimiento.
     * 
     * @param p_dni: int - dni de la persona.
     * @param p_nombre: String - nombre de la persona.
     * @param p_apellido: String - apellido de la persona.
     * @param p_fecha: Calendar - fecha de nacimiento de la persona.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        setDNI(p_dni);
        setNombre(p_nombre);
        setApellido(p_apellido);
        setFechaNacimiento(p_fecha);
    }
    
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setAnioNacimiento(int p_anio){
        fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.clear();
        this.fechaNacimiento.set(Calendar.YEAR, p_anio);
    }
    
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    
    public int getDNI(){
        return this.nroDni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getAnioNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }
    
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    /**
     * Calcula la edad de la persona restando el año de nacimiento al año actual.
     * 
     * @return edad calculada de la persona.
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - this.getFechaNacimiento().get(Calendar.YEAR);
    }
    
    /**
     * Concatena el nombre y apellido de la persona.
     * 
     * @return cadena formada.
     */
    public String nomYApe(){
        return getNombre() + ", " + getApellido();
    }
    
    /**
     * Concatena el apellido y nombre de la persona.
     * 
     * @return cadena formada.
     */
    public String apeYNom(){
        return getApellido() + ", " + getNombre();
    }
    
    /**
     * Imprime en pantalla los datos de la persona.
     * Imprime su nombre completo, dni y edad.
     */
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nomYApe());
        System.out.print("DNI: " + getDNI());
        System.out.println("\tEdad: " + edad());
    }
    
    /**
     * Verifica si coincide la fecha de nacimiento con la fecha actual
     * para saber si es su cumpleaños. Se debe verificar que sea el mismo mes y dia.
     * 
     * @return verdadero o falso según se cumplen las condiciones.
     */
    public boolean esCumpleaños(){
        Calendar fechaHoy = Calendar.getInstance();
        
        return fechaHoy.get(Calendar.DAY_OF_MONTH) == this.fechaNacimiento.get(Calendar.DAY_OF_MONTH)
                && fechaHoy.get(Calendar.MONTH) == this.fechaNacimiento.get(Calendar.MONTH);
    }
}