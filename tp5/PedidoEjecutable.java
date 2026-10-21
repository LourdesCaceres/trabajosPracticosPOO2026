import java.util.ArrayList;
/**
 * Clase ejecutable para la clase Pedido del TP5 y todas las clases que conlleva.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 20/10/2026
 */
public class PedidoEjecutable
{
    /**
     * El main trabaja primero con instancias por constante para cumplir las consignas
     * y probando un constructor. Se instancia otro pedido para probar el otro constructor
     * y más funcionalidades.
     */
    public static void main(String[] args) {
        Etiqueta premium1 = new Premium(200, 10);
        Etiqueta comun1 = new Comun(100, 100);
        Etiqueta premium2 = new Premium(200, 7);

        Renglon renglon1 = new Renglon(7, premium1);
        Renglon renglon2 = new Renglon(57, comun1);
        Renglon renglon3 = new Renglon(94, premium2);
        
        //PROBAMOS EL PRIMER CONSTRUCTOR
        Pedido pedido1 = new Pedido(renglon1);

        pedido1.agregarRenglon(renglon2);
        pedido1.agregarRenglon(renglon3);

        pedido1.mostrar();
        
        pedido1.quitarRenglon(renglon1);
        System.out.println("\n");
        pedido1.mostrar();
        
        //PRUEBA DE SEGUNDO CONSTRUCTOR
        Etiqueta comun2 = new Comun(200, 100);
        Renglon renglon4 = new Renglon(12, comun2);
        
        ArrayList<Renglon> renglones = new ArrayList<Renglon>();
        renglones.add(renglon1);
        renglones.add(renglon2);
        renglones.add(renglon3);
        renglones.add(renglon4);
        
        Pedido pedido2 = new Pedido(renglones);
        System.out.println("\n");
        pedido2.mostrar();
    }
}