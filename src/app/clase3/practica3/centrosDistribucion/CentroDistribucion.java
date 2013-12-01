package app.clase3.practica3.centrosDistribucion;

public class CentroDistribucion {

    private int codigo;
    private int ruc;
    private String razonSocial;
    private String direccion;
    private int telefonos;
    private Distrito distrito;
    private TipoLocal tipoLocal;
    private Producto producto;

    public CentroDistribucion(int codigo, int ruc, String razonSocial, String direccion, int telefonos, Distrito distrito, TipoLocal tipoLocal, Producto producto) {
        this.codigo = codigo;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.distrito = distrito;
        this.tipoLocal = tipoLocal;
        this.producto = producto;
    }

    public int getcodigo() {
        return codigo;
    }

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getruc() {
        return ruc;
    }

    public void setruc(int ruc) {
        this.ruc = ruc;
    }

    public String getrazonSocial() {
        return razonSocial;
    }

    public void setrazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getdireccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public int gettelefonos() {
        return telefonos;
    }

    public void settelefonos(int telefonos) {
        this.telefonos = telefonos;
    }

    public Distrito getdistrito() {
        return distrito;
    }

    public void setdistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public TipoLocal gettipoLocal() {
        return tipoLocal;
    }

    public void settipoLocal(TipoLocal tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public Producto getproducto() {
        return producto;
    }

    public void setproducto(Producto producto) {
        this.producto = producto;
    }
}
