package app.clase4.cajero;

public class Cajero {
    
    public static void main(String[] args) {
        
        try{
        
        Cuenta cuentaJose = new Cuenta ("Jose", 5000);
        
        System.out.println("SALDO: " + cuentaJose.retirarCajero(3000));
        System.out.println("SALDO: " + cuentaJose.retirarCajero(3000));

    }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
    }
    
}
}