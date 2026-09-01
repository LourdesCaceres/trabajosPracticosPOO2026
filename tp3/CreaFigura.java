import java.util.Random;
//import java.util.Formatter;        *No se necesita importar java.util.Formatter para que printf funcione.
/**
 * 
 */
public class CreaFigura {
    public static void main (String args []){
        
        //intancia de objeto Punto
        Punto2 punto1 = new Punto2(7.4, 4.5);

        //nueva intancia de un objeto Rectangulo - 1
        Random aleatorio = new Random();
        double ancho = aleatorio.nextDouble() * 100.0; 
        double alto = aleatorio.nextDouble() * 100.0;
        
        Rectangulo rectangulo1 = new Rectangulo(ancho, alto);//origen(0,0) 
        rectangulo1.caracteristicas();
        
        //prueba 1
        rectangulo1.desplazar(40.0, -20.0);
        rectangulo1.caracteristicas();

        //segunda instancia Rectangulo
        double ancho2 = aleatorio.nextDouble() * 100.0; 
        double alto2 = aleatorio.nextDouble() * 100.0;
        Rectangulo rectangulo2 = new Rectangulo(punto1, ancho2, alto2);
        
        rectangulo2.caracteristicas();
        
        //mostrar el mayor rectangulo entre los dos
        rectangulo1.elMayor(rectangulo2).caracteristicas();
        
        System.out.printf("\nLa distancia entre los dos rectangulos es: %.2f", rectangulo1.distanciaA(rectangulo2));

    }
}
