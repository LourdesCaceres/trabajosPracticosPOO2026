import java.util.Scanner;
import java.util.*;
/**
 * Clase ejecutable que opera con la clase Punto para probar arrays estáticos.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 07/09/2026
 */
public class ArrayDePuntos
{
    /**
     * El programa pide al usuario que ingrese los ejes x e y para 6 puntos,
     * crea instancias de clase Punto con los valores ingresados y los guarda
     * en un array estático. Esto lo realiza mediante un for donde para cada pasada
     * las variables x e y irán cambiando y guardando cada punto.
     * 
     * Luego se vuelve a usar la estructura for para recorrer el vector dos veces,
     * la primera para mostrar las coordenadas de cada punto y la segunda para
     * mostrar la distancia entre dos puntos consecutivos. Ambos métodos imprimen por pantalla.
     * 
     */
    public static void main(){
        Scanner teclado = new Scanner(System.in);
        Punto[] puntos = new Punto[6];
        
        System.out.println("***INGRESO DE PUNTOS***");
        for(int i=0; i<6; i++){
            System.out.println("\n***PUNTO " + (i+1) + "***");
            System.out.println("Ingrese el valor x del punto.");
            int x = teclado.nextInt();
            System.out.println("Ingrese el valor y del punto.");
            int y = teclado.nextInt();
            puntos[i] = new Punto(x, y);
        }
        
        System.out.println("\n***COORDENADAS DE LOS 6 PUNTOS***");
        for(int i=0; i<6; i++){
            System.out.println(puntos[i].coordenadas());
        }
        
        System.out.println("\n***DISTANCIA ENTRE PUNTOS CONSECUTIVOS***");
        for(int i=0; i<5; i++){
            System.out.println("Distancia entre el punto " + (i+1) + " y el punto " + (i+2) + ": "
                                + puntos[i].distanciaA(puntos[i+1]));
        }
    }
}