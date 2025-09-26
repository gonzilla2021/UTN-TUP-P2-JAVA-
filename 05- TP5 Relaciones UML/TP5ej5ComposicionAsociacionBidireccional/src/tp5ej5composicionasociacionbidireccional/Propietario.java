
package tp5ej5composicionasociacionbidireccional;


public class Propietario {

    private String nombre;
    private String dni;
    private Computadora computadora; // Relación bidireccional

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    @Override
    public String toString() {
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}


