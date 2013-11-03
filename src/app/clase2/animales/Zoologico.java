
package app.clase2.animales;

public class Zoologico {
    
    public static void main(String[] args) {
        
        Tigre diego = new Tigre("Diego", 20);
        diego.hacerRuido();
        diego.comer();
        
        Perro fida = new Perro("Fida", 5);
        fida.hacerRuido();
        fida.comer();
        
        Vicuña carla =new Vicuña("Carla", 8);
        carla.hacerRuido();
        carla.comer();
        
    }
    
}
