package app.clase1;

import java.util.Scanner;

public class Ejercicio8 {
	
    private static Scanner masa;

	public static void main(String[] args) {
    
    	masa = new Scanner(System.in);
        double peso;
        double estatura;
        
        System.out.print("Ingrese peso (Kg.): ");
        peso = masa.nextDouble();
        
        System.out.print("Ingrese estatura� (m.): ");
        estatura = masa.nextDouble();

        double imc = peso / (estatura*estatura);
        
        if (imc < 16.00){
    		System.out.println("\n" + "criterio de ingreso al hospital" + "\n");
        }
        else if (imc > 15.99  && imc < 17.01){
        	System.out.println("\n" + "infrapeso" + "\n");
        }
        else if (imc > 16.99  && imc < 18.01){
        	System.out.println("\n" + "bajo peso" + "\n");
        }
        else if (imc > 17.99  && imc < 25.01){
        	System.out.println("\n" + "peso normal saludable" + "\n");
        }
        else if (imc > 24.99  && imc < 30.01){
        	System.out.println("\n" + "sobrepeso (obesidad grado I)" + "\n");
        }
        else if (imc > 29.99  && imc < 35.01){
        	System.out.println("\n" + "sobre peso cr�nico (obesidad grado II)" + "\n");
        }
        else if (imc > 34.99  && imc < 40.01){
        	System.out.println("\n" + "obesidad prem�rbida (obesidad grado III)" + "\n");
        }
        	else {
        System.out.println("\n" + "obesidad m�rbida (obesidad grado IV)" + "\n");
    }
}
}