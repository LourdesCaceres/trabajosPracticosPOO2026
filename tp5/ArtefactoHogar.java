/**
 * 
 * AccesorioHogar
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 08/10/2026
 */
public abstract class ArtefactoHogar{
    //variables de instancia
    private String marca;
    private float precio;
    private int stock;

    /**
     * Constructor de la clase ArtefactoHogar
     * 
     * @param p_marca
     * @param p_precio
     * @param p_stock
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock){
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    //Mutadores (SETTERS)
    private void setMarca(String p_marca){
        this.marca = p_marca;
    }
    private void setPrecio(float p_precio){
        this.precio = p_precio;
    }
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    //Observadores (GETTERS)
    public String getMarca(){
        return this.marca;
    }
    public float getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }

    /**
     * metodo abstracto creditoConAdicional()
     * 
     * @param p_cuotas
     * @param p_interes
     * @return monto total (float)
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);

    /**
     * imprimir informacion
     */
    public void imprimir(){
        System.out.print("\nMarca: "+this.getMarca()+"\t-\tPrecio: $ "+this.getPrecio()+"\t-\tStock: "+this.getStock());
    }
    /**
     * calcular el valor de cada cuota
     * 
     * @param p_cuotas cant. de cuotas
     * @param p_interes valor del interes
     * @return monto total (float)
     */
    public float cuotaCredito(int p_cuotas, float p_interes){
        if(p_cuotas <= 0){
            System.out.print("\n...ERROR no se puede realizar la division");
            return -1F;
        }
        float interes = this.getPrecio() * p_interes / 100 * p_cuotas;
        return (this.getPrecio() + interes) / p_cuotas;
    }
}