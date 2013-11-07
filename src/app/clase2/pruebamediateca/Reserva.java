package app.clase2.pruebamediateca;

import java.util.ArrayList;

public class Reserva {
        private int numReserva;
        private String fecha;
        private Socio socio;
        private ArrayList<Copia> copia;

        public Reserva(int numReserva, String fecha, Socio socio,
                        ArrayList<Copia> copia) {
                super();
                this.numReserva = numReserva;
                this.fecha = fecha;
                this.socio = socio;
                this.copia = copia;
        }

        public Reserva(String fecha, Socio socio, ArrayList<Copia> copia) {
                super();
                this.fecha = fecha;
                this.socio = socio;
                this.copia = copia;
        }

        public int getNumReserva() {
                return numReserva;
        }

        public void setNumReserva(int numReserva) {
                this.numReserva = numReserva;
        }

        public String getFecha() {
                return fecha;
        }

        public void setFecha(String fecha) {
                this.fecha = fecha;
        }

        public Socio getSocio() {
                return socio;
        }

        public void setSocio(Socio socio) {
                this.socio = socio;
        }

        public ArrayList<Copia> getcopia() {
                return copia;
        }

        public void setcopia(ArrayList<Copia> copia) {
                this.copia = copia;
        }

}