package app.clase2.pruebamediateca;

public class Copia {
        private int numCopia;
        private Articulo articulo;

        public Copia(Articulo articulo) {
                super();
                this.articulo = articulo;
        }

        public Copia(int numCopia, Articulo articulo) {
                super();
                this.numCopia = numCopia;
                this.articulo = articulo;
        }

        public int getNumCopia() {
                return numCopia;
        }

        public void setNumCopia(int numCopia) {
                this.numCopia = numCopia;
        }

        public Articulo getArticulo() {
                return articulo;
        }

        public void setArticulo(Articulo articulo) {
                this.articulo = articulo;
        }

}