package practica3.centrosDistribucion;

import java.util.Date;

public class Venta {

    private int codigoVenta;
    private Cliente cliente;
    private Date fechaCompra;
    
    public Venta(int codigoVenta, Cliente cliente, Date fechaCompra) {
        this.codigoVenta = codigoVenta;
        this.cliente = cliente;
        this.fechaCompra = fechaCompra;
    }

    public Cliente getcliente() {
        return cliente;
    }

    public void setcliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getcodigoVenta() {
        return codigoVenta;
    }

    public void setcodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public Date getfechaCompra() {
        return fechaCompra;
    }

    public void setfechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}