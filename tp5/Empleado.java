import java.util.*;
import java.util.GregorianCalendar;

/**
 * La clase 
 * 
 * @author Lourdes Gabriela Caceres 
 * @version 1.0 24/08/2026
 * @version 2.0 03/09/2026
 * @version 3.0 28/09/2026
 */
public class Empleado extends Persona{
    //variables de intancia
    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso;      //anteriormente int anioIngreso

    /**
     * 1er constructor de la clase Empleado 
     */
    public Empleado(int p_dni, long p_cuil, String p_nombre, String p_apellido, int p_anioNac,
                    double p_sueldo, int p_anioIng){
        super(p_dni, p_nombre, p_apellido, p_anioNac);
        this.setCuil(p_cuil);
        this.setSueldo(p_sueldo);
        this.setAnioIngreso(p_anioIng);
    }
    /**
     * 2do constructor de la clase Empleado
     */
    public Empleado(int p_dni, long p_cuil, String p_nombre, String p_apellido, double p_sueldo, 
                     Calendar p_anioNac, Calendar p_fecha){
        super(p_dni, p_nombre, p_apellido, p_anioNac);
        this.setCuil(p_cuil);
        this.setSueldo(p_sueldo);
        this.setFechaIngreso(p_fecha);
    }

    //Observadores (GETTERS)
    public long getCuil(){
        return this.cuil;
    }
    public double getSueldo(){
        return this.sueldoBasico;
    }
    public int getAnioIngreso(){        //debe seguir retornando un int
        return this.getFechaIngreso().get(Calendar.YEAR);
    }
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    //Mutadores (SETTERS)
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    private void setSueldo(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    private void setAnioIngreso(int p_anio){
        Calendar p_fecha = new GregorianCalendar(p_anio, Calendar.JANUARY, 1);
        this.setFechaIngreso(p_fecha);
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
        
        if(antiguedad() < 2){
            adicional = this.getSueldo()*0.02;
        }else if(antiguedad() >= 2 && antiguedad() < 10){
            adicional = this.getSueldo()*0.04;
        }else{
            adicional = this.getSueldo()*0.06;
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
        return this.getSueldo()+this.adicional() - this.descuento();
    }
    
    /**
     * Muestra en pantalla el detalle del empleado: 
     * Nombre, CUIL, Antigüedad y Sueldo Neto.
     */
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.print("\nCUIL: "+this.getCuil()+" Antigüedad: "+this.antiguedad()+
                         " años de servicio");
        System.out.print("\nSueldo Neto: $"+this.sueldoNeto());
    }
    
    /**
     * Concatena y muestra la información importante en una sola línea.
     * 
     * @return una cadena con el mesaje CUIL Apellido Nombre sueldoNeto
     */
    public String mostrarLinea(){
        return (""+this.getCuil()+"  "+super.apeYNom()+"   ............$"
                 +this.sueldoNeto());
    }
    
    /**
     * metodo esAniversario 
     * 
     * @return 
     */
    public boolean esAniversario(){
        
        Calendar fecha = new GregorianCalendar();
        int diaHoy = fecha.get(Calendar.DAY_OF_MONTH);
        int mesHoy = fecha.get(Calendar.MONTH);
        
        int diaIngreso = this.getFechaIngreso().get(Calendar.DAY_OF_MONTH);
        int mesIngreso = this.getFechaIngreso().get(Calendar.MONTH);
        
        return (diaHoy == diaIngreso && mesHoy == mesIngreso);
    }
}