
/**
 *  Clase que guarda el nombre y provincia de una localidad.
 * 
 * @author Chavez, Tobías Acdel
 * @version 1.0 - 31/08/2026
 */
public class Localidad
{
    // ATRIBUTOS
    private String nombre;
    private String provincia;
    
    /**
     * CONSTRUCTOR DE LA CLASE Localidad.
     * 
     * @param p_nombre: String - nombre de la localidad.
     * @param p_provincia: String - nombre de la provincia donde se ubica la localidad.
     */
    public Localidad(String p_nombre, String p_provincia){
        setNombre(p_nombre);
        setProvincia(p_provincia);
    }
    
    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public String getProvincia(){
        return this.provincia;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Concatena en una sola linea los datos de la localidad.
     * 
     * @return la cadena concatenada.
     */
    public String mostrar(){
        return "Localidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia();
    }
}