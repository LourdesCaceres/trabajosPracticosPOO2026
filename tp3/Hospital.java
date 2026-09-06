
/**
 * Clase que representa un Hospital, con un nombre y director a cargo.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 31/08/2026
 */
public class Hospital
{
    // ATRIBUTOS
    private String nombreHospital;
    private String nombreDirector;

    /**
     * CONSTRUCTOR DE LA CLASE HOSPITAL
     * 
     * @param p_hospital: String - nombre del hospital.
     * @param p_director: String - nombre del director del hospital.
     */
    public Hospital(String p_hospital, String p_director){
        setNombreHospital(p_hospital);
        setNombreDirector(p_director);
    }
    
    //SETTERS
    private void setNombreHospital(String p_hospital){
        this.nombreHospital = p_hospital;
    }
    
    private void setNombreDirector(String p_director){
        this.nombreDirector = p_director;
    }
    
    //GETTERS
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    
    //MÉTODOS DE CLASE
    /**
     * Imprime en pantalla los datos del hospital, recibe un paciente por parámetro
     * y muestra sus datos junto a los del hospital.
     * 
     * @param p_paciente: Paciente - paciente del que sus datos son mostrados.
     */
    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: " + this.getNombreHospital() + "\tDirector: " + this.getNombreDirector());
        System.out.println("------------------------------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }
}