package app.clase2.mediateca;

public class Socio extends Cliente {
        private int numSocio;
        private String domicilio;
        
        

        public Socio(int idCliente, String nombre, String apellido, int dni,
                        int numerSocio, String domicilio) {
                super(idCliente, nombre, apellido, dni);
                this.numSocio = numerSocio;
                this.domicilio = domicilio;
        }

        public Socio(String nombre, String apellido, int dni, int numerSocio,
                        String domicilio) {
                super(nombre, apellido, dni);
                this.numSocio = numerSocio;
                this.domicilio = domicilio;
        }

        public int getNumerSocio() {
                return numSocio;
        }

        public void setNumerSocio(int numerSocio) {
                this.numSocio = numerSocio;
        }

        public String getDomicilio() {
                return domicilio;
        }

        public void setDomicilio(String domicilio) {
                this.domicilio = domicilio;
        }

}
