package app.insectos;

public class Zangano extends Hymenoptera {

    public Zangano(String orden, String nombre, int tiempoVida, String descripcion) {
        super(orden, nombre, tiempoVida, descripcion);
        this.setNombre(nombre);
        this.setTiempoVida(tiempoVida);
    }

    @Override
    public void funcion() {
        System.out.println("Reinar");
    }

    @Override
    public void trabajo() {
        System.out.println("Hace la miel");
    }

    @Override
    public void comer() {
        System.out.println("Polen");
    }
}
