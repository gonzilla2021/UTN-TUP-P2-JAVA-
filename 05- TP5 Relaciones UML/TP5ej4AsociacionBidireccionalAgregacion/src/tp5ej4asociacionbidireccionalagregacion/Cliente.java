
package tp5ej4asociacionbidireccionalagregacion;

public class Cliente {

    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}


