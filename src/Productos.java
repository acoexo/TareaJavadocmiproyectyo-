/**
 * This class represents a product in the system.
 */
public class Productos {
    public String Codigo;
    public String description;
    public double precio;
    public String name;

    /**
     * Constructor for the Productos class.
     * @param description a description of the product
     * @param precio the price of the product
     * @param name the name of the product
     */
    Productos(String description, double precio, String name){
        this.description=description;
        this.precio=precio;
        this.name=name;
        this.Codigo=generarCodigoProducto();
    }

    /**
     * Gets the price of the product.
     * @return the price of the product
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Gets the code of the product.
     * @return the code of the product
     */
    public String getCodigo() {
        return this.Codigo;
    }

    /**
     * Gets the description of the product.
     * @return the description of the product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the name of the product.
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Generates a code for the product.
     * @return the generated code for the product
     */
    private String generarCodigoProducto() {
        String codigo = String.valueOf(this.name).substring(0,1).concat(this.name.substring(0,1));
        codigo=codigo.concat("AST");
        codigo=codigo.concat(String.valueOf(this.precio).substring(0,1));
        return codigo;
    }

    public Usuario getUsuario() {
        return Usuario;
    }
}