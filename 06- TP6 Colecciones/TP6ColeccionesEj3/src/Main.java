public class Main {
    public static void main(String[] args) {
        // 1 Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        // 2 Crear algunos autores
        Autor autor1 = new Autor("A1", "Gabriel García Márquez", "Colombia");
        Autor autor2 = new Autor("A2", "Julio Cortázar", "Argentina");
        Autor autor3 = new Autor("A3", "Isabel Allende", "Chile");

        // 3 Agregar libros a la biblioteca
        biblioteca.agregarLibro("ISBN001", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("ISBN002", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("ISBN003", "Rayuela", 1963, autor2);
        biblioteca.agregarLibro("ISBN004", "Bestiario", 1951, autor2);
        biblioteca.agregarLibro("ISBN005", "La casa de los espíritus", 1982, autor3);

        // 4 Listar todos los libros
        System.out.println(" LISTA DE LIBROS EN LA BIBLIOTECA:");
        biblioteca.listarLibros();

        // 5 Buscar un libro por ISBN
        System.out.println("\n BUSCAR LIBRO POR ISBN:");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("ISBN003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró el libro.");
        }

        // 6 Filtrar libros por año
        System.out.println("\n LIBROS PUBLICADOS EN 1963:");
        biblioteca.filtrarLibrosPorAnio(1963);

        // 7 Eliminar un libro
        System.out.println("\n️ ELIMINANDO LIBRO ISBN002...");
        biblioteca.eliminarLibro("ISBN002");
        System.out.println("LIBROS RESTANTES:");
        biblioteca.listarLibros();

        // 8 Mostrar cantidad total de libros
        System.out.println("\n Total de libros: " + biblioteca.obtenerCantidadLibros());

        // 9 Listar autores disponibles
        System.out.println("\n AUTORES DISPONIBLES:");
        biblioteca.mostrarAutoresDisponibles();
    }
}
