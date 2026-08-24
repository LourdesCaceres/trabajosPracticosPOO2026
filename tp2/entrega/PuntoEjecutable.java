import java.util.Scanner;
/**
 * Clase ejecutable para la clase Punto. Los datos se ingresan por teclado mediante Scanner.
 * 
 * @author Chavez, Tobías Acdel.
 * @version 1.0
 */
public class PuntoEjecutable
{
    /**
     * Método main()
     * El método pide al usuario que ingrese los valores que le serán asignados a los ejes x e y, datos que serán ingresados por teclado
     * mediante Scanner. Se instancia el objeto de clase Punto punto1 con los valores ingresados, se los pasa a coordenadas mediante 
     * coordenadas() y se muestra el resultado con mostrar().
     * El método pide al usuario que ingrese los valores que desplazarán a los ejes x e y. Con estos datos se prueba el método
     * desplazar() y se muestran los resultados mediante mostrar().
     */
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
         System.out.println("Ingrese un valor de X");
         double x = teclado.nextDouble();
         System.out.println("Ingrese un valor de Y");
         double y = teclado.nextDouble();
         
         Punto punto1 = new Punto(x, y);
         
         System.out.println(punto1.coordenadas());
         punto1.mostrar();
         
         System.out.println("Ingrese cuánto desea desplazar el eje X");
         double dx = teclado.nextDouble();
         System.out.println("Ingrese cuánto desea desplazar el eje Y");
         double dy = teclado.nextDouble();
         punto1.desplazar(dx, dy);
         System.out.println(punto1.coordenadas());
         punto1.mostrar();
        
    }
}