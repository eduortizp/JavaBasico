package app.clase5.socketBasico;

public class TestServidor {

    public static void main(String[] args) {
        Servidor server = new Servidor(9999);
        server.ejecutar();
    }
}
