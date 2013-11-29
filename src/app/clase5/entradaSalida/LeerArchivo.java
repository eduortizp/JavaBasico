package app.clase5.entradaSalida;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {

    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        String sInput = null;
        try {
            fr = new FileReader("d:\\temario.txt");
            br = new BufferedReader(fr);
            while ((sInput = br.readLine()) != null) {
                System.out.println(sInput);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
