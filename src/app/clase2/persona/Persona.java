package app.clase2.persona;

public class Persona {

    public String nombres;
    public String apellidos;
    public int edad;

    public Persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.printNombreCompleto();
    }
    
    public Persona(){}
    
    
    public void setNombresApellidos(String nombres, String apellidos){
        
    }
    
    public void printNombreCompleto(){
        System.out.println(nombres+" "+apellidos);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
