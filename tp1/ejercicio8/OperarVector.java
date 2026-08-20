
import java.util.Scanner;

public class OperarVector{
    public static void main(String args []){
        //declarar el vector y la instancia para el ingreso de datos
        Scanner indice = new Scanner(System.in);
        float vector [] = new float[5];
        
        //un bucle for para el ingreso de datos
        System.out.println("Ingresar notas: ");
        for(int i=0; i<5; i++){
            System.out.print("Nota nro "+(i+1)+ ": ");
            vector[i] = indice.nextFloat();
        }
        
        float mayor = vector[0];
        float acumulador = 0;   //acumulador para calcular el promedio
        
        for(int j=0; j<5; j++ ){
            
            acumulador += vector[j];
            
            //mostrar las notas
            System.out.print("|Nota nro"+(j+1)+": "+vector[j]+"\t");
            
            //identificar el mayor
            if(vector[j] > mayor){
                mayor = vector[j];
            }
        }
        
        System.out.print("\n***** El promedio de las notas es: "+(acumulador/5)+"\n");
        System.out.print("***** La mayor nota es: "+mayor);
    }
}