package entidadess;

/**
 *
 * @author carol
 */
public class Persona {
    private int cedula;
    private String nombre;
    private String telefono;
    private String sexo;

    public Persona(int cedula){
        this.cedula = cedula;
        this.nombre = " ";
        this.telefono = " ";
        this.sexo = " ";
    }
    public Persona(int cedula, String nombre, String telefono, String sexo){
        this.cedula = cedula;
        this.nombre = nombre;
        this.nombre = telefono;
        this.nombre = sexo;
     }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
