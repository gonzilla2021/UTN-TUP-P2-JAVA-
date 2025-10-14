public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; //refercia al profesor reponsable

    public Curso(String codigo, String nombre ) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null; // no profesor al intanciar la clase
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor nuevoProfesor) {
        if (this.profesor != null) {             // si ya tenía profesor
            this.profesor.getCursos().remove(this); // lo quita de la lista vieja
        }

        this.profesor = nuevoProfesor;           // asigna el nuevo profesor

        if (nuevoProfesor != null) {             // si hay nuevo profesor
            if (!nuevoProfesor.getCursos().contains(this)) {
                nuevoProfesor.getCursos().add(this); // lo agrega a su lista
            }
        }
    }


    // Mostrar info simple
    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: no asignado");
        }
    }


}
