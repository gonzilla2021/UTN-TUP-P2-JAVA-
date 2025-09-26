
package tp5ej3agregacionasociacionunidireccional;


public class TP5ej3AgregacionAsociacionUnidireccional {

   
    public static void main(String[] args) {
      
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Editorial Sudamericana", "Buenos Aires, Argentina");

        Libro libro = new Libro("Cien Años de Soledad", "978-84-376-0494-7", autor, editorial);

        // Pruebas
        System.out.println(libro);
        System.out.println("El autor del libro es: " + libro.getAutor().getNombre());
        System.out.println("La editorial del libro es: " + libro.getEditorial().getNombre());
    }
}

