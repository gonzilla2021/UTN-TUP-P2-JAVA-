
package tp3.poo;
/*1. Registro de Estudiantes 
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, 
calificación. 
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), 
bajarCalificacion(puntos). 
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir 
calificaciones.*/


public class Ej1 {

    public static void main(String[] args) {
        Estudiante alumno = new Estudiante();
        alumno.nombre = "Gonzalo";
        alumno.apellido = "Castellini";
        alumno.curso = "Programacion2";
        alumno.calificacion = 8;
        
        alumno.mostrarInfo();
        alumno.subirCalificacion(2);
        alumno.mostrarInfo();
        alumno.bajarCalificacion(3);
        alumno.mostrarInfo();
        
    }
    
}
