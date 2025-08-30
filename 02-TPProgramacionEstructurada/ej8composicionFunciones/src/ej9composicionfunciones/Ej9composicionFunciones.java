package ej9composicionfunciones;
/******************************************************************************** 
 * Sistema de cálculo de costos de envío y total de compra para e-commerce
 * 
 * Este programa implementa un sistema modular para calcular:
 * 1. Costo de envío basado en peso y zona geográfica
 * 2. Total de compra sumando producto + envío
 * 
 * Tarifas de envío:
 * - Nacional: $5.00 por kilogramo
 * - Internacional: $10.00 por kilogramo
 * 
 * Arquitectura:
 * - Método calcularCostoEnvio(): Calcula solo el costo de envío
 * - Método calcularTotalCompra(): Suma producto + envío
 * - Composición de funciones: un método usa el resultado del otro

 ********************************************************************************/

import java.util.Scanner;

public class Ej9composicionFunciones {
    
    // ===== CONSTANTES GLOBALES =====
    // Definir tarifas como constantes para facilitar mantenimiento y legibilidad
    
    /** Tarifa de envío nacional: $5.00 por kilogramo */
    public static final double PRECIO_NACIONAL = 5.0;
    
    /** Tarifa de envío internacional: $10.00 por kilogramo */
    public static final double PRECIO_INTERNACIONAL = 10.0;
    
    /**
     * Método principal que controla el flujo del programa
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // ===== PRESENTACIÓN DEL PROGRAMA =====
        System.out.println("=== CALCULADORA DE ENVÍO E-COMMERCE ===");
        System.out.println("Calcule el costo total incluyendo envío\n");
        
        // ===== ENTRADA DE DATOS =====
        
        // Solicitar precio del producto
        System.out.print("Ingrese el precio del producto: $");
        double precioProducto = Double.parseDouble(input.nextLine());
        
        // Solicitar peso del paquete
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(input.nextLine());
        
        // Solicitar zona de envío
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = input.nextLine();
        
        // ===== CÁLCULO DEL COSTO DE ENVÍO =====
        
        // Llamar al método calcularCostoEnvio para obtener el costo
        // Este método retorna -1 si la zona es inválida
        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        // ===== VALIDACIÓN Y CÁLCULO FINAL =====
        
        // Verificar si la zona ingresada es válida
        if (costoEnvio != -1) {
            // Zona válida: proceder con los cálculos
            
            System.out.println("\n=== DESGLOSE DE COSTOS ===");
            System.out.printf("Precio del producto: $%.2f%n", precioProducto);
            System.out.printf("Peso del paquete: %.2f kg%n", peso);
            System.out.printf("Zona de envío: %s%n", zona);
            System.out.printf("Costo de envío: $%.2f%n", costoEnvio);
            
            // ===== COMPOSICIÓN DE FUNCIONES =====
            // Usar el resultado de calcularCostoEnvio() como parámetro 
            // para calcularTotalCompra() - esto es composición de funciones
            double total = calcularTotalCompra(precioProducto, costoEnvio);
            
            // Mostrar resultado final
            System.out.println("-".repeat(35));
            System.out.printf("Total a pagar: $%.2f%n", total);
            
        } else {
            // Zona inválida: mostrar mensaje de error
            System.out.println("\n❌ ERROR: Zona de envío no válida");
            System.out.println("Las zonas válidas son: Nacional o Internacional");
        }
        
        // Cerrar el scanner para liberar recursos del sistema
        input.close();
    }
    
    /**
     * Método para calcular el costo de envío según peso y zona geográfica
     * 
     * Este método implementa la lógica de tarifas diferenciadas:
     * - Envío nacional: más económico ($5/kg)
     * - Envío internacional: más costoso ($10/kg)
     * 
     * @param peso el peso del paquete en kilogramos (debe ser positivo)
     * @param zona la zona de envío ("Nacional" o "Internacional")
     * @return el costo total de envío, o -1 si la zona es inválida
     */
    public static double calcularCostoEnvio(double peso, String zona) {
        
        // Variable para almacenar el costo calculado
        double costo;
        
        // ===== CLASIFICACIÓN POR ZONA =====
        // Usar equalsIgnoreCase() para hacer la comparación insensible a mayúsculas
        
        if (zona.equalsIgnoreCase("Nacional")) {
            // Envío nacional: aplicar tarifa nacional
            costo = PRECIO_NACIONAL * peso;  // $5.00 × kg
            
        } else if (zona.equalsIgnoreCase("Internacional")) {
            // Envío internacional: aplicar tarifa internacional  
            costo = PRECIO_INTERNACIONAL * peso;  // $10.00 × kg
            
        } else {
            // Zona no reconocida: retornar código de error
            // -1 indica que la zona ingresada no es válida
            return -1;
        }
        
        // Retornar el costo calculado
        return costo;
    }
    
    /**
     * Método para calcular el total final de la compra
     * 
     * Este método implementa la composición de funciones sumando:
     * - El precio del producto
     * - El costo de envío (calculado por calcularCostoEnvio)
     * 
     * Fórmula simple: Total = Producto + Envío
     * 
     * @param precioProducto el precio base del producto (sin envío)
     * @param costoEnvio el costo del envío (ya calculado)
     * @return el total final a pagar por el cliente
     */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        
        // Sumar el precio del producto más el costo de envío
        // Esta es la operación final que combina ambos costos
        return precioProducto + costoEnvio;
    }
}
