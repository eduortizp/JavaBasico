package app.clase2.mediateca;

   public class Articulo {
        private int codigo;
        private String nombre;
        private int cantCopia;

        public Articulo(int codigo, String nombre, int cantCopia) {
                super();
                this.codigo = codigo;
                this.nombre = nombre;
                this.cantCopia = cantCopia;
        }

        public Articulo(String nombre, int cantCopia) {
                super();
                this.nombre = nombre;
                this.cantCopia = cantCopia;
        }

        public int getCodigo() {
                return codigo;
        }

        public void setCodigo(int codigo) {
                this.codigo = codigo;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public int getCantCopia() {
                return cantCopia;
        }

        public void setCantCopia(int cantCopia) {
                this.cantCopia = cantCopia;
        }

}