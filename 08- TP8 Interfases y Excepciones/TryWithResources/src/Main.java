import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // El archivo se declara dentro del paréntesis
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        // No hace falta close(): Java lo cierra automáticamente
    }
}


