
package tp5ej6agregacionasociacionunidireccional;

public class Reserva {

    private String fecha;
    private String hora;
    private Cliente cliente; // Asociación unidireccional
    private Mesa mesa;       // Agregación

    public Reserva(String fecha, String hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    @Override
    public String toString() {
        return "Reserva{fecha='" + fecha + "', hora='" + hora + "', cliente=" + cliente
                + ", mesa=" + mesa + "}";
    }
}

