package app.clase5.entradaSalida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {

    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("d:\\temario.txt");
            bw = new BufferedWriter(fw);
            bw.write("Es una linea");
            bw.newLine();
            bw.write("Es otra linea");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
