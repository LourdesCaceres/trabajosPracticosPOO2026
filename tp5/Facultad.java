import java.util.ArrayList;

/**
 * Abstracción de una facultad con una lista de profesores, cada uno con sus cargos asignados.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 07/10/26
 */
public class Facultad
{
    // Atributos
    private ArrayList<Profesor> profesores;
    private String nombre;
    

    /**
     * PRIMER CONSTRUCTOR DE LA CLASE Facultad: representa la cardinalidad mínima uno.
     * 
     * @param p_nombre: String - nombre de la facultad.
     * @param p_profesor: Profesor - primer profesor en ser agregado o listado.
     */
    public Facultad(String p_nombre, Profesor p_profesor){
        this.setNombre(p_nombre);
        this.setProfesores(new ArrayList<Profesor>());
        this.getProfesores().add(p_profesor);
    }
    
    /**
     * SEGUNDO CONSTRUCTOR DE LA CLASE Facultad: representa la cardinalidad máxima muchos.
     * 
     * @param p_nombre: String - nombre de la facultad.
     * @param p_profesores: ArrayList<Profesor> - colección de profesores.
     */
    public Facultad(String p_nombre, ArrayList<Profesor> p_profesores){
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }
    
    //SETTERS
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setProfesores(ArrayList<Profesor> p_profesores){
        this.profesores = p_profesores;
    }
    
    //GETTERS
    public String getNombre(){
        return this.nombre;
    }
    
    public ArrayList<Profesor> getProfesores(){
        return this.profesores;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Método propio de las colecciones, quita un elemento de la misma.
     * 
     * @param p_profesor: Profesor - profesor a agregar.
     * @return true/false según si se pudo agregar el elemento.
     */
    public boolean agregarProfesor(Profesor p_profesor){
        return this.getProfesores().add(p_profesor);
    }
    
    /**
     * Método propio de las colecciones, quita un elemento de la misma.
     * 
     * @param p_profesor: Profesor - cargo a quitar.
     * @return true/false según si se pudo quitar el elemento.
     */
    public boolean quitarProfesor(Profesor p_profesor){
        return this.getProfesores().remove(p_profesor);
    }
    
    /**
     * Imprime un mensaje con el nombre de la facultad, la lista completa de profesores
     * y sus cargos. Utiliza un objeto colaborador y un for para recorrer la coleccion de profesores
     * e imprimir sus datos mediante sus métodos. Al final del mensaje se muestra el total a pagar por
     * todos los profesores.
     */
    public void nominaProfesores(){
        int cantidad = 0;
        System.out.println("**********Nomina Facultad: " + this.getNombre() + "**********");
        System.out.println("-------------------------------------------------------------");
        for(Profesor unProfesor : this.getProfesores()){
            System.out.println(unProfesor.mostrarLinea());
            cantidad++;
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("Total a pagar: " + totalAPagar());
        System.out.println("Hay " + cantidad + " profesores.");
    }
    
    /**
     * Recorre la lista de profesores y calcula un total a pagar a partir de la
     * suma de todos los sueldos de los profesores.
     * 
     * @return saldo total a pagar de la facultad por todos los profesores.
     */
    public double totalAPagar(){
        double totalPagar = 0.0;
        for(Profesor unProfesor : this.getProfesores()){
            totalPagar += unProfesor.sueldoTotal();
        }
        
        return totalPagar;
    }
    
    /**
     * Mensaje donde se muestra la lista de cargos de cada profesor, junto a sus datos.
     */
    public void listarProfesorCargos(){
        System.out.println("*****Detalle de profesores y cargos de la facultad: " + this.getNombre() + "*****");
        System.out.println("-------------------------------------------------------------");
        for(Profesor unProfesor : this.getProfesores()){
            unProfesor.mostrar();
            System.out.println("----------------------****-----------------------");
        }
    }
}