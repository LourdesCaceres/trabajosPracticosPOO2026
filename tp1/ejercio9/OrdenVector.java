
import java.util.Scanner;

public class OrdenVector{
    public static void main (String args []){
        
        //declarar instancia para ingreso de datos
        Scanner indice = new Scanner(System.in);
        //declarar vector
        double vector [] = new double[4];
        
        for(int i=0; i<4; i++){
            System.out.print("Ingresar el elemento "+(i+1)+": ");
            vector[i] = indice.nextDouble();
        }
        
        //metodo burbuja para ordenar el vector
        double aux = 0;
        for(int i=0; i<3; i++){
            for(int j=0; j< (4-1); j++){
                if(vector[j] > vector[j+1]){
                   aux = vector[j];
                   vector[j] = vector[j+1];
                   vector[j+1] = aux;
                }
            }
        }
        for(int i=0;i<4;i++){
            System.out.print("Elemento: "+vector[i]+"\t|");
        }
        System.out.print("\nEl menor elemento del array es: "+vector[0]);
    }
}
