package app.clase4.cajero;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException(double saldo, double cuantoDesea) {
        super("En su cuenta tiene " + saldo + " soles. No puede prestarse " + cuantoDesea + " soles.");
        System.out.println("SALDO INSUFICIENTE EXCEPTION");
    }
}