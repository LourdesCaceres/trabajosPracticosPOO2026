/**
 * Subclase Heladera, de la clase ArtefactoHogar. Representa las caracteristicas específicas de este electrodomestico
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 14/10/2026
 */
public class Heladera extends ArtefactoHogar {
    //nuevos atributos de instancia
    private int pies;
    private int puertas;
    private boolean compresor;

    /**
     * Constructor de la clase Heladera.
     * 
     * @param p_marca: String - marca de la heladera.
     * @param p_precio: float - precio de contado.
     * @param p_stock: int - unidades disponibles.
     * @param p_pies: int - capacidad en pies.
     * @param p_puertas: int - cantidad de puertas.
     * @param p_compresor: boolean - indica si posee compresor.
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor){
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setComprensor(p_compresor);
    }

    //Mutadores (SETTERS)
    private void setPies(int p_pies){
        this.pies = p_pies;
    }
    private void setPuertas(int p_puertas){
        this.puertas = p_puertas;
    }
    private void setComprensor(boolean p_compresor){
        this.compresor = p_compresor;
    }
    //Observadores (GETTERS)
    public int getPies(){
        return this.pies;
    }
    public int getPuertas(){
        return this.puertas;
    }
    public boolean getCompresor(){
        return this.compresor;
    }

    /**
     * Implementacion del método creditoConAdicional.
     * Si la heladera posee compresor se suman $50 por cuota en concepto de seguro.
     * 
     * @param p_cuotas
     * @param p_interes
     */
    @Override 
    public float creditoConAdicional(int p_cuotas, float p_interes){
        if(!this.getCompresor()){
            return super.cuotaCredito(p_cuotas, p_interes);
        }
        return super.cuotaCredito(p_cuotas, p_interes) + 50.0F;
    }
    /**
     * Redefinición del método imprimir(), agrega el encabezado y los datos particulares de la heladera.
     */
    @Override 
    public void imprimir(){
        System.out.print("\n\n**** Heladera ****");
        super.imprimir();
        System.out.print("\nPies: "+this.getPies());
        System.out.print("\nPuertas: "+this.getPuertas());
        if(this.getCompresor()){
            System.out.print("\nCompresor: Si");
        }else{
            System.out.print("\nCompresor: No");
        }
    }
}
