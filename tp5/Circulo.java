
/**
 * Subclase Circulo, representa una especialización de Elipse, donde los semiejes mayor y menor
 * poseen el mismo valor...
 * Hereda la estructura y comportamieno de Elipse, redefiniendo el método nombreFigura.
 * 
 * @author Lourdes G. Caceres 
 * @version 1.0 28/09/2026
 */
public class Circulo extends Elipse{
    
    /**
     * Primer constructor de la clase Circulo.
     * Inicializa el circulo a partir de un radio y centro dado.
     * 
     * @param p_radio representa el radio del circulo
     * @param p_centro (instancia Punto) indica las coordenadas del centro
     */
    public Circulo(double p_radio, Punto p_centro){
        super(p_radio, p_radio, p_centro);
    }
    /**
     * Segundo constructor de la clase Circulo.
     * Inicializa el circulo en el origen (Punto 0.0) y un radio dado.
     * 
     * @param p_radio representa el radio del circulo
     */
    public Circulo(double p_radio){
        super(p_radio, p_radio);
    }
    /**
     * Redefinicion del metodo heredado de Elipse.
     * Identifica la figura geométrica
     * 
     * @return Cadena de caracteres con el nombre de la figura 
     */
    @Override
    public String nombreFigura(){
        return "****** Circulo ******";
    }
}