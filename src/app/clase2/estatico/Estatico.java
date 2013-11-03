
package app.clase2.estatico;


public class Estatico {
    
    static int contador;
    
    public Estatico(){
    
    ++contador;
    
    }
    
    public static double dolaraEuro(double a) {
    double euro = a * 0.81559;
    return euro;
    
}    
}
