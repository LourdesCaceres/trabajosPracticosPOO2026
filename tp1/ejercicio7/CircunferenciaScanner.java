
/**
 * Clase CircunferenciaScanner: modificación de la clase Circunferencia donde
 * el ingreso de datos se realiza por teclado. Incorpora una estructura while
 * para ingresar más de una circunferencia.
 * 
 * @author Chavez Tobías Acdel 
 * @version BlueJ 6.0.0
 */
import java.util.Scanner;
public class CircunferenciaScanner
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un valor de radio válido, si ya no quedan circunferecias ingrese 0");
        int radio = teclado.nextInt();
        
        while(radio > 0){
            double perimetro = 2 * radio * Math.PI;
            System.out.println("Circunferencia de radio " + radio + ": " + perimetro);
            System.out.println("Ingrese un valor de radio válido, si ya no quedan circunferecias ingrese 0");
            radio = teclado.nextInt();
        }
    }
}
