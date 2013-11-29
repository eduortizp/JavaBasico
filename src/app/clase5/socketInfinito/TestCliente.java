package app.clase5.socketInfinito;

import app.clase5.socketBasico.Cliente;

public class TestCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("localhost", 9999);
        cliente.doConectar();
    }
}
