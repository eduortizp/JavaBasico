package app.clase4.granjaGanadera;

import java.util.Date;

public class Animales {

    private String nomAnimal;
    private Tipo tipo;
    private double peso;
    private Date fNacim;
    private String observaciones;

    public Animales(String nomAnimal, Tipo tipo, double peso, Date fnacim, String observaciones) {
        this.nomAnimal = nomAnimal;
        this.tipo = tipo;
        this.peso = peso;
        this.fNacim = fNacim;
        this.observaciones = observaciones;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
