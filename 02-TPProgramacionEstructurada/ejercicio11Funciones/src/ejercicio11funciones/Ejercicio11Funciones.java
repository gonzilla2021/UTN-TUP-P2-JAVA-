package ejercicio11funciones;
import java.util.Scanner;

/*
 * 11. Cálculo de descuento especial usando variable global.
 * Declara una variable global descuento = 0.10 (10%)
 * Crea un método que calcule el descuento y muestre el precio final
 */
public class Ejercicio11Funciones {
    
    // Variable global - descuento fijo del 10%
    public static double descuento = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Solicitar precio al usuario
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(input.nextLine());
        
        // Llamar al método que calcula el descuento
        calcularDescuentoEspecial(precio);
        
        input.close();
    }
    
    /**
     * Método que calcula y muestra el descuento especial
     * @param precio - precio original del producto
     */
    public static void calcularDescuentoEspecial(double precio) {
        // Variable local - cantidad de dinero descontada
        double descuentoAplicado = precio * descuento;
        
        // Calcular precio final
        double precioFinal = precio - descuentoAplicado;
        
        // Mostrar resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}