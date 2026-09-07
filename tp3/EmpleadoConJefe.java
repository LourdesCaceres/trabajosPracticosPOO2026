import java.util.*;
import java.util.GregorianCalendar;
/**
 * Clase EmpleadoConJefe, es modificación de la clase Empleada creada y posteriormente
 * actualizada en ejercicios anteriores. Esta nueva clase incluye un atributo jefe que será
 * del tipo de la propia clase.
 * 
 * @author Chavez, Tobías Acdel y Caceres Lourdes G.
 * @version 3.0 - 01/09/2026
 */
public class EmpleadoConJefe
{
    // ATRIBUTOS
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE EmpleadoConJefe
     * 
     * @param p_cuil: long - Nro de cuil del empleado
     * @param p_apellido: String - Apellido del empleado
     * @param p_nombre: String - Nombre del empleado
     * @param p_importe: double - sueldo base del empleado
     * @param p_fecha: Calendar - Fecha en que ingresó a la empresa
     * @param p_jefe: EmpleadoConJefe - jefe del empleado
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe,
                            Calendar p_fecha, EmpleadoConJefe p_jefe){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldo(p_importe);
        this.setFecha(p_fecha);
        this.setJefe(p_jefe);
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE EmpleadoConJefe
     * 
     * @param p_cuil: long - Nro de cuil del empleado
     * @param p_apellido: String - Apellido del empleado
     * @param p_nombre: String - Nombre del empleado
     * @param p_importe: double - sueldo base del empleado
     * @param p_fecha: Calendar - Fecha en la que ingresó el empleado
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe,
                            Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldo(p_importe);
        this.setFecha(p_fecha);
    }
    
    /**
     * TERCER CONSTRUCTOR DE LA CLASE EmpleadoConJefe
     * 
     * @param p_cuil: long - Nro de cuil del empleado
     * @param p_apellido: String - Apellido del empleado
     * @param p_nombre: String - Nombre del empleado
     * @param p_importe: double - sueldo base del empleado
     * @param p_anio: int - Año en que ingreso a la empresa
     */
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe,
                            int p_anio){
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldo(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    //SETTERS
    /**
     * Asigna el número de CUIL
     * 
     * @param p_cuil: long - cuil del empleado que se le asignará
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    
    /**
     * Asigna el apellido
     * 
     * @param p_apellido: String - apellido del empleado que se le asignará
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Asigna el nombre
     * 
     * @param p_nombre: String - nombre del empleado que se le asignará
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Asigna el sueldo básico del empleado
     * 
     * @param p_importe: double - sueldo del empleado que se le asignará
     */
    private void setSueldo(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    /**
     * Asigna la fecha en la que ingresó el empleado
     * 
     * @param p_fecha: Calendar - fecha de ingreso del empleado que se le asignará
     */
    private void setFecha(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    /**
     * Asigna el año de ingreso del empleado
     * 
     * @param p_anio: int - año de ingreso del empleado que se le asignará
     */
    private void setAnioIngreso(int p_anio){
        Calendar p_fecha = new GregorianCalendar(p_anio, Calendar.JANUARY, 1);
        this.setFecha(p_fecha);
    }
    
    /**
     * Asigna el jefe del empleado
     * 
     * @param p_jefe: EmpleadoConJefe - jefe del empleado que se le asignará
     */
    private void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }
    
    //GETTERS
    /**
     * Obtiene el número de CUIL
     * 
     * @return cuil: long - cuil del empleado
     */
    public long getCuil(){
        return this.cuil;
    }
    
    /**
     * Obtiene el apellido
     * 
     * @return apellido: String - apellido del empleado
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Obtiene el nombre
     * 
     * @return nombre: String - nombre del empleado
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Obtiene el sueldo básico
     * 
     * @return sueldoBasico: double - sueldo básico del empleado
     */
    public double getSueldo(){
        return this.sueldoBasico;
    }
    
    /**
     * Obtiene la fecha de ingreso
     * 
     * @return fechaIngreso: Calendar - fecha de ingreso del empleado
     */
    public Calendar getFecha(){
        return this.fechaIngreso;
    }
    
    /**
     * Obtiene el año de ingreso
     * 
     * @return fechaIngreso.get(Calendar.YEAR): int - apellido del empleado
     */
    public int getAnioIngreso(){
        return this.fechaIngreso.get(Calendar.YEAR);
    }
    
    /**
     * Obtiene el jefe del empleado
     * 
     * @return jefe: EmpleadoConJefe - jefe del empleado
     */
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }
    
    /**
     * calcula la cantidad de años de antigüedad a partir del año actual
     * 
     * @return la diferencia del año actual y el año de ingreso
     */
    public int antiguedad(){
        Calendar anio = new GregorianCalendar();
        int anioActual = anio.get(Calendar.YEAR);
        return (anioActual - this.getAnioIngreso());
    }
    
    /**
     * * Calcula el valor del descuento sobre el sueldo básico correspondiente al 2%.
     * 
     * @return Monto del descuento.
     */
    private double descuento(){
        return (this.getSueldo()*2)/100;
    }
    
    /**
     * Calcula el importe adicional al sueldo según los años de antigüedad:
     * - Menos de 2 años: 2% del sueldo básico.
     * - De 2 a 9 años: 4% del sueldo básico.
     * - 10 años o más: 6% del sueldo básico.
     * 
     * @return Monto del adicional.
     */
     private double adicional(){
        double adicional = 0.0;
        
        if(this.antiguedad() < 2){
            adicional = this.getSueldo()*0.02;
        }else if(this.antiguedad() >= 2 && this.antiguedad() < 10){
            adicional = this.getSueldo()*0.04;
        }else{
            adicional =this.getSueldo()*0.06;
        }
        
        return adicional;
    }
    
    /**
     * Calcula el total del sueldo neto del empleado: 
     * Sueldo base mas el adicional menos el descuento.
     * 
     * @return el valor del sueldo neto
     */
    public double sueldoNeto(){
        return this.getSueldo()+adicional() - this.descuento();
    }
    
    /**
     * Concatena el nombre y apellido del empleado
     * 
     * @return Cadena con el formato "Nombre Apellido" 
     */
    public String nomYApe(){
        return this.getNombre()+" "+this.getApellido(); 
    }
    
    /**
     * Concatena el apellido y nombre del empleado
     * 
     * @return Cadena con el formato "Apellido Nombre"
     */
    public String apeYNom(){
        return this.getApellido()+", "+this.getNombre();
    }
    
    /**
     * Concatena y muestra la información importante en una sola línea.
     * 
     * @return una cadena con el mesaje CUIL Apellido Nombre sueldoNeto
     */
    public String mostrarLinea(){
        return (""+this.getCuil()+"  "+this.apeYNom()+"   ............$"+this.sueldoNeto());
    }
    
    /**
     * Muestra en pantalla el detalle del empleado: 
     * Nombre, CUIL, Antigüedad y Sueldo Neto.
     * Si el empleado tiene un jefe se muestra el nombre de su superior,
     * si no lo tiene imprime "GERENTE GENERAL".
     */
    public void mostrarPantalla(){
        System.out.print("\nNombre y Apellido: " + this.nomYApe());
        System.out.print("\nCUIL: " + this.getCuil()+" Antigüedad: " + this.antiguedad()+" años de servicio");
        System.out.print("\nSueldo Neto: $"+ this.sueldoNeto());
        if(this.getJefe() != null){
            System.out.print("\nResponde a: " + this.getJefe());
        }else{
            System.out.print("\nGERENTE GENERAL");
        }
    }
}
