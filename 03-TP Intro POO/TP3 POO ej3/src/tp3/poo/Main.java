
package tp3.poo;
/*3. Encapsulamiento con la Clase Libro 
a. Crear una clase Libro con atributos privados: titulo, autor, 
añoPublicacion. 
Métodos requeridos: Getters para todos los atributos. Setter con validación 
para añoPublicacion. 
Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con 
uno válido, mostrar la información final.*/

public class Main {

    public static void main(String[] args) {
        Libro miLibro = new Libro();
                
        // Seteo inicial
        miLibro.setTitulo("El Angel Gris");
        miLibro.setAutor("Alejandro Dolina");

        // Intento con año inválido
        miLibro.setAnioPublicacion(-100); // debería mostrar mensaje de error

        // Intento con año válido
        miLibro.setAnioPublicacion(1988);

        // Mostrar información final
        System.out.println("Información del libro:");
        System.out.println("Título: " + miLibro.getTitulo());
        System.out.println("Autor: " + miLibro.getAutor());
        System.out.println("Año de publicación: " + miLibro.getAnioPublicacion());
        
    }
    
}
