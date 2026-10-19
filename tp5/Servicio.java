
/**
 * Write a description of class Servicio here.
 * 
 * @author Chavez, Tobías Acdel
 * @version 1.0 - 16/10/2026
 */
public class Servicio
{
    // ATRIBUTOS
    private String descripcion;
    private double precio;

    /**
     * Constructor for objects of class Servicio
     */
    public Servicio(String p_descripcion, double p_precio){
        this.setDescripcion(p_descripcion);
        this.setPrecio(p_precio); 
    }
    
    //SETTERS
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    
    private void setPrecio(double p_precio){
        this.precio = p_precio;
    }
    
    //GETTERS
    public String getDescripcion(){
        return this.descripcion;
    }
    
    public double getPrecio(){
        return this.precio;
    }
}