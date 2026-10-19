
/**
 * La clase Cuadrado es una extensión (especialización) para la clase Rectangulo, los lados de la figura
 * son iguales y se redefinen funciones como nombreFigura() y caracteristicas().
 * 
 * @author Chavez, Tobías Acdel 
 * @version 05/10/2026
 */
public class Cuadrado extends Rectangulo
{
    //ATRIBUTOS
    private double lado;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE Cuadrado
     * 
     * @param p_origen: Punto - punto origen de la figura.
     * @param p_ancho: double - valor del ancho de la figura.
     * @param p_alto: double - valor de alto de la figura.
     * @param p_lado: double - valor de los lados del cuadrado.
     */
    public Cuadrado(Punto p_origen, double p_ancho, double p_alto, double p_lado){
        super(p_origen, p_ancho, p_alto);
        this.setLado(p_lado);
    }
    
    //SETTER
    private void setLado(double p_lado){
        this.lado = p_lado;
    }
    
    //GETTER
    public double getLado(){
        return this.lado;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Devuelve un String con el nombre de la figura de la clase.
     * 
     * @return String con el nombre de la figura.
     */
    public String nombreFigura(){
        return "*****Cuadrado*****";
    }
    
    /**
     * Imprime en pantalla las características del cuadrado, indicando el nombre de la figura,
     * las coordenadas de su punto origen, el valor de sus lados, su superficie y el perimetro.
     */
    public void caracteristicas(){
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + super.getOrigen().coordenadas() + " - Lado: " + this.getLado());
        System.out.println("Superficie: " + super.superficie() + " Perimetro: " + super.perimetro());
    }
}