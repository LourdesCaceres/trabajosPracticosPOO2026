
/**
 * Clase Múltiplo: determina los múltiplos de 4 ubicados entre 42 y 150.
 * 
 * 
 * @author Chavez Tobías Acdel 
 * @version BlueJ 6.0.0
 */
public class Múltiplo
{
    public static void main (String args[]){
        for(int i = 42; i < 150; i++){
            if ((i % 4) == 0){
                System.out.println (i + " " + "es múltiplo de 4");
            }
        }
    }
}