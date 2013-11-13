package practica3.centrosDistribucion;

public class Medico {
    
    private int numLicencia;
    private String nombres;
    private String pater;
    private String mater;
    private int añoGraduacion;

    public Medico(int numLicencia, String nombres, String pater, String mater, int añoGraduacion) {
        this.numLicencia = numLicencia;
        this.nombres = nombres;
        this.pater = pater;
        this.mater = mater;
        this.añoGraduacion = añoGraduacion;
    }

    public int getnumLicencia() {
        return numLicencia;
    }

    public void setnumLicencia(int numLicencia) {
        this.numLicencia = numLicencia;
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
    
    public int getañoGraduacion() {
        return añoGraduacion;
    }

    public void setañoGraduacion(int añoGraduacion) {
        this.añoGraduacion = añoGraduacion;
    }
    
}
