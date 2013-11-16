package app.clase4.granjaGanadera;

public class Tipo {
    
    private int codTipo;
    private String nomTipo;
    private String descripcion;
    
    public Tipo(int codTipo, String nomTipo, String descripcion) {
        this.codTipo = codTipo;
        this.nomTipo = nomTipo;
        this.descripcion = descripcion;
    }

    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    public String getNomTipo() {
        return nomTipo;
    }

    public void setNomTipo(String nomTipo) {
        this.nomTipo = nomTipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
