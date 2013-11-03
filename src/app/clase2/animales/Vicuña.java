
package app.clase2.animales;

public class Vicuña extends Animal{
    public Vicuña(String nombre, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("ZZZZZZ");
    }

    @Override
    public void comer() {
        System.out.println("Pasto");
    }
    
    
    
}
