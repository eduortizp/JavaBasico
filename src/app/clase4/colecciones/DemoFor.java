package app.clase4.colecciones;

import javax.swing.JOptionPane;

public class DemoFor {

    String mensaje;

    public DemoFor() {

        String valorCadena = JOptionPane.showInputDialog(null, "Qué tabla de multiplicar que desea");

        try {

            int valorEntero = Integer.parseInt(valorCadena);//Si esto falla, entra al catch

            mensaje = "Tabla del " + valorCadena + "\n";// \n agrega un fin de línea a las cadenas 

            for (int i = 1; i <= 12; i++) {

                /*La siguiente línea se repetirá diez veces y concatenará

                 *cadenas del tipo “5x4=20” a la cabecera puesta antes del bucle

                 */
                mensaje = mensaje + i + "x" + valorCadena + "=" + (i * valorEntero) + "\n";

            }

        } catch (NumberFormatException ex) {

            mensaje = "No es un entero";

        }

        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static void main(String[] args) {

        new DemoFor();

    }

}
