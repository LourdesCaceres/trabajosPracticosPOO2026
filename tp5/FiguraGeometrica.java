
/**
 * Clase abstracta que representa una figura geométrica cualquiera, con métodos básicos
 * que sus clases hijas complementarán.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 16/10/2026
 */
public abstract class FiguraGeometrica
{
    // ATRIBUTOS
    private Punto origen;

    /**
     * CONSTRUCTOR DE LA CLASE FiguraGeometrica
     * 
     * @param p_origen: Punto - punto origen de toda figura.
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
    /**
     * Método abstracto donde cada clase hija devolverá el nombre según la 
     * figura de la cual se trata.
     */
    public abstract String nombreFigura();
    
    /**
     * Método abstracto donde cada figura específica calcula la superficie según
     * su fórmula determinada.
     */
    public abstract double superficie();
    
    /**
     * Imprime en pantalla el nombre de la figura específica y su superficie.
     */
    public void mostrarSuperficie(){
        System.out.println(nombreFigura());
        System.out.println("Superficie: " + superficie());
    }
}