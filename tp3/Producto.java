
/**
 * La clase Producto simula los productos de una droguería.
 * Se busca que se represente su precio de costo, su precio de lista,
 * alteraciones en estos y en su stock.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 24/08/2026
 */
public class Producto
{
    // atributos
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE PRODUCTO -
     * 
     * @param p_codigo: int - codigo del producto
     * @param p_rubro: String - rubro al que pertenece el producto.
     * @param p_desc: String - descripción del producto.
     * @param p_costo: double - precio de costo del producto.
     * @param p_porcPtoRepo: double - porcentaje del punto de reposición.
     * @param p_existMinima: int - existencia minima del producto.
     * @param p_lab: Laboratorio - laboratorio al que pertenece el producto.
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo,
                    double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab)
    {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE PRODUCTO -
     * 
     * @param p_codigo: int - codigo del producto
     * @param p_rubro: String - rubro al que pertenece el producto.
     * @param p_desc: String - descripción del producto.
     * @param p_costo: double - precio de costo del producto.
     * @param p_lab: Laboratorio - laboratorio al que pertenece el producto.
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo,
                    Laboratorio p_lab)
    {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setLaboratorio(p_lab);
    }
    
    /**
     * Asigna el codigo del producto
     * 
     * @param  p_codigo: int. 
     */
    //SETTERS
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
    /**
     * Asigna el rubro del producto
     * 
     * @param  p_rubro: String. 
     */
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    
    /**
     * Asigna la descrición del producto
     * 
     * @param  p_desc: String. 
     */
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    
    /**
     * Asigna el costo del producto
     * 
     * @param  p_costo: double. 
     */
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    /**
     * Asigna el stock del producto
     * 
     * @param  p_stock: int. 
     */
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    /**
     * Asigna el porcentaje de punto de reposición del producto
     * 
     * @param  p_porcPtoRepo: double. 
     */
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    /**
     * Asigna la existencia mínima del producto
     * 
     * @param  p_existMinima: int. 
     */
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    /**
     * Asigna el laboratorio del producto
     * 
     * @param  p_lab: Laboratorio. 
     */
    private void setLaboratorio(Laboratorio p_lab){
        this.laboratorio = p_lab;
    }
    
    //GETTERS
    /**
     * Obtiene el codigo del producto
     * 
     * @return codigo 
     */
    public int getCodigo(){
        return this.codigo;
    }
    
    /**
     * Obtiene el rubro del producto
     * 
     * @return rubro 
     */
    public String getRubro(){
        return this.rubro;
    }
    
    /**
     * Obtiene la descripcion del producto
     * 
     * @return descripcion 
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**
     * Obtiene el costo del producto
     * 
     * @return costo 
     */
    public double getCosto(){
        return this.costo;
    }
    
    /**
     * Obtiene el stock del producto
     * 
     * @return stock 
     */
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Obtiene el porcentaje de punto de reposicion del producto
     * 
     * @return porcPtoRepo 
     */
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    /**
     * Obtiene la existencia minima del producto
     * 
     * @return existMinima 
     */
    public int getExistMinima(){
        return this.existMinima;
    }
    
    /**
     * Obtiene el laboratorio del producto
     * 
     * @return laboratorio 
     */
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    //Métodos de clase
    /**
     * Suma o resta un importe a la cantidad de stock, reemplazando el valor.
     * 
     * @param p_cantidad: int - importe que aumenta o disminuye el stock.
     */
    public void ajuste(int p_cantidad){
        int nuevoStock = this.getStock();
        nuevoStock += p_cantidad;
        
        this.setStock(nuevoStock);
    }
    
    /**
     * Calcula el precio de lista del producto sumando al costo
     * el 12%.
     * 
     * @return precio de lista calculado.
     */
    public double precioLista(){
        return this.getCosto() + ((this.getCosto() * 12) / 100.0);
    }
    
    /**
     * Calcula el precio al contado del producto restandole al precio de lista
     * un 5%.
     * 
     * @return precio al pago contado.
     */
    public double precioContado(){
        return this.precioLista() - (this.precioLista() * 0.05);
    }
    
    /**
     * Calcula el valor total del stock mediante el producto del stock por el costo.
     * 
     * @return la suma del stock valorizado con un 12%
     */
    public double stockValorizado(){
        double valorStock = this.getStock() * this.getCosto();
        return  valorStock + (valorStock * 0.12);
    }
    
    /**
     * Pone un valor nuevo en el porcentaje de punto de reposicion.
     * 
     * @param p_porce: double - nuevo porcentaje
     */
    public void ajustarPorcPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    
    /**
     * Pone un valor nuevo en la existencia minima.
     * 
     * @param p_cantidad: int - nueva cantidad de existencia minima. 
     */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }
    
    /**
     * Imprime por pantalla los datos del producto.
     * Imprime los datos del laboratorio, el rubro, descripción,
     * precio de costo, stock y el valor del stock.
     */
    public void mostrar(){
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripción: " + this.getDescripcion());
        System.out.println("Precio Costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + " - Stock Valorizado: " + this.stockValorizado() + "\n");
    }
    
    /**
     * Concatena en una sola cadena la descripción del procuto, su precio de lista y su
     * precio al contado.
     * 
     * @return cadena formada con los datos del producto.
     */
    public String mostrarLinea(){
        return this.getDescripcion() + "\t" + this.precioLista() + "\t" + this.precioContado() + "\n";
    }
}