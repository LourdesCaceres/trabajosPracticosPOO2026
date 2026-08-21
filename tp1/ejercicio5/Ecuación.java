
/**
 * Clase Ecuación: calcular raíces de una ecuación de segundo grado, ingresando las
 * variables a, b y c mediante argumentos del main.
 * 
 * @author Chavez Tobías Acdel 
 * @version BlueJ 6.0.0
 */
public class Ecuación
{
    public static void main(String args[])
    {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        
        double discriminante = (Math.pow(b,2) - (4*a*c));
        double x1 = ((-b + (Math.sqrt(discriminante))) / (2*a));
        double x2 = ((-b - (Math.sqrt(discriminante))) / (2*a));
        
        if(discriminante == 0){
            System.out.println ("Raíces iguales " + x1 + " = " + x2);
        }else if (discriminante > 0){
            System.out.println ("Las raíces son: " + x1 + " y " + x2);
        }else {
            System.out.println ("Las raíces de la ecuación son complejas");
        }
    }
}