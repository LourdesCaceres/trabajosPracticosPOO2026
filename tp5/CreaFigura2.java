import java.util.Random;
/**
 * Clase ejecutable para instanciar y probar objetos de la Clase Elipse y/o Circulo.
 * Los valores de los atributos se generan aleatoriamente, a partir de clase Random
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 28/09/2026
 */
public class CreaFigura2 {
    public static void main (String arg []){
        
        Random unNumero = new Random();

        double ejeMayor = unNumero.nextDouble() * 100.0;
        double ejeMenor = unNumero.nextDouble() * 100.0;

        Punto centro1 = new Punto(0.5, 1.1);

        Elipse unaElipse = new Elipse(1.0, 2.0);
        Elipse otraElipse = new Elipse(ejeMayor, ejeMenor, centro1);
        Elipse unCirculo = new Circulo(3.0);

        unaElipse.caracteristicas();
        unaElipse.distanciaA(otraElipse);
        unCirculo.caracteristicas();
    }
}
