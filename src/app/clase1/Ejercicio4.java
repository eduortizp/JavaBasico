package app.clase1;

public class Ejercicio4 {
	
	public static void main(String[] args) {
        int X = 5;
    	int Y = 2;
        System.out.println("Valores iniciales: X = " + X + "   Y = " + Y);
        X = X + Y;
        Y = X - Y;
        X = X - Y;
        System.out.println("Valores intercambiados: X = " + X + "   Y = " + Y);
    }
}