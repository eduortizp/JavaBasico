package app.clase2.mediateca;

public class Categoria {
    
    private int id;
    private String nombre;

    public Categoria(int id, String nombre) {
          super();
          this.id = id;
          this.nombre = nombre;
        }

    public Categoria(String nombre) {
          super();
          this.nombre = nombre;
        }

    public int getId() {
          return id;
        }

    public void setId(int id) {
          this.id = id;
        }

    public String getNombre() {
          return nombre;
        }

    public void setNombre(String nombre) {
          this.nombre = nombre;
        }

}
