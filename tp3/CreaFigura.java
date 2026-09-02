import java.util.Random;
/**
 * Clase ejecutable para instanciar y probar objetos de la Clase Circulo y Rectangulo.
 * Los valores de los atributos se generan aleatoriamente, a partir de clase Random
 * 
 * @author Chavez, Tobías Acdel y Lourdes G. Caceres.
 * @version 1.0 - 24/08/2026
 * @version 2.0 - 31/08/2026
 */
public class CreaFigura {

    public static void main(String args[]){

        //nueva instancia Punto (situado en el origen) y Circulo
        Random unNumero = new Random();
        double radio1 = unNumero.nextDouble() * 100.0;
        Punto centro1 = new Punto(0,0);

        Circulo circulo1 = new Circulo(radio1, centro1);
        circulo1.desplazar(-240, -230);
        circulo1.caracteristicas();

        //segunda instancia Punto (con el centro en el eje 5.2 y 0.5) Circulo
        Random otroNumero = new Random();
        double radio2 = otroNumero.nextDouble() * 100.0;
        Punto centro2 = new Punto(5.2,0.5);

        Circulo circulo2 = new Circulo(radio2, centro2);

        //verificacion de métodos
        Circulo mayor = circulo1.elMayor(circulo2);
        mayor.caracteristicas();
        
        System.out.println("La distancia entre ambos circulos es de: " + circulo1.distanciaA(circulo2));

        /**
         * INSTANCIAS Y METODOS para la clase RECTANGULO
         */
        
        //intancia de objeto Punto y Rectangulo
        Punto punto1 = new Punto(7.4, 4.5);

        double ancho = unNumero.nextDouble() * 100.0; 
        double alto = unNumero.nextDouble() * 100.0;
        
        Rectangulo rectangulo1 = new Rectangulo(ancho, alto); //origen(0,0) 
        rectangulo1.caracteristicas();
        
        //prueba 1
        rectangulo1.desplazar(40.0, -20.0);
        rectangulo1.caracteristicas();

        //segunda instancia Rectangulo
        double ancho2 = unNumero.nextDouble() * 100.0; 
        double alto2 = unNumero.nextDouble() * 100.0;
        Rectangulo rectangulo2 = new Rectangulo(punto1, ancho2, alto2);
        
        rectangulo2.caracteristicas();
        
        //mostrar el mayor rectangulo entre los dos
        rectangulo1.elMayor(rectangulo2).caracteristicas();
        
        System.out.printf("\nLa distancia entre los dos rectangulos es: %.2f", rectangulo1.distanciaA(rectangulo2));
        
    }
}
