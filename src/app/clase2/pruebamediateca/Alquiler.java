package app.clase2.pruebamediateca;

import java.util.ArrayList;

public class Alquiler {
        private int numAlquiler;
        private String fechaEntrega;
        private double costo;
        private Socio socio;
        private ArrayList<Articulo> articulos;

        public Alquiler(int numAlquiler, String fechaEntrega, double costo,
                        Socio socio, ArrayList<Articulo> articulos) {
                super();
                this.numAlquiler = numAlquiler;
                this.fechaEntrega = fechaEntrega;
                this.costo = costo;
                this.socio = socio;
                this.articulos = articulos;
        }

        public Alquiler(String fechaEntrega, double costo, Socio socio,
                        ArrayList<Articulo> articulos) {
                super();
                this.fechaEntrega = fechaEntrega;
                this.costo = costo;
                this.socio = socio;
                this.articulos = articulos;
        }

        public int getNumAlquiler() {
                return numAlquiler;
        }

        public void setNumAlquiler(int numAlquiler) {
                this.numAlquiler = numAlquiler;
        }

        public String getFechaEntrega() {
                return fechaEntrega;
        }

        public void setFechaEntrega(String fechaEntrega) {
                this.fechaEntrega = fechaEntrega;
        }

        public double getCosto() {
                return costo;
        }

        public void setCosto(double costo) {
                this.costo = costo;
        }

        public Socio getSocio() {
                return socio;
        }

        public void setSocio(Socio socio) {
                this.socio = socio;
        }

        public ArrayList<Articulo> getArticulos() {
                return articulos;
        }

        public void setArticulos(ArrayList<Articulo> articulos) {
                this.articulos = articulos;
        }

}