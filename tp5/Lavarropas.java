/**
 * Subclase Lavarropa, de la clase ArtefactoHogar.
 * Representa las caracteristicas específicas de este electrodomestico
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 14/10/2026
 */
public class Lavarropas extends ArtefactoHogar{

    //nuevos atributos de instancia
    private int programas;
    private float kilos;
    private boolean automatico;

    /**
     * Constructor de la clase Lavarropas.
     * 
     * @param p_marca: String - marca del lavarropas.
     * @param p_precio: float - precio de contado.
     * @param p_stock: int - unidades disponibles.
     * @param p_programas: int - cantidad de programas de lavado.
     * @param p_kilos: float - capacidad de carga en kilos.
     * @param p_automatico: boolean - indica si es automático.
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos, boolean p_automatico){
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }

    //Mutadores (SETTERS)
    private void setProgramas(int p_programas){
        this.programas = p_programas;
    }
    private void setKilos(float p_kilos){
        this.kilos = p_kilos;
    }
    private void setAutomatico(boolean p_automatico){
        this.automatico = p_automatico;
    }
    //Observadores (GETTERS)
    public int getProgramas(){
        return this.programas;
    }
    public float getKilos(){
        return this.kilos;
    }
    public boolean getAutomatico(){
        return this.automatico;
    }
}
