
public class TP5ej10ComposicionAsociacionBidireccional {


    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "2025-09-26");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890", 15000.50, clave);
        Titular titular = new Titular("Juan Pérez", "30111222");

        cuenta.setTitular(titular); // enlazar bidireccionalmente

        System.out.println(cuenta);
    }
}

