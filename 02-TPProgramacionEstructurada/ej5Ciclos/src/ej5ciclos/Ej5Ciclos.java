package ej5ciclos;

 /******************************************************************************** 
 * Programa para sumar únicamente los números pares ingresados por el usuario
 * 
 * Funcionamiento:
 * - Solicita números al usuario continuamente
 * - Solo suma los números que sean pares (divisibles por 2)
 * - Se detiene cuando el usuario ingresa 0
 * - Muestra la suma total de todos los números pares
 * 
 * Ejemplo de uso:
 * Entrada: 4, 7, 2, 0
 * Números pares encontrados: 4, 2
 * Suma total: 6
 * 
 * @author Gonza
 ********************************************************************************/

import java.util.Scanner;

public class Ej5Ciclos {
    
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Variables para el control del programa
        int num;           // Almacena el número actual ingresado por el usuario
        int sumatoria = 0; // Acumulador para la suma de números pares
        
        // ===== INSTRUCCIONES INICIALES =====
        System.out.println("=== CALCULADORA DE SUMA DE NÚMEROS PARES ===");
        System.out.println("Ingrese números enteros. Solo se sumarán los pares.");
        System.out.println("Para terminar, ingrese 0.\n");
        
        // ===== LECTURA DEL PRIMER NÚMERO =====
        // Se lee el primer número antes del bucle (patrón "read-before-loop")
        System.out.print("Ingrese un número (0 para terminar): ");
        num = Integer.parseInt(input.nextLine());
        
        // ===== BUCLE PRINCIPAL CON WHILE =====
        // El bucle continúa mientras el número ingresado sea diferente de 0
        while (num != 0) {
            
            // Verificar si el número actual es par
            // Un número es par si el residuo de dividirlo por 2 es igual a 0
            if (num % 2 == 0) {
                // Si es par, agregarlo a la sumatoria
                sumatoria += num;
                System.out.println("  ✓ Número par detectado: " + num + " (suma actual: " + sumatoria + ")");
            } else {
                // Si es impar, informar que no se suma
                System.out.println("  ✗ Número impar: " + num + " (no se suma)");
            }
            
            // ===== LECTURA DEL SIGUIENTE NÚMERO =====
            // Solicitar el próximo número dentro del bucle
            // Esta lectura es crucial para evitar un bucle infinito
            System.out.print("Ingrese otro número (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
        }
        
        // ===== MOSTRAR RESULTADO FINAL =====
        System.out.println("\n=== RESULTADO ===");
        System.out.println("La suma de los números pares es: " + sumatoria);
        
        // Mensaje adicional si no se ingresaron números pares
        if (sumatoria == 0) {
            System.out.println("No se ingresaron números pares.");
        }
        
        // Cerrar el scanner para liberar recursos del sistema
        input.close();
    }
}
