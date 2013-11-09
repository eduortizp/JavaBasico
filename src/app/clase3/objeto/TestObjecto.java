package app.clase3.objeto;

public class TestObjecto {
    
    public static void main(String[] args) {
        
    
    Socio jose = new Socio(302, "Jose", "Tecsup");
    Socio luis = new Socio(302, "Luis", "Tecsup");
    
    if (jose == luis){
        System.out.println("Comprobando referencia");
    }

    if (jose.equals (luis)) 
        System.out.println("Comprobando el valor");
        System.out.println(jose.toString());
    }
}
