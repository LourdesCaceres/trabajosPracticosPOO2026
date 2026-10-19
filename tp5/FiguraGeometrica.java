
/**
 * Write a description of class FiguraGeometrica here.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 16/10/2026
 */
public abstract class FiguraGeometrica
{
    // ATRIBUTOS
    private Punto origen;

    /**
     * Constructor for objects of class FiguraGeometrica
     */
    public FiguraGeometrica(Punto p_origen){
        this.setOrigen(p_origen);
    }

    //SETTERS
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    
    //GETTERS
    public Punto getOrigen(){
        return this.origen;
    }
    
    //MÉTODOS DE CLASE
    public abstract String nombreFigura();
    
    public abstract double superficie();
    
    public void mostrarSuperficie(){
        System.out.println(nombreFigura());
        System.out.println("Superficie: " + superficie());
    }
}