package app.clase5.socketsHilo;

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

            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));

            out.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");

            calculadora(out, in);
            
            String resp2 = in.readLine();
            System.out.println(resp2);

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

    private void calculadora(PrintWriter out, BufferedReader in) throws IOException {

        out.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");

        String nombre = in.readLine();
        System.out.println(nombre);

        String operacion = in.readLine();
        Double operador1;
        operador1 = Double.parseDouble(in.readLine());
        Double operador2;
        operador2 = Double.parseDouble(in.readLine());

        if (operacion.equals("m")) {
            out.println("SERVIDOR: MULTIPLICACION");
            out.println(operador1 * operador2);

        } else if (operacion.equals("s")) {
            out.println("SERVIDOR: SUMA");
            out.println(operador1 + operador2);

        } else if (operacion.equals(
                "r")) {
            out.println("SERVIDOR: RESTA");
            out.println(operador1 - operador2);

        } else if (operacion.equals(
                "d")) {
            out.println("SERVIDOR: DIVISION");
            out.println(operador1 / operador2);

        } else {
            out.println("SERVIDOR: NO ES UNA OPERACION ARITMETICA");
        }
    }
}
