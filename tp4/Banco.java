import java.util.*;
/**
 * Write a description of class Banco here.
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
     * 1er constructor de la clase Banco (de 1 a muchos)
     * 
     * @param 
     * @param
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
     * 2do constructor de la clase Banco (con un arreglo ya existente)
     * 
     * @param
     * @param
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
     * agregarEmpleado (add) "boole"
     */
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**
     * quitarEmpleado (quit)    "boole"
     */
    public boolean quitarEmpleado(Empleado p_empleado){
        return this.getEmpleados().remove(p_empleado);
    }

    /**
     * listarSueldos() void
     */
   public void listarSueldos(){
       //recorrer y mostrar cada elemento de la lista
       for(Empleado empleado : this.empleados){
           System.out.println(empleado.getCuil()+" "+empleado.apeYNom()+LINEA+"$"+empleado.sueldoNeto());
        }
    }
    
    /**
     * sueldosAPagar() double
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
    * mostrar() void
    */
   public void mostrar(){

    System.out.println("Banco: "+this.getNombre()+"\tSucursal: "+this.getNroSucursal());
    System.out.println("Localidad: "+this.getLocalidad().getNombre()+"\tProvincia: "+this.getLocalidad().getProvincia());

    this.listarSueldos();

    System.out.println("\nTotal a Pagar "+LINEA+"$"+sueldosAPagar());
   }

}