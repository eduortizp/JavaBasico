package app.clase5.socketsHilo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

    private String host;
    private int port;

    public Cliente(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);
            // Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

            // COMUNICACION 1
            String msg = in.readLine();


            // COMUNICACION 2
            out.println("CLIENTE: Hola Servidor");
            out.println("d");
            out.println(99);
            out.println(9);

            msg = in.readLine();
            System.out.println(msg);

            msg = in.readLine();
            System.out.println(msg);

            msg = in.readLine();
            System.out.println(msg);

            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}
