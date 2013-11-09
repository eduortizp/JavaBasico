package app.clase3.cadenas;

public class Cadena {

    public static void main(String[] args) {
        Cadena.buffer1();
    }
    
    public static void buffer1() {
        
        StringBuffer buffer = new StringBuffer("Tecsup");
        buffer.append(" - ");
        buffer.append("Java");
        
        buffer.insert(0, "Instituto ");
        
        buffer.delete(buffer.indexOf("java"), buffer.length());
        
        System.out.println(buffer);
                     
    }
    
    public static void metodosString() {
        
        String jose = "            jose luis eusebio alderete        ";
        
        System.out.println(jose.toUpperCase());
        
        System.out.println(jose.contains("u"));
        
        System.out.println(jose.length());
        
        System.out.println(jose.trim());
        
    }

    public static void reemplazo() {
        String palabras = "java permite crear java applets, javabeans y java servlets";
        
        palabras = palabras.replaceAll("java", "php");
                
        System.out.println(palabras.replaceAll("java", "JAVA"));
    }


    
    public static void extraccion2() {
        
        String texto = "Tecsup";
        
        System.out.println(texto.subSequence(1, 3));
        
        System.out.println(texto.substring(2));
        
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.substring(i, i + 1) + "\n");

        }
        
    }

    public static void extraccion() {

        String texto = "Tecsup";
        
        System.out.println("Número de Caracteres: " + texto.length() + "\n");
        
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.substring(i, i + 1) + "\n");

        }
    }
    

    public static void concatenar() {

        String nombre = "James";
        String apellido = "Gosling";
        if (nombre.equals("James")) {
            System.out.println(nombre + " " + apellido);
        }
        String completo = nombre.concat(" " + apellido);
        if (nombre.equals("James")) {
            System.out.println(completo);
        }

    }
}
