
package ej4descuentos;

/******************************************************************************** 
 * Calculadora de Descuento según categoría
 * 
 * Este programa calcula descuentos basados en la categoría del producto:
 * - Categoría A: 10% de descuento (precio final = precio * 0.90)
 * - Categoría B: 15% de descuento (precio final = precio * 0.85)  
 * - Categoría C: 20% de descuento (precio final = precio * 0.80)
 * 
 * El programa muestra: precio original, descuento aplicado y precio final
 * 
 * @author Gonza
 ********************************************************************************/

import java.util.Scanner;

public class Ej4Descuentos {
    
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Declarar variables para almacenar los datos del producto
        double precio;              // Precio original del producto
        char categoria;             // Categoría del producto (A, B o C)
        double precioFinal = 0;     // Precio después de aplicar descuento
        double montoDescuento = 0;  // Cantidad de dinero descontada
        int porcentajeDescuento = 0; // Porcentaje de descuento aplicado
        
        // ===== ENTRADA DE DATOS =====
        
        // Solicitar la categoría del producto
        System.out.print("Ingrese la categoría (A, B o C): ");
        // Leer entrada, convertir a mayúscula y tomar el primer caracter
        categoria = input.nextLine().toUpperCase().charAt(0);
        
        // Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: $");
        // Leer y convertir la entrada a número decimal
        precio = Double.parseDouble(input.nextLine());
        
        // ===== VALIDACIÓN Y CÁLCULO DE DESCUENTOS =====
        
        // Estructura condicional para determinar descuento según categoría
        
        if (categoria == 'A') {
            // Categoría A: 10% de descuento
            porcentajeDescuento = 10;
            precioFinal = precio * 0.90;  // Aplicar descuento (mantener 90%)
            montoDescuento = precio * 0.10; // Calcular monto descontado
            
        } else if (categoria == 'B') {
            // Categoría B: 15% de descuento  
            porcentajeDescuento = 15;
            precioFinal = precio * 0.85;  // Aplicar descuento (mantener 85%)
            montoDescuento = precio * 0.15; // Calcular monto descontado
            
        } else if (categoria == 'C') {
            // Categoría C: 20% de descuento
            porcentajeDescuento = 20;
            precioFinal = precio * 0.80;  // Aplicar descuento (mantener 80%)
            montoDescuento = precio * 0.20; // Calcular monto descontado
            
        } else {
            // Categoría inválida: no existe descuento para esta categoría
            System.out.println("\n❌ ERROR: Categoría '" + categoria + "' no válida.");
            System.out.println("Las categorías válidas son: A, B, C");
            input.close(); // Cerrar scanner antes de salir
            return; // Terminar el programa si la categoría es inválida
        }
        
        // ===== MOSTRAR RESULTADOS =====
        
        System.out.println("\n=== RESUMEN DE COMPRA ===");
        System.out.println("Categoría aplicada: " + categoria);
        System.out.printf("Precio original: $%.2f%n", precio);
        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.printf("Monto del descuento: $%.2f%n", montoDescuento);
        System.out.printf("Precio final: $%.2f%n", precioFinal);
        System.out.printf("Ahorro total: $%.2f%n", montoDescuento);
        
        // Cerrar el scanner para liberar recursos del sistema
        input.close();
    }
}