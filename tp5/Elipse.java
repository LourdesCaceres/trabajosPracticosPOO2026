
/**
 * (SuperClase) Representa la figura Elipse. proporciona los métodos necesarios para:
 * calcular superficie, distancia entre figuras y dezplazamiento en el plano.
 * Actualización 2.0 lo modifica para ser una subclase de la clase abstracta FiguraGeometrica.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 - 28/09/2026
 * @version 2.0 - 16/10/2026
 */
public class Elipse extends FiguraGeometrica{
    // atributos de instancia
    private double sEjeMayor;
    private double sEjeMenor;

    /**
     * Primer constructor de la clase Elipse
     * Inicializa con su centro en el punto (0,0) con su semieje mayor y menor
     * 
     * @param p_ejeMayor valor del semieje mayor
     * @param p_ejeMenor valor del semieje menor 
     */
    public Elipse(double p_ejeMayor, double p_ejeMenor){
        super(new Punto(0,0));
        this.setEjeMayor(p_ejeMayor);
        this.setEjeMenor(p_ejeMenor);
    }
    
    /**
     * Segundo constructor de la clase Elipse
     * Inicializa con su centro en un punto específico, con su semieje mayor y menor
     * 
     * @param p_ejeMayor valor del semieje mayor
     * @param p_ejeMenor valor del semieje menor
     * @param p_punto  Instancia de Punto que representa el centro de la figura
     */
    public Elipse(double p_ejeMayor, double p_ejeMenor, Punto p_origen){
        super(p_origen);
        this.setEjeMayor(p_ejeMayor);
        this.setEjeMenor(p_ejeMenor);
    }

    //SETTERS
    private void setEjeMayor(double p_ejeMayor){
        this.sEjeMayor = p_ejeMayor;
    }
    private void setEjeMenor(double p_ejeMenor){
        this.sEjeMenor = p_ejeMenor;
    }
    
    //GETTERS
    public double getEjeMayor(){
        return this.sEjeMayor;
    }
    public double getEjeMenor(){
        return this.sEjeMenor;
    }
    
    /**
     * Identifica la figura geométrica
     * 
     * @return Cadena de caracteres con el nombre de la figura 
     */
    @Override
    public String nombreFigura(){
        return "****** Elipse ******";
    }

    /**
     * Calcula la superficie (area) de la figura.
     * 
     * @return valor de la superficie (de tipo double)
     */
    @Override
    public double superficie(){
        return Math.PI * this.getEjeMayor() * this.getEjeMenor();
    }
    
    /**
     * Muestra por pantalla el detalle de las características principales de la figura:
     * nombre, coordenadas del centro, semieje mayor y menor, y superficie
     */
    public void caracteristicas(){
        System.out.println("\n"+nombreFigura());
        System.out.println("Centro: " + this.getOrigen().coordenadas() + " - " + "Semieje Mayor: " + this.getEjeMayor()+ " - Semieje Menor: " + this.getEjeMenor());
        System.out.println("Superficie: " + this.superficie());
    }
    
    /**
     * Desplaza el centro de la elipse segun el valor indicado
     * 
     * @param p_dx Valor de desplazamiento del eje X
     * @param p_dy Valor de desplazamiento del eje Y
     */
    public void desplazar(double p_dx, double p_dy){
        this.getOrigen().desplazar(p_dx, p_dy);
    } 
    
    /**
     * Calcula la distancia entre dos elipses, a partir de los puntos de centro de ambas.
     * 
     * @param p_otraElipse 
     * @return (double) devuelve la distancia entre ambas elipses.
     */
    public double distanciaA(Elipse p_otraElipse){
        Punto otroCentro = p_otraElipse.getOrigen();
        return this.getOrigen().distanciaA(otroCentro);
    }
    
    /**
     * Compara la superficie entre dos elipses, retornando la mayor.
     * 
     * @param p_otraElipse 
     * @return (objeto Elipse) la elipse con mayor superficie.
     */
    public Elipse elMayor(Elipse p_otraElipse){
        if(this.superficie() > p_otraElipse.superficie()){
            return this;
        }else if(p_otraElipse.superficie() > this.superficie()){
            return p_otraElipse;
        }
        return this;
    }
}