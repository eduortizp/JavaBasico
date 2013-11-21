package app.clase4.colecciones;

import javax.swing.JOptionPane;

public class DemoErrorNumero {

    String mensaje;

    public DemoErrorNumero() {

        String valorCadena = JOptionPane.showInputDialog(null, "Escribe un entero");

        /*El método parseInt() de la clase Integer de la librería lang

         *convierte un String en un int

         */
        int valorNumero = Integer.parseInt(valorCadena);

        JOptionPane.showMessageDialog(null, "El valor es " + valorCadena);

    }

    public static void main(String[] args) {

        new DemoErrorNumero();

    }

}  

