
package tp5ej4asociacionbidireccionalagregacion;


public class TP5ej4AsociacionBidireccionalAgregacion {

    public static void main(String[] args) {

        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("Ana Torres", "45678901X");

        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "27/09/2025", cliente, banco);

        // Pruebas
        System.out.println(tarjeta);
        System.out.println("El cliente también conoce su tarjeta: " + cliente.getTarjeta().getNumero());
        System.out.println("La tarjeta pertenece al banco: " + tarjeta.getBanco().getNombre());
    }
}

