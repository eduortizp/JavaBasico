package app.clase4.colecciones;

import javax.swing.JOptionPane;

public class DemoTryCatch {

    String mensaje;

    public DemoTryCatch() {

        String valorCadena = JOptionPane.showInputDialog(null, "Escribe un entero");

        try {

            int valorNumero = Integer.parseInt(valorCadena);

            /*Si lo escrito no es un entero la línea que sigue no se ejecuta, 

             *el programa busca el bloque catch y ejecuta su contenido

             */
            mensaje = "El valor es: " + valorNumero + " gracias";

        } catch (NumberFormatException ex) {//El bloque catch indica el error que captura.

            mensaje = "No escribiste un Entero";

        }

        JOptionPane.showMessageDialog(null, mensaje);//El mensaje enviado según el caso

    }

    public static void main(String[] args) {

        new DemoTryCatch();

    }

}
