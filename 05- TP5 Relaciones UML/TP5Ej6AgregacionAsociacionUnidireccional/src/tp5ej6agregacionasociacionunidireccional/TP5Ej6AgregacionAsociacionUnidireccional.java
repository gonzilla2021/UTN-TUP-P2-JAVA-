
package tp5ej6agregacionasociacionunidireccional;


public class TP5Ej6AgregacionAsociacionUnidireccional {

 
    public static void main(String[] args) {
       
        Cliente cliente = new Cliente("Lucía Fernández", "1122334455");
        Mesa mesa = new Mesa(12, 4);

        Reserva reserva = new Reserva("2025-10-01", "21:00", cliente, mesa);

        // Pruebas
        System.out.println(reserva);
        System.out.println("El cliente de la reserva es: " + reserva.getCliente().getNombre());
        System.out.println("La mesa reservada es la número: " + reserva.getMesa().getNumero());
    }
}

