import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; //Lista de cursos que dicta

    //Constructor
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;

        this.especialidad = especialidad;
        this.cursos = new ArrayList<>(); //Lista Vacia
    }
    //GETTERS


    public String getId() {return id;}

    public String getNombre() {return nombre;}

    public String getEspecialidad() {return especialidad;}

    public List<Curso> getCursos() {return cursos;}


    // METODO MOSTRAR INFO
    public void mostrarInfo(){
        System.out.println("Profesor: " + nombre + " | Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }

    //cuando se asigne un profesor a un curso, se actualizan ambos lados de la relación.
    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) {     // evita duplicados
            cursos.add(c);             // agrega a la lista
            c.setProfesor(this);       // sincroniza el otro lado
        }
    }

    //Quitar el curso de la lista del profesor.
    //si no le pusiéramos null, el curso seguiría creyendo que tiene un profesor asignado, aunque ese profesor ya no lo tiene en su lista
    public void eliminarCurso(Curso c) {
        if (cursos.contains(c)) {       // solo si está en la lista
            cursos.remove(c);           // lo quita
            c.setProfesor(null);        // deja al curso sin profesor
        }
    }






}
