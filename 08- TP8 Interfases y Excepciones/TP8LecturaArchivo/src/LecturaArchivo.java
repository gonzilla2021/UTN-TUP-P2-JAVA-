import java.io.File;                     // Importa la clase File para manejar archivos
import java.io.FileNotFoundException;    // Importa la excepción que puede lanzarse si el archivo no existe
import java.util.Scanner;                // Importa Scanner para leer el contenido del archivo

public class LecturaArchivo {
    public static void main(String[] args) {
        try {
            // Crea un objeto File que representa el archivo "texto.txt"
            // (debe estar en la misma carpeta del proyecto)
            File archivo = new File("text.txt"); //altero el nombre del archivo asi ejecuta la excepcion

            // Crea un Scanner que leerá el contenido del archivo línea por línea
            Scanner lector = new Scanner(archivo);

            System.out.println("Contenido del archivo:");

            // Mientras haya líneas para leer, las imprime por consola
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            // Cierra el lector para liberar el recurso
            lector.close();

        } catch (FileNotFoundException e) {
            // Se ejecuta si el archivo no existe o no puede abrirse
            System.out.println("Error: el archivo no fue encontrado.");
        }

        // Este mensaje se muestra siempre, haya o no excepción
        System.out.println("Programa finalizado.");
    }
}
