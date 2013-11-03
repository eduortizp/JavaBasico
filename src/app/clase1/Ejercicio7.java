package app.clase1;

import java.util.*;

public class Ejercicio7 {
	
    private static Scanner pago;

	public static void main(String[] args) {
    
    	pago = new Scanner(System.in);
        int edad;
        int precio;
        int descuento = 0;
        int total = 0;
        
        System.out.print("Ingrese edad de cliente: ");
        edad = pago.nextInt();
        
        System.out.print("Ingrese precio de ropa: ");
        precio = pago.nextInt();
        
        if (edad <= 17){
    		descuento = (int) (precio * 0.15);
    		System.out.println("\n" + "Descuento (15%): " + "\n" + descuento + "\t" + "Nuevos soles" + "\n");
    		total = (int) (precio - descuento); 
            System.out.println("\n" + "Total a pagar: " + "\n" + total + "\t" + "Nuevos soles");
        }
        else if (edad > 60){
        	descuento = (int) (precio * 0.30);
        	System.out.println("\n" + "Descuento (30%): " + "\n" + descuento + "\t" + "Nuevos soles" + "\n");
        	total = (int) (precio - descuento);
        	System.out.println("\n" + "Total a pagar: " + "\n" + total + "\t" + "Nuevos soles");
        }
        	else {
        total = (int) (precio - descuento); 
        System.out.println("\n" + "Total a pagar: " + "\n" + total + "\t" + "Nuevos soles" + "\n");
    }
}
}