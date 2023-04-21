import java.time.LocalDate;

public class Lineas {
    private LocalDate fechaCompra;
    private String tipoCompra;
    private double precioProducto;
    private String datosBancarios;
    private Productos producto;
    private int cantidad;

    public Lineas(Productos producto) {
        this.fechaCompra = fechaCompra;
        this.tipoCompra = tipoCompra;
        this.precioProducto = precioProducto;
        this.datosBancarios = datosBancarios;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Lineas(Productos producto, String tipoCompra, int cantidad) {
        this.producto = producto;
        this.tipoCompra = tipoCompra;
        this.cantidad = cantidad;
        this.precioProducto = producto.getPrecio() * cantidad;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(String tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getDatosBancarios() {
        return datosBancarios;
    }

    public void setDatosBancarios(String datosBancarios) {
        this.datosBancarios = datosBancarios;
    }

    public Productos getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.precioProducto = producto.getPrecio() * cantidad;
    }
}




