
package tp5ej4asociacionbidireccionalagregacion;


public class TarjetaDeCredito {

    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco;     // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
        cliente.setTarjeta(this); // asegura la relación bidireccional
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{numero='" + numero + "', fechaVencimiento=" + fechaVencimiento +
               ", cliente=" + cliente + ", banco=" + banco + "}";
    }
}

