package app.insectos;

public abstract class Hymenoptera {

    private String orden;
    private String nombre;
    private int tiempoVida;
    private String descripcion;

    public Hymenoptera(String orden, String nombre, int tiempoVida, String descripcion) {
        this.orden = orden;
        this.nombre = nombre;
        this.tiempoVida = tiempoVida;
        this.descripcion = descripcion;
    }

    public abstract void funcion();

    public abstract void trabajo();

    public abstract void comer();
    

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
