/**
 * Subclase Cocina, de la clase ArtefactoHogar. 
 * Representa las caracteristicas específicas de este electrodomestico
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 14/10/2026
 */
public class Cocina extends ArtefactoHogar{
    
    //nuevos atributos de instancia
    private int hornallas;
    private int calorias;
    private String dimensiones;

    /**
     * Constructor de la clase Cocina.
     * 
     * @param p_marca: String - marca de la cocina.
     * @param p_precio: float - precio de contado.
     * @param p_stock: int - unidades disponibles.
     * @param p_hornallas: int - cantidad de hornallas.
     * @param p_calorias: int - calorías de las hornallas.
     * @param p_dimensiones: String - dimensiones
     */
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones){
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }

    //Mutadores (SETTERS)
    private void setHornallas(int p_hornallas){
        this.hornallas = p_hornallas;
    }
    private void setCalorias(int p_calorias){
        this.calorias = p_calorias;
    }
    private void setDimensiones(String p_dimensiones){
        this.dimensiones = p_dimensiones;
    }
    //Observadores (GETTERS)
    public int getHornallas(){
        return this.hornallas;
    }
    public int getCalorias(){
        return this.calorias;
    }
    public String getDimensiones(){
        return this.dimensiones;
    }

    /**
     * 
     */
}
