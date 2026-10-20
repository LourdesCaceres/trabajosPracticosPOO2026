/**
 * Heladera
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 14/10/2026
 */
public class Heladera extends ArtefactoHogar {
    //nuevos atributos de instancia
    private int pies;
    private int puertas;
    private boolean comprensor;

    /**
     * Constructor de la clase Heladera
     * 
     * @param
     */
    public Heladera(String p_marca, float p_precio, int p_stock){
        super(p_marca, p_precio, p_stock);

    }

    //Mutadores (SETTERS)
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    //Observadores (GETTERS)
}
