package app.clase4.granjaGanadera;

public class Nutriente {
    
    private String nomNutriente;
    private String uniMed;
    private String estado;

    public Nutriente(String nomNutriente, String uniMed, String estado) {
        this.nomNutriente = nomNutriente;
        this.uniMed = uniMed;
        this.estado = estado;
    }

    public String getNomNutriente() {
        return nomNutriente;
    }

    public void setNomNutriente(String nomNutriente) {
        this.nomNutriente = nomNutriente;
    }

    public String getUniMed() {
        return uniMed;
    }

    public void setUniMed(String uniMed) {
        this.uniMed = uniMed;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
