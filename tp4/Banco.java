import java.util.*;
/**
 * Abstraccion de una entidad bancaria encargada de gestionar la nómina de sus empleados
 * e operar sobre colecciones (las nominas) mediante el metodos propios de JCF (Java Collections Framework).
 * 
 * @author Lourdes G. Caceres
 * @version 1.0 07/09/2026
*/
public class Banco {
    // variables de instancia
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList <Empleado> empleados;
    
    //public static final String LINEA = "-----------";
    final String LINEA = " ------------------------------------------------------- ";
    /**
     * 1er constructor para modelar la restricción de cardinalidad (1..*)
     * 
     * @param p_nombre Nombre del banco.
     * @param p_localidad Objeto de la clase Localidad
     * @param p_nroSucursal Número identificador de la sucursal.
     * @param p_empleado Instancia inicial de Empleado obligatoria.
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
            this.setNombre(p_nombre);
            this.setLocalidad(p_localidad);
            this.setNroSucursal(p_nroSucursal);
            this.setEmpleados(new ArrayList<Empleado>());
            this.agregarEmpleado(p_empleado);
            //this.getEmpleados().add(p_empleado);
    }
    
    /**
     * 2do Constructor que inicializa el banco asignando una coleccion existente.
     * 
     * @param p_nombre Nombre del banco.
     * @param p_localidad Objeto de la clase Localidad asociado al banco.
     * @param p_nroSucursal Número identificador de la sucursal.
     * @param p_empleados Colección de tipo ArrayList de objetos Empleado.
     */
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, 
                    ArrayList<Empleado> p_empleados){
            this.setNombre(p_nombre);
            this.setLocalidad(p_localidad);
            this.setNroSucursal(p_nroSucursal);
            this.setEmpleados(p_empleados);
    }
    
    //Mutadores (SETTERS)
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    private void setEmpleados(ArrayList<Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    //Observadores (GETTERS)
    public String getNombre(){
        return this.nombre;
    }
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    public Localidad getLocalidad(){
        return this.localidad;
    }
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    
    /**
     * Agrega un nuevo empleado a la nómina del banco.
     * 
     * @param p_empleado Instancia Empleado a añadir.
     * @return true si se agrego correctamente a la nómina.
     */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * Elimina un empleado especificado de la colección del banco.
     * 
     * @param p_empleado Empleado a remover.
     * @return true si la colección contenía el elemento especificado y fue removido.
     */
    public boolean quitarEmpleado(Empleado p_empleado){
        return this.getEmpleados().remove(p_empleado);
    }

    /**
     * Recorre iterativamente la colección de empleados e imprime en consola
     * el CUIL, nombre completo y el sueldo neto reportado por cada uno.
     */
   public void listarSueldos(){
       //recorrer y mostrar cada elemento de la lista
       for(Empleado empleado : this.empleados){
           System.out.println(empleado.getCuil()+" "+empleado.apeYNom()+LINEA+"$"+empleado.sueldoNeto());
        }
    }
    
    /**
     * Acumula e informa el monto total de sueldos a pagar para la nómina actual.
     * 
     * @return Sumatoria total de sueldos netos (double).
     */
   public double sueldosAPagar(){
        double total = 0.0;             //acumulador
        //recorrer y acumular
        for(Empleado empleado : this.empleados){    
            total += empleado.sueldoNeto();
        }
        return total;
   }
   
    /**
     * Emite el reporte de liquidación del banco por consola. Incluye el encabezado
     * institucional, el listado detallado de cada empleado de la sucursal.
     */
   public void mostrar(){

    System.out.println("Banco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal());
    System.out.println("Localidad: "+this.getLocalidad().getNombre()+"\tProvincia: "+this.getLocalidad().getProvincia());

    this.listarSueldos();

    System.out.println("\nTotal a Pagar "+LINEA+"$"+sueldosAPagar());
   }

}
