public class Main {
    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente("Gonzalo Castellini", "gonzalo@mail.com");

        // Crear productos
        Producto p1 = new Producto("Notebook Lenovo", 1200.0);
        Producto p2 = new Producto("Mouse inalámbrico", 300.0);

        // Crear pedido y agregar productos
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        // Calcular total
        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + total);

        // Procesar pago con Tarjeta de Crédito
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        boolean pagoExitoso = tarjeta.procesarPago(total);

        // Si el pago fue exitoso, cambiar estado del pedido
        if (pagoExitoso) {
            pedido.cambiarEstado("ENVIADO");
        }

        // Simular otro método de pago (PayPal)
        PayPal paypal = new PayPal("cliente@paypal.com");
        paypal.procesarPago(500.0);
    }
}
