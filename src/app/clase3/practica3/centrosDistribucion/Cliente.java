package app.clase3.practica3.centrosDistribucion;

public class Cliente {

    private int dni;
    private String nombres;
    private String pater;
    private String mater;
    private int telefono;
    private String direccion;
    private Distrito distrito;

    public Cliente(int dni, String nombres, String pater, String mater, int telefono, String direccion, Distrito distrito) {
        this.dni = dni;
        this.nombres = nombres;
        this.pater = pater;
        this.mater = mater;
        this.telefono = telefono;
        this.direccion = direccion;
        this.distrito = distrito;
    }

    public int getdni() {
        return dni;
    }

    public void setdni(int dni) {
        this.dni = dni;
    }
    
    public String getdnombres() {
        return nombres;
    }

    public void setnombres(String nombres) {
        this.nombres = nombres;
    }
    
    public String getpater() {
        return pater;
    }

    public void setpater(String pater) {
        this.pater = pater;
    }
    
    public String getmater() {
        return mater;
    }

    public void setmater(String mater) {
        this.mater = mater;
    }
    
    public int gettelefono() {
        return telefono;
    }

    public void settelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public String direccion() {
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public Distrito getdistrito() {
        return distrito;
    }

    public void setdistrito(Distrito distrito) {
        this.distrito = distrito;
    }
    
}
