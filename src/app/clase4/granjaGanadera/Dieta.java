package app.clase4.granjaGanadera;

public class Dieta {

    private double cantAlimento;
    private double cantAgua;

    public Dieta(double cantAlimento, double cantAgua) {
        this.cantAlimento = cantAlimento;
        this.cantAgua = cantAgua;
    }

    public double getCantAlimento() {
        return cantAlimento;
    }

    public void setCantAlimento(double cantAlimento) {
        this.cantAlimento = cantAlimento;
    }

    public double getCantAgua() {
        return cantAgua;
    }

    public void setCantAgua(double cantAgua) {
        this.cantAgua = cantAgua;
    }

}
