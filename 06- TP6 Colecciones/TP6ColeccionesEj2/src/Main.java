// Ejercicio: Universidad, Profesor y Curso (bidireccional 1 a N)

public class Main {
    public static void main(String[] args) {
        Universidad utn = new Universidad("UTN");

        Profesor p1 = new Profesor("P01", "Juan Pérez", "Programación");
        Profesor p2 = new Profesor("P02", "María Gómez", "Matemática");
        Profesor p3 = new Profesor("P03", "Luis Torres", "Base de Datos");

        Curso c1 = new Curso("C101", "Algoritmos I");
        Curso c2 = new Curso("C102", "Programación II");
        Curso c3 = new Curso("C103", "Análisis Matemático I");
        Curso c4 = new Curso("C104", "Base de Datos I");
        Curso c5 = new Curso("C105", "Sistemas Operativos");

        utn.agregarProfesor(p1);
        utn.agregarProfesor(p2);
        utn.agregarProfesor(p3);

        utn.agregarCurso(c1);
        utn.agregarCurso(c2);
        utn.agregarCurso(c3);
        utn.agregarCurso(c4);
        utn.agregarCurso(c5);

        // Asignaciones
        utn.asignarProfesorACurso("C101", "P01");
        utn.asignarProfesorACurso("C102", "P01");
        utn.asignarProfesorACurso("C103", "P02");
        utn.asignarProfesorACurso("C104", "P03");
        utn.asignarProfesorACurso("C105", "P03");

        // Listados
        utn.listarCursos();
        System.out.println();
        utn.listarProfesores();

        // Cambiar profesor de un curso
        System.out.println("\n--- Cambio de profesor ---");
        utn.asignarProfesorACurso("C101", "P02");

        // Eliminar un curso
        System.out.println("\n--- Eliminando curso C105 ---");
        utn.eliminarCurso("C105");

        // Eliminar un profesor
        System.out.println("\n--- Eliminando profesor P03 ---");
        utn.eliminarProfesor("P03");

        // Reporte final
        System.out.println();
        utn.reporteCursosPorProfesor();
    }
}
