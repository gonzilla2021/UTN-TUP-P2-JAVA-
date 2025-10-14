import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    // Getters
    public String getNombre() { return nombre; }
    public List<Profesor> getProfesores() { return profesores; }
    public List<Curso> getCursos() { return cursos; }

    // Altas
    public void agregarProfesor(Profesor p) {
        if (!profesores.contains(p)) profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (!cursos.contains(c)) cursos.add(c);
    }

    // Búsquedas
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    // Asignar profesor a curso
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        if (c == null) throw new IllegalArgumentException("Curso no encontrado: " + codigoCurso);

        Profesor p = buscarProfesorPorId(idProfesor);
        if (p == null) throw new IllegalArgumentException("Profesor no encontrado: " + idProfesor);

        c.setProfesor(p); // sincroniza ambos lados
    }

    // Eliminar curso
    public void eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c == null) throw new IllegalArgumentException("Curso no encontrado: " + codigo);
        if (c.getProfesor() != null) c.setProfesor(null);
        cursos.remove(c);
    }

    // Eliminar profesor
    public void eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p == null) throw new IllegalArgumentException("Profesor no encontrado: " + id);
        for (Curso c : new ArrayList<>(p.getCursos())) {
            c.setProfesor(null);
        }
        profesores.remove(p);
    }

    // Listados
    public void listarCursos() {
        System.out.println("=== Cursos ===");
        for (Curso c : cursos) {
            String prof = (c.getProfesor() != null) ? c.getProfesor().getNombre() : "no asignado";
            System.out.println(c.getCodigo() + " - " + c.getNombre() + " | Profesor: " + prof);
        }
    }

    public void listarProfesores() {
        System.out.println("=== Profesores ===");
        for (Profesor p : profesores) {
            System.out.print(p.getId() + " - " + p.getNombre() + " | Cursos: ");
            if (p.getCursos().isEmpty()) {
                System.out.println("(ninguno)");
            } else {
                StringBuilder sb = new StringBuilder();
                for (Curso c : p.getCursos()) {
                    if (sb.length() > 0) sb.append(", ");
                    sb.append(c.getCodigo());
                }
                System.out.println(sb.toString());
            }
        }
    }

    // Reporte cantidad de cursos por profesor
    public void reporteCursosPorProfesor() {
        System.out.println("\n=== Reporte: cantidad de cursos por profesor ===");
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " curso(s)");
        }
    }
}
