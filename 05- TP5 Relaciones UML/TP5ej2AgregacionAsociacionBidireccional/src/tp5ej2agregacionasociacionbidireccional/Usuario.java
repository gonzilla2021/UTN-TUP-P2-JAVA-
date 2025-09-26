
package tp5ej2agregacionasociacionbidireccional;

public class Usuario {

    private String nombre;
    private String dni;
    private Celular celular; // Relación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}


