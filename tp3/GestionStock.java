
/**
 * Clase ejecutable para la clase Producto.
 * Prueba los metodos de la clase mediante constantes.
 * 
 * @author Chavez, Tobías Acdel
 * @version 1.0 24/08/2026
 */
public class GestionStock
{
    /**
     * Instancia un laboratorio y un producto mediante constantes, imprime resultados.
     * 
     */
    public static void main(String args[])
    {
        Laboratorio lab1 = new Laboratorio("Colgate S.A", "Junin 504", "3794-560987", 12000, 23);
        Producto prod1 = new Producto(0112, "Higiene", "Papel Higiénico Elegante", 1500.00, 13.2, 1, lab1);
        
        prod1.ajuste(500);
        prod1.mostrar();
        prod1.ajuste(-200);
        prod1.mostrar();
        System.out.println(prod1.mostrarLinea());
    }
}