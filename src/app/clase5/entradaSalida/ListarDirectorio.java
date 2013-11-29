package app.clase5.entradaSalida;

import java.io.*;

public class ListarDirectorio {

    public static void main(String args[]) {
        File directorio = new File("C:\\ ");
        if ((directorio.exists()) && (directorio.isDirectory())) {
            String[] lista = directorio.list();
            for (int i = 0; i < lista.length; i++) {
                System.out.println(lista[i]);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }
}
