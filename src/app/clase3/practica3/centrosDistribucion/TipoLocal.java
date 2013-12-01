package app.clase3.practica3.centrosDistribucion;

import java.sql.Time;

class TipoLocal {

    private int codLocal;
    private String nomLocal;
    private Time horaApertura;
    private Time horaCierre;

    public TipoLocal(int codLocal, String nomLocal, Time horaApertura, Time horaCierre) {
        this.codLocal = codLocal;
        this.nomLocal = nomLocal;
        this.horaApertura = horaCierre;
        this.horaCierre = horaCierre;
    }

    public int getcodLocal() {
        return codLocal;
    }

    public void setcodLocal(int codLocal) {
        this.codLocal = codLocal;
    }

    public String getnomLocal() {
        return nomLocal;
    }

    public void setnomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

    public Time gethoraApertura() {
        return horaApertura;
    }

    public void sethoraApertura(Time horaApertura) {
        this.horaApertura = horaApertura;
    }

    public Time gethoraCierre() {
        return horaCierre;
    }

    public void sethoraCierre(Time horaCierre) {
        this.horaCierre = horaCierre;
    }
}
