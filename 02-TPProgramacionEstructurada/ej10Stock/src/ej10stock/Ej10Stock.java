package ej10stock;
/******************************************************************************** 
 * Sistema de Gestión de Stock para control de inventario
 * 
 * Este programa simula las operaciones básicas de un sistema de inventario:
 * - Ventas: reducen el stock disponible
 * - Recepciones: aumentan el stock disponible
 * - Cálculo automático: actualiza el stock final
 * 
 * Fórmula utilizada:
 * NuevoStock = StockActual - CantidadVendida + CantidadRecibida
 * 
 * Ejemplo de funcionamiento:
 * Stock inicial: 50 unidades
 * Ventas: 20 unidades (reducen stock)
 * Recepciones: 30 unidades (aumentan stock)  
 * Stock final: 50 - 20 + 30 = 60 unidades
 * 
 * Características:
 * - Validación de entradas negativas
 * - Protección contra stock negativo
 * - Arquitectura modular con métodos separados

 ********************************************************************************/

import java.util.Scanner;

public class Ej10Stock {
    
    /**
     * Método principal que controla la interfaz de usuario y validaciones
     * 
     * @param args argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // ===== PRESENTACIÓN DEL SISTEMA =====
        System.out.println("=== SISTEMA DE GESTIÓN DE STOCK ===");
        System.out.println("Actualice el inventario registrando ventas y recepciones\n");
        
        // ===== ENTRADA DE DATOS =====
        
        // Solicitar stock actual del producto
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(input.nextLine());
        
        // Solicitar cantidad vendida (salida de stock)
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(input.nextLine());
        
        // Solicitar cantidad recibida (entrada de stock)
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(input.nextLine());
        
        // ===== VALIDACIÓN DE ENTRADAS =====
        
        // Verificar que todos los valores sean no negativos
        // En un sistema real, las cantidades negativas no tienen sentido
        if (stockActual < 0 || cantidadVendida < 0 || cantidadRecibida < 0) {
            // Error: mostrar mensaje y terminar programa
            System.out.println("\n❌ ERROR: Los números no pueden ser negativos");
            System.out.println("   - Stock actual: debe ser ≥ 0");
            System.out.println("   - Cantidad vendida: debe ser ≥ 0");  
            System.out.println("   - Cantidad recibida: debe ser ≥ 0");
            
        } else {
            // ===== CÁLCULO DEL NUEVO STOCK =====
            
            // Llamar al método actualizarStock para calcular el nuevo inventario
            // Este método encapsula la lógica de cálculo y validación
            int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
            
            // ===== MOSTRAR RESULTADOS DETALLADOS =====
            
            System.out.println("\n=== MOVIMIENTOS DE STOCK ===");
            System.out.println("Stock inicial: " + stockActual + " unidades");
            System.out.println("(-) Cantidad vendida: " + cantidadVendida + " unidades");
            System.out.println("(+) Cantidad recibida: " + cantidadRecibida + " unidades");
            System.out.println("-".repeat(40));
            System.out.println("Stock final: " + nuevoStock + " unidades");
            
            // Análisis del resultado
            int diferencia = nuevoStock - stockActual;
            if (diferencia > 0) {
                System.out.println("✅ Stock aumentó en: " + diferencia + " unidades");
            } else if (diferencia < 0) {
                System.out.println("📉 Stock disminuyó en: " + Math.abs(diferencia) + " unidades");
            } else {
                System.out.println("➡️ Stock se mantiene igual");
            }
            
            // Alerta de stock bajo
            if (nuevoStock <= 5 && nuevoStock > 0) {
                System.out.println("⚠️ ALERTA: Stock bajo - considere reabastecer");
            } else if (nuevoStock == 0) {
                System.out.println("🚫 CRÍTICO: Producto agotado - reabastecimiento urgente");
            }
        }
        
        // Cerrar el scanner para liberar recursos del sistema
        input.close();
    }
    
    /**
     * Método para actualizar el stock después de operaciones de venta y recepción
     * 
     * Este método implementa la lógica central del sistema de inventario:
     * 
     * Proceso de cálculo:
     * 1. Partir del stock actual
     * 2. Restar las unidades vendidas (salida del inventario)
     * 3. Sumar las unidades recibidas (entrada al inventario)
     * 4. Aplicar protección contra stock negativo
     * 
     * Fórmula: NuevoStock = StockActual - CantidadVendida + CantidadRecibida
     * 
     * Protección implementada:
     * - Si el cálculo resulta en stock negativo, se establece en 0
     * - Esto evita tener inventarios "imposibles" en el sistema
     * 
     * @param stockActual el stock disponible antes de la operación
     * @param cantidadVendida cuántas unidades se vendieron (salida)
     * @param cantidadRecibida cuántas unidades se recibieron (entrada)
     * @return el nuevo stock después de aplicar ambas operaciones
     */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        
        // ===== APLICAR FÓRMULA DE ACTUALIZACIÓN =====
        
        // Calcular el nuevo stock usando la fórmula estándar
        // stockActual: punto de partida
        // -cantidadVendida: reduce el stock (operación de salida)
        // +cantidadRecibida: aumenta el stock (operación de entrada)
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        
        // ===== PROTECCIÓN CONTRA STOCK NEGATIVO =====
        
        // En un sistema real, el stock no puede ser negativo
        // Si el cálculo da negativo, establecer en 0 (stock agotado)
        if (nuevoStock < 0) {
            System.out.println("⚠️ Advertencia: La venta excede el stock disponible.");
            System.out.println("   Stock calculado: " + nuevoStock + " → Ajustado a: 0");
            nuevoStock = 0;  // Establecer stock mínimo en 0
        }
        
        // Retornar el stock final calculado y validado
        return nuevoStock;
    }
}