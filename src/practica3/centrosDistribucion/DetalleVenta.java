package practica3.centrosDistribucion;

public class DetalleVenta {
    
    private Producto producto;
    private Venta venta;
    private int cantidad;

    public DetalleVenta(Producto producto, Venta venta, int cantidad) {
        this.producto = producto;
        this.venta = venta;        
        this.cantidad = cantidad;

    }

    public Producto getproducto() {
        return producto;
    }

    public void setproducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getventa() {
        return venta;
    }

    public void setventa(Venta venta) {
        this.venta = venta;
    }

    public int getcantidad() {
        return cantidad;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}