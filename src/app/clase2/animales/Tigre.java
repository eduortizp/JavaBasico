
package app.clase2.animales;

public class Tigre extends Animal{
    
    public Tigre(String nombre, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("GRRRRRRRRR");
    }

    @Override
    public void comer() {
        System.out.println("Carne");
    }
    
    
    
}
