package app.clase4.colecciones;

import javax.swing.JOptionPane;

public class DemoSwitch {

    String mensaje;

    public DemoSwitch() {

        String califCadena = JOptionPane.showInputDialog(null, "Escriba la calificación con número");

        try {

            int califNum = Integer.parseInt(califCadena);//Si esta línea falla entra al catch

            String calif;

            switch (califNum) {

                /*Los casos se eligen en virtud del valor 

                 *de la variable califNum

                 */
                case 0:
                    calif = "NA";
                    break;

                case 1:
                    calif = "NA";
                    break;

                case 2:
                    calif = "NA";
                    break;

                case 3:
                    calif = "NA";
                    break;

                case 4:
                    calif = "NA";
                    break;

                case 5:
                    calif = "NA";
                    break;

                case 6:
                    calif = "S";
                    break;

                case 7:
                    calif = "S";
                    break;

                case 8:
                    calif = "Buena";
                    break;

                case 9:
                    calif = "Muy Buena";
                    break;

                case 10:
                    calif = "Muy Buena";
                    break;

                default:
                    calif = "Inválida";
                    break;

                /*El default sucede en el caso de que se de un número

                 *distinto de los casos indicados. Es decir, un número

                 *entre 0 y 10

                 */
            }

            mensaje = "La calificación es: " + calif;

        } catch (NumberFormatException ex) {

            mensaje = "No escribió un número";

        }

        JOptionPane.showMessageDialog(null, mensaje);

    }

    public static void main(String[] args) {

        new DemoSwitch();

    }

}
