import java.util.Random;
import java.util.Scanner;

/**
 * Write a description of class CreaFigura here.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 24/08/2026
 */
public class CreaFigura
{
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(String args[])
    {
        Random unNumero = new Random();
        double radio1 = unNumero.nextDouble() * 100.0;
        Punto centro1 = new Punto(0,0);
        
        Circulo circulo1 = new Circulo(radio1, centro1);
        circulo1.desplazar(-240, -230);
        circulo1.caracteristicas();
        
        Random otroNumero = new Random();
        double radio2 = otroNumero.nextDouble() * 100.0;
        Punto centro2 = new Punto(5.2,0.5);
        
        Circulo circulo2 = new Circulo(radio2, centro2);
        
        Circulo mayor = circulo1.elMayor(circulo2);
        mayor.caracteristicas();
        
        System.out.println("La distancia entre ambos circulos es de: " + circulo1.distanciaA(circulo2));
        
    }
}