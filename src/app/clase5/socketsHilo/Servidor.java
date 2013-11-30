package app.clase5.socketsHilo;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int port;

    public Servidor(int port) {
        this.port = port;
    }

    public void ejecutar() {
        try {
// Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(port);
            System.out.println("SERVIDOR: iniciado...");
            
            while (true) {

                Socket cliente = server.accept();
                ServidorHilo ts = new ServidorHilo(cliente);
                ts.start();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}