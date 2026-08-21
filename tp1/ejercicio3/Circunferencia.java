
/**
 * Clase Circunferencia: calcular el perímetro de una circunferencia mediante
 * ingreso del radio como argumento del main.
 * 
 * @author Chavez Tobías Acdel 
 * @version BlueJ 6.0.0
 */
public class Circunferencia
{
    public static void main(String args[])
    {
        int radio = Integer.parseInt(args[0]);
        
        double perimetro = 2 * radio * Math.PI;
        System.out.println("Circunferencia de radio " + radio + ": " + perimetro);
    }
}