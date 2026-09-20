import java.util.HashMap;
import java.util.*;
/**
 * La clase Comercio representa una entidad comercial que gestiona una nómina de empleados utilizando
 * una estructura de datos basada en tablas de dispersión (HashMap).
 * Mapea cada objeto Empleado mediante su número de CUIL único como clave.
 *
 * @author Caceres, Lourdes G. 
 * @version 1.0 14/09/2026 
 */
public class Comercio {
    // variables de instancia
    private String nombre;      //nombre del comercio
    private HashMap<Long, Empleado> empleados;
    /**
     * Primer constructor de la clase Comercio.
     * Inicializa la entidad con su nombre y una colección de empleados vacía.
     * 
     * @param p_nombre El nombre comercial de la empresa.
     */
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }
    /**
     * Segundo constructor de la clase Comercio.
     * Inicializa la entidad con su nombre y asigna una colección de empleados preexistente.
     * 
     * @param p_nombre El nombre comercial de la empresa.
     * @param p_empleados Colección HashMap de objetos Empleado claveados por su CUIL.
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados){
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }
    
    //Mutadores (SETTERS)
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    //Observadores (GETTERS)
    public String getNombre(){
        return this.nombre;
    }
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    
    /**
     * Agrega un objeto Empleado a la colección utilizando su número de CUIL como clave.
     * 
     * @param p_empleado Objeto Empleado a dar de alta.
     */
    public void altaEmpleado(Empleado p_empleado){
        Long clave = p_empleado.getCuil();
        this.getEmpleados().put(clave, p_empleado);
        System.out.println("-> Empleado dado de alta exitosamente.");
    }
    /**
     * Elimina un empleado de la colección según su número de CUIL.
     * 
     * @param p_cuil Número de CUIL del empleado a dar de baja.
     * @return El objeto Empleado eliminado de la colección, o null si la clave no existía.
     */
    public Empleado bajaEmpleado(long p_cuil){
        return this.getEmpleados().remove(p_cuil);
    }
    /**
     * Retorna la cantidad total de empleados registrados en la nómina del comercio.
     * 
     * @return Cantidad de pares clave-valor almacenados en la nómina.
     */
    public int cantidadDeEmpleados(){
        return this.getEmpleados().size();
    }
    /**
     * Consulta por medio del CUIL si un empleado forma parte de la nomina de la empresa.
     * 
     * @param p_cuil Número de CUIL a verificar en la colección.
     * @return true si la clave existe en el HashMap; false en caso contrario.
     */
    public boolean esEmpleado(long p_cuil){
        
        return this.getEmpleados().containsKey(p_cuil);
    }
    /**
     * Busca en la coleccion si un empleado es parte de la empresa por medio de su cuil
     * 
     * @param p_cuil nro de cuil del empleado a consultar.
     * @return La instancia de Empleado asociada al CUIL, o null si no está registrado.
     */
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    /**
     * Visualizar por pantalla el sueldo neto del empleado cuyo CUIL coincida 
     * con el parámetro introducido
     * 
     * @param p_cuil Número de CUIL a verificar en la colección.
     */
    public void sueldoNeto(long p_cuil){
        if(esEmpleado(p_cuil)){
            Empleado unEmpleado = this.buscarEmpleado(p_cuil);
           System.out.println(unEmpleado.mostrarLinea()); 
        }else{
           System.out.println("NO EXISTE un empleado asociado a este CUIL");  
        }
    }
    /**
     * Muestra por pantalla la nómina completa de la empresa, invocando el cálculo
     * e impresión de sueldo neto para cada uno de los empleados registrados.
     */
    public void nomina(){
        for(Empleado unEmpleado : this.getEmpleados().values()){
            this.sueldoNeto(unEmpleado.getCuil());
        }
    }
    
    
    
    
    


}