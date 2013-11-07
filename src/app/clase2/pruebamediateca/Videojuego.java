package app.clase2.pruebamediateca;

public class Videojuego {
        private int id;
        private String titulo;
        private String tematica;
        private String argumento;
        private int precio;
        private Plataforma plataforma;

        public Videojuego(int id, String titulo, String tematica, String argumento,
                        int precio, Plataforma plataforma) {
                super();
                this.id = id;
                this.titulo = titulo;
                this.tematica = tematica;
                this.argumento = argumento;
                this.precio = precio;
                this.plataforma = plataforma;
        }

        public Videojuego(String titulo, String tematica, String argumento,
                        int precio, Plataforma plataforma) {
                super();
                this.titulo = titulo;
                this.tematica = tematica;
                this.argumento = argumento;
                this.precio = precio;
                this.plataforma = plataforma;
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getTitulo() {
                return titulo;
        }

        public void setTitulo(String titulo) {
                this.titulo = titulo;
        }

        public String getTematica() {
                return tematica;
        }

        public void setTematica(String tematica) {
                this.tematica = tematica;
        }

        public String getArgumento() {
                return argumento;
        }

        public void setArgumento(String argumento) {
                this.argumento = argumento;
        }

        public int getPrecio() {
                return precio;
        }

        public void setPrecio(int precio) {
                this.precio = precio;
        }

        public Plataforma getPlataforma() {
                return plataforma;
        }

        public void setPlataforma(Plataforma plataforma) {
                this.plataforma = plataforma;
        }

}