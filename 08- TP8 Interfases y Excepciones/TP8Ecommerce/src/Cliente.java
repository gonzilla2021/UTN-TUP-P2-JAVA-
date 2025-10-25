public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.println("Estimado " + nombre +
                ", su pedido cambió de estado a: " + nuevoEstado);
    }
}
