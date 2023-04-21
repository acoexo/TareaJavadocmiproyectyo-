import java.time.LocalDate;

public class Usuario {
    /**
     * Number of strikes of the user.
     */
     public int numeroStrikes;
     /**
     * Registration code for the user.
     */
     public static String codigoRegistro;
     /**
     * Name of the user.
     */
     public String name;
     /**
     * Surnames of the user.
     */
     public String apellidos;
     /**
     * ID card number of the user.
     */
     private final String DNI;
     /**
     * Address of the user.
     */
     private final String direccion;
     /**
     * Date of birth of the user.
     */
     private final LocalDate fecha_nac;
     /**
     * Date of registration of the user.
     */
    private final LocalDate fecha_registro;

    /**
     * Constructor for creating a new user.
     *
     * @param codigoRegistro The registration code of the user.
     * @param name The name of the user.
     * @param apellidos The surnames of the user.
     * @param DNI The ID card number of the user.
     * @param direccion The address of the user.
     * @param fecha_nac The date of birth of the user.
     * @param fecha_registro The date of registration of the user.
     */
    public Usuario(String codigoRegistro, String name, String apellidos, String DNI, String direccion, LocalDate fecha_nac, LocalDate fecha_registro) {
        this.numeroStrikes = 0;
        this.DNI = DNI;
        this.direccion = direccion;
        this.name = name;
        this.fecha_nac = fecha_nac;
        this.fecha_registro = fecha_registro;
        this.apellidos = apellidos;
        Usuario.codigoRegistro = codigoRegistro;
    }

    /**
     * Constructor for creating a user with a specified number of strikes.
     *
     * @param numeroStrikes The number of strikes of the user.
     * @param codigoRegistro The registration code of the user.
     * @param name The name of the user.
     * @param apellidos The surnames of the user.
     * @param DNI The ID card number of the user.
     * @param direccion The address of the user.
     * @param fecha_nac The date of birth of the user.
     * @param fecha_registro The date of registration of the user.
     */
    public Usuario(int numeroStrikes, String codigoRegistro, String name, String apellidos, String DNI, String direccion, LocalDate fecha_nac, LocalDate fecha_registro) {
        this.numeroStrikes = numeroStrikes;
        this.DNI = DNI;
        this.direccion = direccion;
        this.name = name;
        this.fecha_nac = fecha_nac;
        this.fecha_registro = fecha_registro;
        this.apellidos = apellidos;
        Usuario.codigoRegistro = codigoRegistro;
    }

    /**
     * Gets the invoice for a purchase made by the user.
     *
     * @param c1 The purchase made by the user.
     * @return The invoice for the purchase made by the user.
     */
    public Factura getFactura(Compras c1) {
        return Compras.factura;
    }

    /**
     * Gets the number of strikes of the user.
     *
     * @return The number of strikes of the user.
     */
    public int getNumeroStrikes() {
        return this.numeroStrikes;
    }

    /**
     * Makes a new purchase for the user.
     */
    public void hacerCompra(Productos p1) {
        new Compras(p1);
    }

    public static String getCodigoRegistro() {
        return codigoRegistro;
    }

    public String getDatosBancarios() {
        return null;
    }
}
