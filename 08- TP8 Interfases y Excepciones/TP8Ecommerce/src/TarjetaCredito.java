public class TarjetaCredito implements PagoConDescuento {
        private String numeroTarjeta;

        public TarjetaCredito(String numeroTarjeta) {
            this.numeroTarjeta = numeroTarjeta;
        }

        @Override
        public double aplicarDescuento(double monto) {
            return monto * 0.9; // 10% de descuento
        }

        @Override
        public boolean procesarPago(double monto) {
            System.out.println("Procesando pago con tarjeta: " + numeroTarjeta);
            System.out.println("Monto con descuento: " + aplicarDescuento(monto));
            return true;
        }
    }


