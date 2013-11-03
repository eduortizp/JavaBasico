package app.clase1;

public class TestCondicional {
	
	static boolean prueba1(int val){
		System.out.println("prueba1("+val+")");
		System.out.println("resultado:"+(val<1));
		return val < 1;
	}
	
	static boolean prueba2(int val) {
	System.out.println("preuba2(" + val + ")");
	System.out.println("resultado: " + (val < 2));
	return val < 2;
	}
	
	static boolean prueba3(int val) {
	System.out.println("prueba3(" + val + ")");
	System.out.println("resultado: " + (val < 3));
	return val < 3;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	// Primer prueba Condicional
	
		if(prueba1(0) && prueba2(2) && prueba3(2))
	System.out.println("Primera Expresion es Verdadera");
	
		else
	System.out.println("Primera Expresion es Falsa");
		
	// Segunda Prueba Condicional
	
		if(prueba1(4) || prueba2(1))
	System.out.println("Segunda Expresion es Verdadera");
	
		else
	System.out.println("Segunda Expresion es Falsa");
		
	// Tercer Prueba Negacion
	
		if(65 != 65)
	System.out.println("Tercer Expresion es Falsa");
	
		else
	System.out.println("Tercer Expresion es Verdadera");
	}
	}