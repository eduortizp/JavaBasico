package app.clase5.operaciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.in;
import static java.lang.System.out;
import java.net.Socket;

public class ServidorHilo extends Thread {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {
        try {
            // Crear los canales de lectura y escritura    
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));

            // COMUNICACION 1    
            out.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");

            // COMUNICACION 2    
            String resp2 = in.readLine();
            System.out.println(resp2);

            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (cliente != null) {
                    cliente.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
