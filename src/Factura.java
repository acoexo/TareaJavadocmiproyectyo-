import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This class represents a bill or invoice in the system.
 */
public class Factura {
    private String cuerpo;
    private LocalDate fechaCompra;
    private String tipoDeCompra;
    private double precioProducto;
    private String datosBancarios;
    private String idUsuario;

    /**
     * Constructor for the Facturas class.
     * @param cuerpo the body of the invoice
     * @param fechaCompra the date of purchase
     * @param tipoDeCompra the type of purchase (e.g. online, in-store)
     * @param precioProducto the price of the purchased product
     * @param datosBancarios the user's bank information
     * @param idUsuario the ID of the user who made the purchase
     */
    public Factura(String cuerpo, LocalDate fechaCompra, String tipoDeCompra, double precioProducto, String datosBancarios, String idUsuario) {
        this.cuerpo = cuerpo;
        this.fechaCompra = fechaCompra;
        this.tipoDeCompra = tipoDeCompra;
        this.precioProducto = precioProducto;
        this.datosBancarios = datosBancarios;
        this.idUsuario = idUsuario;
    }

    public Factura(ArrayList<Lineas> lineas, LocalDate fechaCompra, String codigoRegistro) {
    }

    /**
     * Gets the date of purchase.
     * @return the date of purchase
     */
    public LocalDate ObtenerFechaCompra() {
        return this.fechaCompra;
    }

    /**
     * Gets information about the purchased product.
     * @return a string containing information about the purchased product
     */
    public String ObtenerInformacionProducto() {
        return "Product: " + this.cuerpo + "\nPrice: " + this.precioProducto;
    }

    /**
     * Gets the ID of the user who made the purchase.
     * @return the ID of the user who made the purchase
     */
    public String ObtenerIDUsuario() {
        return this.idUsuario;
    }
}