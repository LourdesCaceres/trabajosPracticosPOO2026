
/**
 * Abstracción de un triángulo real, clase hija de la clase FiguraGeometrica,
 * agregando los datos básicos de un triángulo como ser su base y altura.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 16/10/2026
 */
public class Triangulo extends FiguraGeometrica
{
    // ATRIBUTOS
    private double base;
    private double altura;

    /**
     * CONSTRUCTOR PARA LA CLASE Triangulo: reutiliza el constructor de la clase padre.
     * 
     * @param p_origen: Punto - punto origen del triángulo.
     * @param p_altura: double - valor de altura del triángulo.
     * @param p_base: double - valor de la base del triángulo.
     */
    public Triangulo(double p_base, double p_altura, Punto p_origen){
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }
    
    //SETTERS
    private void setBase(double p_base){
        this.base = p_base;
    }
    
    private void setAltura(double p_altura){
        this.altura = p_altura;
    }
    
    //GETTERS
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Imprime un mensaje indicando el nombre de la figura, en este caso un triángulo.
     * Sobreescribe un método abstracto de la clase padre.
     */
    @Override
    public String nombreFigura(){
        return "****** Triángulo ******";
    }
    
    /**
     * Calcula la superficie del triángulo según la fórmula (base*altura)/2.
     * Sobreescribe un método abstracto de la clase padre.
     */
    @Override
    public double superficie(){
        //area = (base*altura)/2
        return (this.getBase() * this.getAltura()) / 2;
    }
}