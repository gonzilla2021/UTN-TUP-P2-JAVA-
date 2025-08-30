package ej8funciones;

/******************************************************************************** 
 * Programa para calcular el precio final de un producto en e-commerce
 * aplicando impuestos y descuentos
 * 
 * Fórmula utilizada:
 * PrecioFinal = PrecioBase + (PrecioBase × Impuesto) - (PrecioBase × Descuento)
 * 
 * Donde:
 * - PrecioBase: precio original del producto
 * - Impuesto: porcentaje de impuesto (ej: 10 = 10%)
 * - Descuento: porcentaje de descuento (ej: 5 = 5%)
 * 
 * Ejemplo:
 * PrecioBase = 100, Impuesto = 10%, Descuento = 5%
 * PrecioFinal = 100 + (100×0.10) - (100×0.05) = 100 + 10 - 5 = 105
 * 
 * @author Gonzalo
 ********************************************************************************/

import java.util.Scanner;

public class Ej8Funciones {
    
    /**
     * Método principal que controla la ejecución del programa
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // ===== PRESENTACIÓN DEL PROGRAMA =====
        System.out.println("=== CALCULADORA DE PRECIO FINAL E-COMMERCE ===");
        System.out.println("Calcule el precio final aplicando impuestos y descuentos\n");
        
        // ===== ENTRADA DE DATOS =====
        
        // Solicitar el precio base del producto
        System.out.print("Ingrese el precio base del producto: $");
        double precioBase = input.nextDouble();
        
        // Solicitar el porcentaje de impuesto
        // Nota: se ingresa como número entero (10 para 10%)
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = input.nextDouble();
        
        // Solicitar el porcentaje de descuento  
        // Nota: se ingresa como número entero (5 para 5%)
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = input.nextDouble();
        
        // ===== LLAMADA AL MÉTODO DE CÁLCULO =====
        
        // Llamar al método calcularPrecioFinal pasando los tres parámetros
        // El método retorna el precio final calculado
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        
        // ===== MOSTRAR RESULTADOS DETALLADOS =====
        
        System.out.println("\n=== DESGLOSE DE CÁLCULO ===");
        System.out.printf("Precio base: $%.2f%n", precioBase);
        System.out.printf("Impuesto aplicado: %.1f%% = $%.2f%n", impuesto, (precioBase * impuesto / 100));
        System.out.printf("Descuento aplicado: %.1f%% = $%.2f%n", descuento, (precioBase * descuento / 100));
        System.out.println("-".repeat(40));
        System.out.printf("Precio final del producto: $%.2f%n", precioFinal);
        
        // Mostrar el ahorro o costo adicional neto
        double diferencia = precioFinal - precioBase;
        if (diferencia > 0) {
            System.out.printf("Costo adicional: $%.2f%n", diferencia);
        } else if (diferencia < 0) {
            System.out.printf("Ahorro neto: $%.2f%n", Math.abs(diferencia));
        } else {
            System.out.println("Sin cambio en el precio");
        }
        
        // Cerrar el scanner para liberar recursos
        input.close();
    }
    
    /**
     * Método para calcular el precio final de un producto aplicando impuesto y descuento
     * 
     * Este método implementa la fórmula:
     * PrecioFinal = PrecioBase + (PrecioBase × Impuesto/100) - (PrecioBase × Descuento/100)
     * 
     * Proceso de cálculo:
     * 1. Calcular monto del impuesto: precioBase × (impuesto/100)
     * 2. Calcular monto del descuento: precioBase × (descuento/100)  
     * 3. Sumar impuesto y restar descuento al precio base
     * 
     * @param precioBase el precio original del producto (debe ser positivo)
     * @param impuesto el porcentaje de impuesto a aplicar (ej: 10.0 para 10%)
     * @param descuento el porcentaje de descuento a aplicar (ej: 5.0 para 5%)
     * @return el precio final después de aplicar impuesto y descuento
     */
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        
        // Aplicar la fórmula completa en una sola línea
        // División por 100 convierte porcentajes a decimales (10% = 0.10)
        
        // Desglose de la fórmula:
        // precioBase = precio original
        // (precioBase * impuesto / 100) = monto del impuesto
        // (precioBase * descuento / 100) = monto del descuento
        
        return precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        
        /* VERSIÓN DESGLOSADA PARA MEJOR COMPRENSIÓN:
        double montoImpuesto = precioBase * impuesto / 100;
        double montoDescuento = precioBase * descuento / 100;
        double precioConImpuesto = precioBase + montoImpuesto;
        double precioFinal = precioConImpuesto - montoDescuento;
        return precioFinal;
        */
    }
}