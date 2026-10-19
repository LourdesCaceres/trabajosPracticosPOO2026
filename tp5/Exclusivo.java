
/**
 * Clase hija de Cargo, representa el nivel de cargo más alto, permitiendo tener
 * horas de investigación y extender horas de docencia o investigación.
 * 
 * @author Chavez, Tobías Acdel. 
 * @version  1.0 - 05/10/2026
 */
public class Exclusivo extends Cargo
{
    //ATRIBUTOS
    private int horasDeInvestigacion;
    private int horasDeExtension;

    /**
     * CONSTRUCTOR DE LA CLASE Exclusivo: reutiliza el constructor de la clase padre.
     * 
     * @param p_nombre: String - nombre del cargo.
     * @param p_sueldo: double - sueldo básico del cargo.
     * @param p_anio: int - año en el cual ingresó.
     * @param p_horasDoc: int - las horas de docencia sobre el cargo.
     * @param p_horasInv: int - horas designadas a investigacion.
     * @param p_horasExt: int - horas de extensión.
     */
    public Exclusivo(String p_nombre, double p_sueldo, int p_anio, int p_horasDoc, int p_horasInv, int p_horasExt){
        super(p_nombre, p_sueldo, p_anio, p_horasDoc);
        this.setHorasInvestigacion(p_horasInv);
        this.setHorasExtension(p_horasExt);
    }
    
    //SETTER
    private void setHorasInvestigacion(int p_horasInv){
        this.horasDeInvestigacion = p_horasInv;
    }
    
    private void setHorasExtension(int p_horasExt){
        this.horasDeExtension = p_horasExt;
    }
    
    //GETTER
    public int getHorasInvestigacion(){
        return this.horasDeInvestigacion;
    }
    
    public int getHorasExtension(){
        return this.horasDeExtension;
    }
    
    /**
     * Sobreescribe el método de su clase padre, agregando la información extra
     * del cargo. Reutiliza el método de Cargo y luego agrega las horas de investigación y extensión
     * propias del cargo exclusivo.
     */
    @Override
    public void mostrarCargo(){
        super.mostrarCargo();
        System.out.println("----Cargo de caracter Exclusivo----");
        System.out.println("Horas investigacion: " + this.getHorasInvestigacion());
        System.out.println("Horas extension: " + this.getHorasExtension());
    }
}