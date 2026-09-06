
/**
 * La clase Circulo se diseña con el propósito de modelar distintos circulos tomando
 * como base un punto sobre los ejes definido a través de la clase Punto definida
 * en el TP anterior.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 24/08/2026
 */
public class Circulo
{
    // atributos
    private double radio;
    private Punto centro;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE CIRCULO: para el caso de que existe un punto centor y un radio.
     * 
     * @param p_radio: double - radio del circulo.
     * @param p_centro: Punto - punto centro del circulo.
     */
    public Circulo(double p_radio, Punto p_centro)
    {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE CIRCULO: sin parámetros, crea un circulo en (0,0) con radio 0.
     */
    public Circulo()
    {
        this.setRadio(0);
        this.setCentro(new Punto(0,0));
    }

    //SETTERS
    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    //GETTERS
    public double getRadio(){
        return this.radio;
    }
    
    public Punto getCentro(){
        return this.centro;
    }
    
    //Métodos de clase
    /**
     * Método desplazar(): recibe por parámetros los desplazamientos sobre los ejes, asignando
     * los nuevos valores a las coordenadas del punto centro.
     * 
     * @param p_dx: double - representa el desplazamiento sobre el eje x.
     * @param p_dy: double - representa el desplazamiento sobre el eje y.
     * 
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    }
    
    /**
     * Método perimetro(): calcula el perimetro del circulo a partir de la fórmula
     * "PI * radio^2" y lo retorna.
     * 
     * @return perimetro: double - devuelve el perimetro calculado.
     * 
     */
    public double perimetro(){
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
    
    /**
     * Método perimetro(): calcula la superficie del circulo a partir de la fórmula
     * "2 * PI * radio" y lo retorna.
     * 
     * @return superficie: double - devuelve la superficie calculada.
     * 
     */
    public double superficie(){
        return 2 * Math.PI * this.getRadio();
    }
    
    /**
     * Método características(): muestra en pantalla los valores del centro del circulo (en coordenadas),
     * su radio, superficie y perímetro.
     * 
     */
    public void caracteristicas(){
        System.out.println("******Circulo******");
        System.out.println("Centro: " + this.getCentro().coordenadas() + " - " + "Radio: " + this.getRadio());
        System.out.println("Superficie: " + this.superficie() + " - " + "Perímetro: " + this.perimetro());
    }
    
    /**
     * Método distanciaA(): recibe por parámetro un circulo del cual se saca su centro (atributo de clase Punto)
     * y se utiliza el método distanciaA de la clase Punto que compara los valores x e y de ambos puntos y
     * calcula su distancia. La distancia entre los puntos de centro de los circulos representa la distancia total
     * entre ambos circulos.
     * 
     * @param p_otroCirculo: Circulo - entra por parámetro otro círculo con un punto centro y un radio.
     * @return this.getCentro().distanciaA(otroCentro): double - devuelve la distancia entre ambos circulos.
     * 
     */
    public double distanciaA(Circulo p_otroCirculo){
        Punto otroCentro = p_otroCirculo.getCentro();
        return this.getCentro().distanciaA(otroCentro);
    }
    
    /**
     * Compara la superficie entre dos circulos, uno entra por parámetro y el
     * otro es el de la clase. Mediante un if, devuelve el mayor.
     * 
     * @param p_otroCirculo: Circulo - circulo que entra por párametro.
     * @return el circulo con mayor superficie.
     */
    public Circulo elMayor(Circulo p_otroCirculo){
        double superficie = this.superficie();
        double otraSuperficie = p_otroCirculo.superficie();
        
        if(superficie > otraSuperficie){
            return this;
        }else if(otraSuperficie > superficie){
            return p_otroCirculo;
        }
        
        return this;
    }
}