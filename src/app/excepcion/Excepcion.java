package app.excepcion;

public class Excepcion {

    public static void main(String[] args) {
        Excepcion.testExcepcion1();
    }

    public static void testExcepcion1() {

        try {
            //int[] numeros = null;
            int[] numeros = {11, 2, 34, 4, 6, 7, 8, 98, 4, 3, 1};
            for (int i = 0; i < 11; i++) {
                int j = numeros[i];
                System.out.println(j);
            }
        } catch (NullPointerException e) {
            System.out.println("ERROR ARRAY NULO");
            e.printStackTrace();
        } finally {
            System.out.println("APLICACION TERMINADA");
        }
    }

    public static void testExcepcion() {
        try {

            int dividendo = 10;
            int divisor = 0;
            //int resultado = dividendo / divisor;

            int[] array = new int[2];
            array[10] = 100;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error ARRAY");

        } catch (ArithmeticException e) {
            System.out.println("Error MATEMATICA");

        } finally {
            System.out.println("FIN DE PROGRAMA");
        }
    }
}
