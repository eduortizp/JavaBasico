package app.clase4.granjaGanadera;

public class Alimentos {

    private String nomAlimento;
    private Tipo tipo;
    private String uniMedida;
    private double precio;
    private Nutriente nutriente;
    private double valNut;
    private double cantNut;

    public Alimentos(String nombre, Tipo tipo, String uniMedida, double precio, Nutriente nutriente, double valNut, double cantNut) {
        this.nomAlimento = nombre;
        this.tipo = tipo;
        this.uniMedida = uniMedida;
        this.precio = precio;
        this.nutriente = nutriente;
        this.valNut = valNut;
        this.cantNut = cantNut;
    }

    public String getNomAlimento() {
        return nomAlimento;
    }

    public void setNomAlimento(String nombre) {
        this.nomAlimento = nomAlimento;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getUniMedida() {
        return uniMedida;
    }

    public void setUniMedida(String UniMedida) {
        this.uniMedida = uniMedida;
    }

    public double getPtrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Nutriente getNutriente() {
        return nutriente;
    }

    public void setNutriente(Nutriente nutriente) {
        this.nutriente = nutriente;
    }

    public double getValNut() {
        return valNut;
    }

    public void setValNut(double valNut) {
        this.valNut = valNut;
    }

    public double getCantNut() {
        return cantNut;
    }

    public void setCantNut(double cantNut) {
        this.cantNut = cantNut;
    }
}