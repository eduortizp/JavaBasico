package app.clase5.socketsHilo;

import app.clase5.socketsHilo.*;
import app.clase5.socketsHilo.Cliente;

public class TestCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("localhost", 9999);
        cliente.doConectar();
    }
}
