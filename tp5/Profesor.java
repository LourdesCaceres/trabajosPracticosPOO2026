import java.util.*;
import java.util.ArrayList;
/**
 * Abstracción de un profesor, hereda de la clase Persona atributos como su nombre, apellido, DNI y
 * fecha de nacimiento, agregando un titulo y una lista de cargos en una universidad.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 05/10/2026
 */
public class Profesor extends Persona
{
    //ATRIBUTOS
    private String titulo;
    private ArrayList<Cargo> cargos;

    /**
     * CONSTRUCTOR DE LA CLASE Profesor
     * 
     * @param p_dni: int - DNI del profesor.
     * @param p_nombre: String - nombre del profesor.
     * @param p_apellido: String - apellido del profesor.
     * @param p_anio: int - año de nacimiento del profesor (usa el segundo constructor de Persona)
     * @param p_titulo: String - titulo del profesor.
     * @param p_cargos: ArrayList<Cargo> - colección de máximo 3 cargos del profesor.
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo, ArrayList<Cargo> p_cargos){
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(new ArrayList<>(p_cargos));
    }

    //SETTER
    private void setTitulo(String p_titulo){
        this.titulo = p_titulo;
    }
    
    private void setCargos(ArrayList<Cargo> p_cargos){
        this.cargos = p_cargos;
    }
    
    //GETTER
    public String getTitulo(){
        return this.titulo;
    }
    
    public ArrayList<Cargo> getCargos(){
        return this.cargos;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Calcula, recorriendo la colección de cargos, el sueldo total del profesor,
     * que resulta de la suma de los sueldos propios de cada cargo individual.
     * 
     * @return sueldo total calculado del profesor.
     */
    public double sueldoTotal(){
        double sueldo = 0.0;
        for(Cargo unCargo : this.getCargos()){
            sueldo += unCargo.sueldoDelCargo();
        }
        
        return sueldo;
    }
    
    /**
     * Método propio de las colecciones, agrega un elemento a la misma.
     * 
     * @param p_cargo: Cargo - cargo a agregar.
     * @return true/false según si se pudo agregar el elemento.
     */
    public boolean agregarCargo(Cargo p_cargo){
        return this.getCargos().add(p_cargo);
    }
    
    /**
     * Método propio de las colecciones, quita un elemento de la misma.
     * 
     * @param p_cargo: Cargo - cargo a quitar.
     * @return true/false según si se pudo quitar el elemento.
     */
    public boolean quitarCargo(Cargo p_cargo){
        return this.getCargos().remove(p_cargo);
    }
    
    /**
     * Recorre la colección mediante un objeto colaborador Cargo y una estructura for, 
     * para mostrar los datos de cada cargo, generando una lista final de todos los cargos
     * del profesor.
     */
    public void listarCargos(){
        System.out.println("_***** Cargos Asignados *****_");
        System.out.println("------------------------------");
        for(Cargo unCargo : this.getCargos()){
            unCargo.mostrarCargo();
        }
    }
    
    /**
     * Sobreescribe el método mostrar() de la clase padre Persona. Reutiliza
     * el método heredado pero agrega los datos del profesor, es decir, titulos, cargos 
     * y su sueldo final.
     */
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Titulo: " + this.getTitulo());
        this.listarCargos();
        System.out.println("Saldo total: " + sueldoTotal());
    }
    
    /**
     * Concatena los datos del profesor en una sola línea con este formato:
     * "DNI - Nombre y Apellido - Sueldo Total"
     * 
     * @return cadena concatenada.
     */
    public String mostrarLinea(){
        return "DNI: " + this.getDNI() + " - Nombre: " + this.nomYApe() + " - Sueldo Total: " + this.sueldoTotal(); 
    }
}