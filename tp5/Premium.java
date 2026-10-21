/**
 * Abstracción de una etiqueta de tipo premium para un paquete. Implementa una determinada cantidad de colores
 * que servirán para calcular un plus a agregar al precio.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 20/10/2026
 */
public class Premium extends Etiqueta
{
    // ATRIBUTOS
    private int colores;

    /**
     * CONSTRUCTOR DE LA CLASE Premium: reutiliza el constructor de la clase padre.
     * 
     * @param p_costo: double - costo base de la etiqueta.
     * @param p_colores: int - Cantidad de colores.
     */
    public Premium(double p_costo, int p_colores){
        super(p_costo);
        this.setColores(p_colores);
    }

    //SETTERS
    private void setColores(int p_colores){
        this.colores = p_colores;
    }
    
    //GETTER
    public int getColores(){
        return this.colores;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Define el comportamiento de un método abstracto de la clase padre.
     * Devuelve una cadena indicando el tipo de etiqueta.
     * 
     * @return cadena "Premium"
     */
    @Override
    protected String tipo(){
        return "Premium";
    }
    
    /**
     * Calcula el plus que se va a aplicar en base a la cantidad de colores.
     * Utiliza un if a forma de verificar si hay más de 3 colores así también para filtrar datos
     * inválidos. Para no utilizar if anidados optamos por un switch case.
     * 
     * @return porcentaje a agregar.
     */
    private double plus(){
        if(this.getColores() > 3){
            return this.getColores() * 0.03;
        }else{
         switch(this.getColores()){
             case 1:
                 return 0;
             case 2: 
                 return 0.05;
             case 3:
                 return 0.07;
             default:
                 System.out.println("Cantidad inválida!");
                 return 0;
         }
        }
    }
    
    /**
     * Define el comportamiento de un método abstracto. Calcula el precio de la etiqueta
     * en base a la cantidad de unidades y el plus si corresponde.
     * 
     * @param q: int - cantidad de unidades.
     * @return precio final.
     */
    @Override
    public double precio(int q){
        double subtotal = q * this.getCosto();
        return subtotal + (subtotal * this.plus());
    }
    
    /**
     * Concatena en una cadena la información final de la etiqueta
     * 
     * @return cadena concatenada.
     */
    @Override
    public String toString(){
        return super.toString() + " - Colores: " + this.getColores();
    }
}