package app.clase2.pruebamediateca;

public class Cliente {
        private int idCliente;
        private String nombre;
        private String apellido;
        private int dni;
        
        

        public Cliente(int idCliente, String nombre, String apellido, int dni) {
                super();
                this.idCliente = idCliente;
                this.nombre = nombre;
                this.apellido = apellido;
                this.dni = dni;
        }

        public Cliente(String nombre, String apellido, int dni) {
                super();
                this.nombre = nombre;
                this.apellido = apellido;
                this.dni = dni;
        }

        public int getIdCliente() {
                return idCliente;
        }

        public void setIdCliente(int idCliente) {
                this.idCliente = idCliente;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getApellido() {
                return apellido;
        }

        public void setApellido(String apellido) {
                this.apellido = apellido;
        }

        public int getDni() {
                return dni;
        }

        public void setDni(int dni) {
                this.dni = dni;
        }

}