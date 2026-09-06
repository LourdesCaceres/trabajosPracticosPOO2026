
/**
 * Clase que representa un paciente con sus datos.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 31/08/2026
 */
public class Paciente
{
    // ATRIBUTOS
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    /**
     * CONSTRUCTOR DE LA CLASE PACIENTE
     * 
     * @param p_historia: int - numero de historia clinica
     * @param p_nombre: String - nombre del paciente.
     * @param p_domicilio: String - domicilio donde reside el paciente.
     * @param p_localidadNacido: Localidad - localidad donde nació el paciente.
     * @param p_localidadVive: Localidad - localidad donde vive actualmente el paciente.
     */
    public Paciente(int p_historia, String p_nombre, String p_domicilio,
                    Localidad p_localidadNacido, Localidad p_localidadVive){
        setHistoria(p_historia);
        setNombre(p_nombre);
        setDomicilio(p_domicilio);
        setNacido(p_localidadNacido);
        setVive(p_localidadVive);
    }
    
    //SETTERS
    private void setHistoria(int p_historia){
        this.historiaClinica = p_historia;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    private void setNacido(Localidad p_localidadNacido){
        this.localidadNacido = p_localidadNacido;
    }
    
    private void setVive(Localidad p_localidadVive){
        this.localidadVive = p_localidadVive;
    }
    
    //GETTERS
    public int getHistoria(){
        return this.historiaClinica;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getDomicilio(){
        return this.domicilio;
    }
    
    public Localidad getNacido(){
        return this.localidadNacido;
    }
    
    public Localidad getVive(){
        return this.localidadVive;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Muestra por pantalla los datos del paciente, siendo su nombre,
     * historia clinica, domicilio y la localidad donde vive.
     * Para mostrar los datos de la localidad se hizo uso del método mostrar() presente
     * en la clase Localidad.
     */
    public void mostrarDatosPantalla(){
        System.out.println("Paciente: " + this.getNombre() + "\tHistoria Clínica: " + this.getHistoria()
                            + "\tDomicilio: " + this.getDomicilio());
        System.out.println(this.localidadVive.mostrar());                    
    }
    
    public String cadenaDeDatos(){
        return this.getNombre() + "......" + this.getHistoria() + "......" + this.getDomicilio() +
                "-" + this.localidadVive.getNombre() + "-" + this.localidadVive.getProvincia();
    }
}