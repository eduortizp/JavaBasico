package app.clase3.objeto;

public class Socio {

    private int codigo;
    private String nombre;
    private String direccion;

    public Socio(int c, String n, String d) {
        this.codigo = c;
        this.nombre = n;
        this.direccion = d;
    }

    @Override
    public String toString() {
        String cadena;
        cadena = "Codigo : " + this.codigo;
        cadena += "nombre: " + this.nombre;
        cadena += "direccion: " + this.direccion;
        return cadena;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.codigo;
        hash = 29 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 29 * hash + (this.direccion != null ? this.direccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        Socio s = (Socio) o;
        if (this.codigo == s.codigo
                && this.nombre.equals(s.nombre)
                && this.direccion.equals(s.direccion)) {
            return true;
        } else {
            return false;
        }
    }
}

