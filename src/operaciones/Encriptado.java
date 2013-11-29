package operaciones;

public class Encriptado {

    public static void main(String args[]) {

        String mensaje = "Esto es un ejemplo de encriptado y desencriptado";
        char array[] = mensaje.toCharArray();

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] + (char) 5);
        }
        String encriptado = String.valueOf(array);
        System.out.println(encriptado);

        char arrayD[] = encriptado.toCharArray();
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = (char) (arrayD[i] - (char) 5);
        }
        String desencriptado = String.valueOf(arrayD);
        System.out.println(desencriptado);
    }
}
