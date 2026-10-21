
/**
 * Abstracción de una etiqueta de tipo común para un paquete. Implementa un plus según el diseño
 * aunque también puede aplicar un descuento según la cantidad de unidades.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 20/10/2026
 */
public class Comun extends Etiqueta
{
    // ATRIBUTOS
    private double plus;

    /**
     * CONSTRUCTOR DE LA CLASE Comun: reutiliza el constructor de la clase padre.
     * 
     * @param p_costo: double - costo base de la etiqueta.
     * @param p_plus: double - monto agregado por el diseño.
     */
    public Comun(double p_costo, double p_plus){
        super(p_costo);
        this.setPlus(p_plus);
    }

    //SETTERS
    private void setPlus(double p_plus){
        this.plus = p_plus;
    }
    
    //GETTER
    public double getPlus(){
        return this.plus;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Define el comportamiento de un método abstracto de la clase padre.
     * Devuelve una cadena indicando el tipo de etiqueta.
     * 
     * @return cadena "Comun"
     */
    @Override
    protected String tipo(){
        return "Comun";
    }
    
    /**
     * Calcula el descuento que se aplicará en base a la cantidad de unidades, devolviendo el porcentaje
     * calculado.
     * 
     * @param q: int - cantidad de unidades.
     * @return porcentaje de descuento.
     */
    private double descuento(int q){
        if(q <= 10){
            return 0;
        }else if(q <= 50 && q >= 11){
            return 0.02;
        }else if(q >= 51 && q <= 100){
            return 0.05;
        }else{
            return (q/10) * 0.01;
        }
    }
    
    /**
     * Define el comportamiento de un método abstracto. Calcula el precio de la etiqueta
     * en base a la cantidad de unidades, el plus y aplicar un descuento si corresponde.
     * 
     * @param q: int - cantidad de unidades.
     * @return precio final.
     */
    @Override
    public double precio(int q){
        double subtotal = q * this.getCosto() + this.getPlus();
        return subtotal - subtotal * this.descuento(q);
    }
    
    /**
     * Concatena en una cadena la información final de la etiqueta
     * 
     * @return cadena concatenada.
     */
    @Override
    public String toString(){
        return super.toString() + " - Diseño: $" + this.getPlus();
    }
}