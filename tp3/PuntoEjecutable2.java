
/**
 * Clase ejecutable para intanciar obtetos y probar los métodos de comportamiento,
 * recibiendo sus datos por argumentos del main.
 * 
 * puntos x1 y1 (indices 0 y 1) | puntos x2 y2 (indices 2 y 3) | 
 * incremento dx dy (indices 4 y5).
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 24/08/2026
 */
public class PuntoEjecutable2{
    
    public static void main (String args []){
    
    //Instanciacion del primer punto (indices 0 y 1)
    Punto2 punto1 = new Punto2();
    punto1.setx(Double.parseDouble(args[0]);
    punto2.setY(Double.parseDouble(args[1]);
    
    //intanciación del segundo punto (indices 2 y 3)
    Punto2 punto2 = new Punto2(Double.parseDouble(args[2]), 
                                Double.parseDouble(args[3]));
                                
    punto1.desplazar(Double.parseDouble(args[4], Double.parseDouble(args[5]);
    punto1.mostrar();
    
    System.out.print("\nLas coordenadas del punto 2 son: "+punto2.coordenadas());

    System.out.print("\nLa distancia desde el punto 1 hasta el punto2 es de: "+
                        punto1.distanciaA(punto2));
                                
    }

}