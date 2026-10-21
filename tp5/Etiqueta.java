
/**
 * La clase Etiqueta representa representa la etiqueta dada a un paquete, pudiendo ser 
 * común o premium, cada una calculando el precio de una forma distinta, por eso se implementa
 * mediante una clase abstracta.
 * 
 * @author Chavez, Tobías Acdel
 * @version 1.0 - 20/10/2026
 */
public abstract class Etiqueta
{
    // ATRIBUTOS
    private double costo;

    /**
     * CONSTRUCTOR DE LA CLASE Etiqueta
     * 
     * @param p_costo: double - costo base de la etiqueta.
     */
    public Etiqueta(double p_costo){
        this.setCosto(p_costo);
    }

    //SETTER
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    //GETTER
    public double getCosto(){
        return this.costo;
    }
    
    //Métodos de clase
    /**
     * Método abstracto donde las clases hijas definiran la forma en la
     * que se calculará el precio total de la etiqueta.
     * 
     * @param q: int - representa la cantidad unidades.
     * @return double con el precio calculado.
     */
    public abstract double precio(int q);
    
    /**
     * Método abstracto donde la clases hijas definiran el tipo de la etiqueta.
     * 
     * @return cadena con el tipo de la etiqueta.
     */
    protected abstract String tipo();
    
    /**
     * Concatena en una cadena los datos básicos de la etiqueta para que las clases
     * hijas puedan completarlo.
     * 
     * @return cadena concatenada.
     */
    public String toString(){
        return "tipo: " + this.tipo() + " - Costo: $" + this.getCosto();
    }
}