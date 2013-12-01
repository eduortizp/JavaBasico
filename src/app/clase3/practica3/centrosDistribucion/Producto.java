package app.clase3.practica3.centrosDistribucion;

public class Producto {

    private int codigo;
    private String descripcion;
    private int unidadMedida;
    private double precio;
    private String tipoProducto;

    public Producto(int codigo, String descripcion, int unidadMedida, double precio, String tipoProducto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
    }

    Producto(String antalgina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getcodigo() {
        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getunidadMedida() {
        return unidadMedida;
    }

    public void setunidadMedida(int unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getprecio() {
        return precio;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }
    
    public String gettipoProducto() {
        return tipoProducto;
    }

    public void settipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
}
