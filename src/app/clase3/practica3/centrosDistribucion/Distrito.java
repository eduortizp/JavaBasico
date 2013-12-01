package app.clase3.practica3.centrosDistribucion;

public class Distrito {

    private int codDist;
    private int codProv;
    private int codDep;
    private String nombre;

    public Distrito(int codDist, int codProv, int codDep, String nombre) {
        this.codDist = codDist;
        this.codProv = codProv;
        this.codDep = codDep;
        this.nombre = nombre;

    }

    public int getcodDist() {
        return codDist;
    }

    public void setcodDist(int codDist) {
        this.codDist = codDist;
    }

    public int getcodProv() {
        return codProv;
    }

    public void setcodProv(int codProv) {
        this.codProv = codProv;
    }

    public int getcodDep() {
        return codDep;
    }

    public void setcodDep(int codDep) {
        this.codDep = codDep;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

}
