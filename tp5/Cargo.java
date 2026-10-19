import java.util.*;
import java.util.GregorianCalendar;
/**
 * La clase cargo es una abstracción de un cargo que puede asumir un profesor universitario
 * en una facultad, importando el nombre el sueldo asignado, el año en cual ingresó y las
 * horas de docencia.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 05/10/2026
 * 
 */
public class Cargo
{
    //ATRIBUTOS
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE Cargo: para cuando se trata de un cargo simple, las horas
     * de docencia se mantiene como constante.
     * 
     * @param p_nombre: String - nombre del cargo.
     * @param p_sueldo: double - sueldo básico del cargo.
     * @param p_anio: int - año en el cual ingresó.
     */
    public Cargo(String p_nombre, double p_sueldo, int p_anio){
        this.setNombreCargo(p_nombre);
        this.setSueldoBasico(p_sueldo);
        this.setAnioIngreso(p_anio);
        this.setHorasDocencia(10);
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE Cargo: constructor para las clases hijas, las cuales
     * solo ellas pueden acceder y permiten modificar las horas de docencia.
     * 
     * @param p_nombre: String - nombre del cargo.
     * @param p_sueldo: double - sueldo básico del cargo.
     * @param p_anio: int - año en el cual ingresó.
     * @param p_horasDoc: int - las horas de docencia sobre el cargo.
     */
    protected Cargo(String p_nombre, double p_sueldo, int p_anio, int p_horasDoc){
        this.setNombreCargo(p_nombre);
        this.setSueldoBasico(p_sueldo);
        this.setAnioIngreso(p_anio);
        this.setHorasDocencia(p_horasDoc);
    }
    
    //SETTERS
    private void setNombreCargo(String p_nombre){
        this.nombreCargo = p_nombre;
    }
    
    private void setSueldoBasico(double p_sueldo){
        this.sueldoBasico = p_sueldo;
    }
    
    private void setAnioIngreso(int p_anio){
        this.anioIngreso = p_anio;
    }
    
    private void setHorasDocencia(int p_horasDoc){
        this.horasDeDocencia = p_horasDoc;
    }
    
    //GETTERS
    public String getNombreCargo(){
        return this.nombreCargo;
    }
    
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    public int getHorasDocencia(){
        return this.horasDeDocencia;
    }
    
    //MÉTODOS DE CLASE
    

    /**
     * Calcula la cantidad de años que lleva el profesional en el cargo. Calculado 
     * mediante una resta entre el año de ejcución del programa y el año de ingreso.
     * 
     * @return antiguedad calculada del cargo.
     */
    public int antiguedad(){
        Calendar anio = new GregorianCalendar();
        int anioHoy = anio.get(Calendar.YEAR);
        return (anioHoy - this.getAnioIngreso());
    }
    
    /**
     * Calculo del adicional que se agrega por la antiguedad del cargo.
     * 
     * @return el resultado del producto entre la antiguedad y el porcentaje adicional (1% del sueldo por año).
     */
    private double adicionalXAntiguedad(){
        double porcAdicional = this.getSueldoBasico() * 0.01;
        return this.antiguedad() * porcAdicional;
    }
    
    /**
     * Calcula el sueldo total del cargo al sumar el sueldo básico con
     * el adicional calculado.
     * 
     * @return sueldo total calculado.
     */
    public double sueldoDelCargo(){
        return this.getSueldoBasico() + this.adicionalXAntiguedad();
    }
    
    /**
     * Imprime en pantalla todos los datos del cargo en su manera simple.
     */
    public void mostrarCargo(){
        System.out.println(this.getNombreCargo() + " - Sueldo Basico: " + this.getSueldoBasico() + " - Sueldo Cargo: "
                            + this.sueldoDelCargo() + " - Antiguedad: " + this.antiguedad() + " años.");
        System.out.println("Horas de Docencia: " + this.getHorasDocencia());                    
    }
    
    
}