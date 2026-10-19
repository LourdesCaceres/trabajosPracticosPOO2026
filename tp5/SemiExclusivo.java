
/**
 * Clase hija de Cargo, representa el nivel de cargo medio, permitiendo tener
 * horas de investigación además de las de docencia.
 * 
 * @author Chavez, Tobías Acdel 
 * @version 1.0 - 05/10/2026
 */
public class SemiExclusivo extends Cargo
{
    //ATRIBUTOS
    private int horasDeInvestigacion;

    /**
     * CONSTRUCTOR DE LA CLASE SemiExclusivo: reutiliza el constructor de la clase padre.
     * 
     * @param p_nombre: String - nombre del cargo.
     * @param p_sueldo: double - sueldo básico del cargo.
     * @param p_anio: int - año en el cual ingresó.
     * @param p_horasDoc: int - las horas de docencia sobre el cargo.
     * @param p_horasInv: int - horas designadas a investigacion.
     */
    public SemiExclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horasDoc, int p_horasInv){
        super(p_nombre, p_sueldo, p_anio, p_horasDoc);
        this.setHorasInvestigacion(p_horasInv);
    }
    
    //SETTER
    private void setHorasInvestigacion(int p_horasInv){
        this.horasDeInvestigacion = p_horasInv;
    }
    
    //GETTER
    public int getHorasInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    /**
     * Reutiliza el método de Cargo y luego agrega las horas de investigación que
     * permite tener el cargo semiexclusivo
     */
    @Override
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter SemiExclusivo----");
        System.out.println("Horas investigacion: " + this.getHorasInvestigacion());
    }
}