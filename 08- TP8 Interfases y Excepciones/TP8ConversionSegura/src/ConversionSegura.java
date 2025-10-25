import java.util.Scanner;

public class ConversionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        String texto = sc.nextLine();

        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + texto + "' no es un número válido.");
        }

        System.out.println("Programa finalizado correctamente.");
    }
}
