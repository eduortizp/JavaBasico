package app.clase3.practica3.centrosDistribucion;

public class Medicamento {

    private Producto producto;
    private String posologia;
    private String contraindicaciones;

    public Medicamento(Producto producto, String posologia, String contraindicaciones) {
        this.producto = producto;
        this.posologia = posologia;
        this.contraindicaciones = contraindicaciones;
    }

    public Producto getproducto() {
        return producto;
    }

    public void setproducto(Producto producto) {
        this.producto = producto;
    }

    public String getposologia() {
        return posologia;
    }

    public void setposologia(String posologia) {
        this.posologia = posologia;
    }

    public String getcontraindicaciones() {
        return contraindicaciones;
    }

    public void setcontraindicaciones(String contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

}
