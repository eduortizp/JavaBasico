package app.clase5.sockets;

public class ClienteMain {

    public static void main(String[] args) {
        Cliente c = new Cliente("localhost", 2365);
        c.doConectar();
    }
}
