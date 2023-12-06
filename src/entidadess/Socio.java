package entidadess;


import java.time.LocalDate;
/**
 *
 * @author carol
 */
public class Socio extends Persona{
    private LocalDate fechaIngreso;
    private String tipoSocio;

    public Socio(int cedula) {
        super(cedula);
        this.fechaIngreso = LocalDate.now();
        this.tipoSocio = "B-";
        comprobarTipoSocio(this.tipoSocio);
        
    }
     public Socio(int cedula, String tipoSocio) {
        super(cedula);
        this.fechaIngreso = LocalDate.now(); // Fecha actual
        this.tipoSocio = tipoSocio;
        comprobarTipoSocio(this.tipoSocio); // Comprobar y ajustar el tipo de socio
    }

    private void comprobarTipoSocio(String tipoSocio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Socio(int cedula, String nombre, String telefono, String sexo, LocalDate fechaIngreso, String tipoSocio) {
        super(cedula, nombre, telefono, sexo);
        this.fechaIngreso = fechaIngreso;
        this.tipoSocio = tipoSocio;
        comprobarTipoSocio(this.tipoSocio);
    }

    public LocalDate getFechaIngreso() {//Estos son los metodos get y set
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getTipoSocio() {
        return tipoSocio;
    }
     private void setTipoSocio(String tipoSocio) {
        this.tipoSocio = tipoSocio;
        comprobarTipoSocio(this.tipoSocio);
    }
      /*private void comprobarTipoSocio(String tipo) {
        String[] tiposValidos = {"A+", "A-", "B+", "B-"};
        boolean esTipoValido = false;
        for (String tipoValido : tiposValidos) {
            if (tipo.equalsIgnoreCase(tipoValido)) {
                esTipoValido = true;
                break;
            }
        }
      
        if (!esTipoValido) {
            this.tipoSocio = "B-"; // Valor por defecto si el tipo no es válido
        }
    }
      if (!esTipoValido) {
            this.tipoSocio = "B-"; // Valor por defecto si el tipo no es válido
        }*/

    float mostrarPorcInteres() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
