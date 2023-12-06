package entidadess;

/**
 *
 * @author carol
 */
public class Prestamo {
    private int numeroPrestamo;
    private Socio socio;
    private float monto;
    private float saldo;
    private String estado;
    private float mensualidad;
    
     private static final String NORMAL = "Normal";
    private static final String ATRASADO = "Atrasado";
    private static final String FINALIZADO = "Finalizado";

    public Prestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
        this.socio = null;
        this.monto = 0.0f;
        this.saldo = 0.0f;
        this.estado = NORMAL;
        this.mensualidad = 0.0f;
    }
    //este es el constructor que recibe todos los atributos
     public Prestamo(int numeroPrestamo, Socio socio, float monto, float saldo, String estado, float mensualidad) {
        this.numeroPrestamo = numeroPrestamo;
        this.socio = socio;
        this.monto = monto;
        this.saldo = saldo;
        this.estado = estado;
        this.mensualidad = mensualidad;
    }

     //Los metodos set y get
    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(int numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }
    
    public float calcularIntereses() {//intereses
        float porcentajeInteres = this.socio.mostrarPorcInteres();
        return (this.saldo * porcentajeInteres) / 100;
    }
     public float calcularMensualidad() {//Mensualidad total
        float intereses = calcularIntereses();
        return this.mensualidad + intereses;
    }
      public void realizarAbono(float abono) {
        float intereses = calcularIntereses();
        float abonoConDescuentoIntereses = abono - intereses;

        if (abonoConDescuentoIntereses >= 0) {
            this.saldo -= abonoConDescuentoIntereses;

            if (this.saldo <= 0) {
                this.saldo = 0;
                this.estado = FINALIZADO;
            }
        }
    }
}
