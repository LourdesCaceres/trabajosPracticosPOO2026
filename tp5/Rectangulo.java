/**
 * Representa la abstraccion de una figura geométrica (rectángulo) en el plano,
 * definida por un punto de origen (de la clase Punto), un ancho y un alto.
 * La actualización 2.0 agrega el método nombreFigura().
 * La versión 3.0 vuelve la clase una subclase de la clase abstracta FiguraGeometrica.
 * 
 * @author Lourdes Gabriela Caceres
 * @version 1.0 27/08/2026
 * @version 2.0 05/10/2026
 * @version 3.0 16/10/2026
 */
public class Rectangulo extends FiguraGeometrica{
    //ATRIBUTOS
    private double ancho;
    private double alto;

    /**
     * 1er CONSTRUCTOR de la clase Rectangulo: para el caso en que el
     * origen se encuentra en el punto (0,0), y solo recibe las dimensiones (ancho-alto)
     * 
     * @param p_ancho
     * @param p_alto
     */
    public Rectangulo(double p_ancho, double p_alto){
        super(new Punto(0,0));
        setAncho(p_ancho);
        setAlto(p_alto);
    }

    /**
     * 2do CONSTRUCTOR de la clase Rectangulo: para el caso ...
     * 
     * @param p_origen
     * @param p_ancho
     * @param p_alto
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        super(p_origen);
        setAncho(p_ancho);
        setAlto(p_alto);
    }

    //Observadores (GETTERS)
    public double getAncho(){
        return this.ancho;
    }
    
    public double getAlto(){
        return this.alto;
    }

    //Mutadores (SETTERS)
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }

    /**
     * Desplaza el punto origen del rectangulo mediante un método interno de la clase Punto.
     * 
     * @param p_dx: double - valor a desplazar el eje x
     * @param p_dy: double - valor a desplazar el eje y.
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
        System.out.print("\n\t=== punto desplazado correctamente");
    }

    /**
     * Imprime en pantalla las caracteristicas del rectangulo:
     * origen, alto y ancho. Asi como su superficie y el perímetro
     */
    public void caracteristicas(){
        System.out.print("\n********** Rectangulo **********");
        System.out.printf("\nOrigen: %s - Alto: %.2f - Ancho: %.2f", this.getOrigen().coordenadas(), this.getAlto(), this.getAncho());
        System.out.printf("\nSuperficie: %.2f - Perimetro: %.2f\n", this.superficie(), this.perimetro());
    }

    public double perimetro(){
        //perimetro = 2*(l1*l2)
        return 2*(this.getAncho() + this.getAlto());
    }
    
    public double superficie(){
        //area = base * altura
        return this.getAncho() * this.getAlto();
    }

    public double distanciaA(Rectangulo otroRectangulo){
        double distancia = this.getOrigen().distanciaA(otroRectangulo.getOrigen());
        return distancia;
    }

    public Rectangulo elMayor(Rectangulo otroRectangulo){

        if(this.superficie() == otroRectangulo.superficie()){
            System.out.print("tienen la misma superficie");
            return this;
        }else if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }
        return otroRectangulo;
    }
    
    public String nombreFigura(){
        return "*****Rectángulo*****";
    }
}
