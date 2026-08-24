/**
 * La clase Laboratorio representa los laboratorios que fabrican medicamentos, con los cuales
 * trabaja una droguería. La clase tiene dos formas de instanciarse, una con más parámetros y otra 
 * con menos la cual se trabaja mediante métodos públicos. Se requiere un método que imprima un mensaje
 * en pantalla con los datos del laboratorio.
 * 
 * @author Chavez, Tobías Acdel
 * @version BlueJ 6.0.0
 */
public class Laboratorio
{
    //atributos
   private String nombre;
   private String domicilio;
   private String telefono;
   private int compraMinima;
   private int diaEntrega;
   
   /**
    * CONSTRUCTORES
    * La clase Laboratorio tiene dos constructores para las dos formas en que un objeto de esta
    * clase puede ser instanciado.
    * 
    * Primer constructor, con los parámetros:
    * @param p_nombre - Nombre del laboratorio.
    * @param p_domicilio - Domicilio del laboratorio.
    * @param p_telefono - Número de teléfono que tiene el laboratorio.
    * @param p_compraMin - Monto de la compra mínima.
    * @param p_diaEntrega - número de día en el que se realiza la entrega.
    */
   public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
       setNombre(p_nombre);
       setDomicilio(p_domicilio);
       setTelefono(p_telefono);
       setCompraMinima(p_compraMin);
       setDiaEntrega(p_diaEnt);
   }
   
   /**
    * Segundo constructor, con los parámetros:
    * @param p_nombre - Nombre del laboratorio.
    * @param p_domicilio - Domicilio del laboratorio.
    * @param p_telefono - Número de teléfono que tiene el laboratorio.
    */
   public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
       setNombre(p_nombre);
       setDomicilio(p_domicilio);
       setTelefono(p_telefono);
    }
   
   /**
     *SETTERS Y GETTERS
     *Necesarios para trabajar con los datos siendo los atributos privados. Hay uno para cada atributo.
     */
   private void setNombre(String p_nombre){
       nombre = p_nombre;
   }
   
   private void setDomicilio(String p_domicilio){
       domicilio = p_domicilio;
   }
   
   private void setTelefono(String p_telefono){
       telefono = p_telefono;
   }
   
   private void setCompraMinima(int p_compraMin){
       compraMinima = p_compraMin;
   }
   
   private void setDiaEntrega(int p_diaEnt){
       diaEntrega = p_diaEnt;
   }
   
   public String getNombre(){
       return nombre;
   }
   
   public String getDomicilio(){
       return domicilio;
   }
   
   public String getTelefono(){
       return telefono;
   }
   
   public int getCompraMinima(){
       return compraMinima;
   }
   
   public int getDiaEntrega(){
       return diaEntrega;
   }
   
   /**
    * Método nuevaCompraMínima()
    * Actua como setter para el caso en que se instancia un objeto sin compra mínima, en cuyo caso 
    * se ingresará el dato mediante este método y el valor pasado por parámetro.
    */
   public void nuevaCompraMinima(int p_compraMin){
       compraMinima = p_compraMin;
   }
   
   /**
    * Método nuevoDiaEntrega()
    * Actua como setter para el caso en que se instancia un objeto sin día de entrega, en cuyo caso 
    * se ingresará el dato mediante este método y el valor pasado por parámetro.
    */
   public void nuevoDiaEntrega(int p_diaEnt){
       diaEntrega = p_diaEnt;
   }
   
   /**
    * Método mostrar()
    * Imprime en pantalla los datos del laboratorio en un formato específico.
    */
   public void mostrar(){
      System.out.println("Laboratorio: " + getNombre());
      System.out.println("Domicilio: " + getDomicilio() + " - Teléfono: " + getTelefono());
   }
}