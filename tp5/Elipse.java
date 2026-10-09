
/**
 * (SuperClase) Representa la figura Elipse. proporciona los métodos necesarios para:
 * calcular superficie, distancia entre figuras y dezplazamiento en el plano.
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 - 28/09/2026
 */
public class Elipse {
    // atributos de instancia
    private double sEjeMayor;
    private double sEjeMenor;
    private Punto centro;

    /**
     * Primer constructor de la clase Elipse
     * Inicializa con su centro en el punto (0,0) con su semieje mayor y menor
     * 
     * @param p_ejeMayor valor del semieje mayor
     * @param p_ejeMenor valor del semieje menor 
     */
    public Elipse(double p_ejeMayor, double p_ejeMenor){
        this.setEjeMayor(p_ejeMayor);
        this.setEjeMenor(p_ejeMenor);
        this.setCentro(new Punto(0,0));
    }    
    /**
     * Segundo constructor de la clase Elipse
     * Inicializa con su centro en un punto específico, con su semieje mayor y menor
     * 
     * @param p_ejeMayor valor del semieje mayor
     * @param p_ejeMenor valor del semieje menor
     * @param p_punto  Instancia de Punto que representa el centro de la figura
     */
    public Elipse(double p_ejeMayor, double p_ejeMenor, Punto p_centro){
        this.setEjeMayor(p_ejeMayor);
        this.setEjeMenor(p_ejeMenor);
        this.setCentro(p_centro);
    }

    //SETTERS
    private void setEjeMayor(double p_ejeMayor){
        this.sEjeMayor = p_ejeMayor;
    }
    private void setEjeMenor(double p_ejeMenor){
        this.sEjeMenor = p_ejeMenor;
    }
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    
    //GETTERS
    public double getEjeMayor(){
        return this.sEjeMayor;
    }
    public double getEjeMenor(){
        return this.sEjeMenor;
    }
    public Punto getCentro(){
        return this.centro;
    }
    
    /**
     * Identifica la figura geométrica
     * 
     * @return Cadena de caracteres con el nombre de la figura 
     */
    public String nombreFigura(){
        return "****** Elipse ******";
    }

    /**
     * Calcula la superficie (area) de la figura.
     * 
     * @return valor de la superficie (de tipo double)
     */
    public double superficie(){
        return Math.PI * this.getEjeMayor() * this.getEjeMenor();
    }
    /**
     * Muestra por pantalla el detalle de las características principales de la figura:
     * nombre, coordenadas del centro, semieje mayor y menor, y superficie
     */
    public void caracteristicas(){
        System.out.println("\n"+nombreFigura());
        System.out.println("Centro: " + this.getCentro().coordenadas() + " - " + "Semieje Mayor: " + this.getEjeMayor()+ " - Semieje Menor: " + this.getEjeMenor());
        System.out.println("Superficie: " + this.superficie());
    }
    /**
     * 
     * 
     * @param p_dx Valor de desplazamiento del eje X
     * @param p_dy Valor de desplazamiento del eje Y
     */
    public void desplazar(double p_dx, double p_dy){
        this.getCentro().desplazar(p_dx, p_dy);
    } 
    /**
     * Calcula la distancia entre dos elipses, a partir de los puntos de centro de ambas.
     * 
     * @param p_otraElipse 
     * @return this.getCentro().distanciaA(otroCentro): double - devuelve la distancia entre ambas elipses.
     * 
     */
    public double distanciaA(Elipse p_otraElipse){
        Punto otroCentro = p_otraElipse.getCentro();
        return this.getCentro().distanciaA(otroCentro);
    }
    
    /**
     * Compara la superficie entre dos elipses
     * 
     * @param p_otraElipse
     * @return el circulo con mayor superficie.
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