package app.clase5.socketsHilo;

import app.clase5.socketInfinito.*;

public class TestServidor {

    public static void main(String[] args) {
        Servidor server = new Servidor(9999);
        server.ejecutar();
    }
}
