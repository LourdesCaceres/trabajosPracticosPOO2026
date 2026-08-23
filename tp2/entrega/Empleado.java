import java.util.*;
/**
 * La clase "Empleado" representa la abstracción de los datos personales de un empleado dentro
 * s¡de la empresa. Gestiona su sueldo total, en base a su antigüedad y calculos adicionales. 
 * 
 * @author Lourdes Gabriela Caceres 
 * @version 1.0 24/08/2026
 */
public class Empleado {
    //variables de intancia
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    /**
     * Constructor de la clase Empleado 
     * 
     * @param p_cuil Nro de cuil del empleado
     * @param p_apellido Apellido del empleado
     * @param p_nombre Nombre del empleado
     * @param p_sueldo sueldo base del empleado
     * @param p_anioIng Año en que ingreso a la empresa
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_sueldo, 
                        int p_anioIng){
        setCuil(p_cuil);
        setApellido(p_apellido);
        setNombre(p_nombre);
        setSueldo(p_sueldo);
        setAnioIngreso(p_anioIng);
    }

    /**
     * Obtiene el número de cuil
     * 
     * @return número de cuil
     */
    public long getCuil(){
        return cuil;
    }
    /**
     * Obtiene el apellido del empleado
     * 
     * @return cadena con el Apellido
     */    
    public String getApellido(){
        return apellido;
    }
    /**
     * Obtiene el nombre del empleado
     * 
     * @return cadena con el nombre 
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Obtiene el sueldo base actual
     * 
     * @return el monto del sueldo base
     */
    public double getSueldo(){
        return sueldoBasico;
    }
    /**
     * Obtiene el año en que ingreso a la empresa
     * 
     * @return el año de ingreso
     */
    public int getAnioIngreso(){
        return anioIngreso;
    }
    
    /**
     * Asigna el número de CUIL.
     * 
     * @param p_cuil CUIL a establecer.
     */
    private void setCuil(long p_cuil){
        cuil = p_cuil;
    }
    /**
     * Asigna el apellido del empleado
     * 
     * @param p_apellido
     */
    private void setApellido(String p_apellido){
        apellido = p_apellido;
    }
    /**
     * Asigna el nombre del empleado
     * 
     * @param p_nombre
     */
    private void setNombre(String p_nombre){
        nombre = p_nombre;
    }
    /**
     * Asigna monto del sueldo base 
     * 
     * @param p_sueldoBasico
     */
    private void setSueldo(double p_sueldo){
        sueldoBasico = p_sueldo;
    }
    /**
     * Asigna el año en que el empleado ingreso a la empresa
     * 
     * @param p_anio
     */
    private void setAnioIngreso(int p_anio){
        anioIngreso = p_anio;
    }
    
    /**
     * calcula la cantidad de años de antigüedad a partir del año actual
     * 
     * @return la diferencia del año actual y el año de ingreso
     */
    public int antiguedad(){
        Calendar anio = new GregorianCalendar();
        int anioActual = anio.get(Calendar.YEAR);
        return (anioActual - getAnioIngreso());
    }
    
    /**
     * * Calcula el valor del descuento sobre el sueldo básico correspondiente al 2%.
     * 
     * @return Monto del descuento.
     */
    private double descuento(){
        return (getSueldo()*2)/100;
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
        
        if(antiguedad() < 2){
            adicional = getSueldo()*0.02;
        }else if(antiguedad() >= 2 && antiguedad() < 10){
            adicional = getSueldo()*0.04;
        }else{
            adicional =getSueldo()*0.06;
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
        return getSueldo()+adicional() - descuento();
    }
    
    /**
     * Concatena el nombre y apellido del empleado
     * 
     * @return Cadena con el formato "Nombre Apellido" 
     */
    public String nomYApe(){
        return getNombre()+" "+getApellido(); 
    }
    
    /**
     * Concatena el apellido y nombre del empleado
     * 
     * @return Cadena con el formato "Apellido Nombre"
     */
    public String apeYNom(){
        return getApellido()+", "+getNombre();
    }
    
    /**
     * Muestra en pantalla el detalle del empleado: 
     * Nombre, CUIL, Antigüedad y Sueldo Neto.
     */
    public void mostrar(){
        System.out.print("\nNombre y Apellido: "+nomYApe());
        System.out.print("\nCUIL: "+getCuil()+" Antigüedad: "+antiguedad()+" años de servicio");
        System.out.print("\nSueldo Neto: $"+sueldoNeto());
    }
    
    /**
     * Concatena y muestra la información importante en una sola línea.
     * 
     * @return una cadena con el mesaje CUIL Apellido Nombre sueldoNeto
     */
    public String mostrarLinea(){
        return (""+getCuil()+"  "+apeYNom()+"   ............$"+sueldoNeto());
    }
}