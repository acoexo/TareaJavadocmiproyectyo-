import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This class represents a purchase made by a user.
 */
public class Compras {
    public static Factura factura;
    private Usuario usuario;
    private ArrayList<Lineas> lineas;
    private LocalDate fechaCompra;
    private String tipoDeCompra;
    private double precioTotal;
    private String datosBancarios;

    /**
     * Constructor for the Compras class.
     *
     * @param usuario        the user making the purchase
     * @param lineas         the list of products being purchased
     * @param tipoDeCompra   the type of purchase (online or in-store)
     * @param datosBancarios the user's bank account information
     */
    public Compras(Usuario usuario, ArrayList<Lineas> lineas, String tipoDeCompra, String datosBancarios) {
        this.usuario = usuario;
        this.lineas = lineas;
        this.fechaCompra = LocalDate.now();
        this.tipoDeCompra = tipoDeCompra;
        this.datosBancarios = datosBancarios;
        this.precioTotal = calcularPrecioTotal();
    }

    /**
     * Constructor for the Compras class.
     *
     * @param producto the product being purchased
     */
    public Compras(Productos producto) {
        this.usuario = producto.getUsuario();
        this.lineas = new ArrayList<>();
        this.lineas.add(new Lineas(producto));
        this.fechaCompra = LocalDate.now();
        this.tipoDeCompra = "online";
        this.datosBancarios = usuario.getDatosBancarios();
        this.precioTotal = producto.getPrecio();
    }

    /**
     * Calculates the total price of the purchase.
     *
     * @return the total price of the purchase
     */
    private double calcularPrecioTotal() {
        double total = 0;
        for (Lineas line : lineas) {
            total += line.getPrecioProducto();
        }
        return total;
    }

    /**
     * Gets the user making the purchase.
     *
     * @return the user making the purchase
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Gets the list of products being purchased.
     *
     * @return the list of products being purchased
     */
    public ArrayList<Lineas> getLineas() {
        return lineas;
    }

    /**
     * Gets the date of the purchase.
     *
     * @return the date of the purchase
     */
    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    /**
     * Gets the type of purchase.
     *
     * @return the type of purchase
     */
    public String getTipoDeCompra() {
        return tipoDeCompra;
    }

    /**
     * Gets the total price of the purchase.
     *
     * @return the total price of the purchase
     */
    public double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Gets the user's bank account information.
     *
     * @return the user's bank account information
     */
    public String getDatosBancarios() {
        return datosBancarios;
    }

    /**
     * Adds a product to the list of products being purchased.
     *
     * @param line the product line to add
     */
    public void agregarLinea(Lineas line) {
        lineas.add(line);
        precioTotal += line.getPrecioProducto();
    }

    /**
     * Removes a product line from the list of products being purchased.
     * @param line the product line to remove
     */
    public void quitarLinea(Lineas line) {
        if (lineas.remove(line)) {
            precioTotal -= line.getPrecioProducto();
        }
    }
    /**
     * Generates an invoice for the purchase.
     * @return the invoice for the purchase
     */
    public Factura generarFactura() {
        return new Factura(lineas, fechaCompra, Usuario.getCodigoRegistro());
    }
}