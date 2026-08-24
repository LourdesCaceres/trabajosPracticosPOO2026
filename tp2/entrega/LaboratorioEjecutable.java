/**
 * Clase ejecutable para la clase Laboratorio. Instancia 3 objetos de clase Laboratorio mediante constantes 
 * seleccionadas por el autor y prueba los métodos públicos nuevaCompraMinima(), nuevoDiaEntrega() y
 * mostrar().
 * 
 * @author Chavez, Tobías Acdel
 * @version BlueJ 6.0.0
 */
public class LaboratorioEjecutable
{
  /**
   * Método main()
   * El método no está diseñado para recibir argumentos ni que sean ingresados por teclado, en caso de
   * que se ingresen argumentos, el resultado será el mismo.
   * El método instancia 3 objetos de clase Laboratorio: lab1, lab2 y lab3. Como prueba, a lab2 se lo instancia
   * con el segundo constructor y se prueban las funciones nuevaCompraMinima() y nuevoDiaEntrega(). Se prueba mostrar()
   * con los 3 objetos.
   */
  public static void main(String args[]){
      Laboratorio lab1 = new Laboratorio("FACENA", "Junín 553", "54-11-3794-8892", 21100, 21);
      Laboratorio lab2 = new Laboratorio("Vidrito", "Madrid 213", "54-11-3772-5228");
      Laboratorio lab3 = new Laboratorio("Globant", "Belgrano 1543", "54-11-3794-9992", 2124, 12);
      
      lab2.nuevaCompraMinima(23100);
      lab2.nuevoDiaEntrega(11);
      
      lab1.mostrar();
      lab2.mostrar();
      lab3.mostrar();
  }
}