
package ej6ciclofor;

/******************************************************************************** 
 * Programa contador de números según diferentes criterios
 * 
 * VERSIÓN 1: Contador de Positivos, Negativos y Ceros (según enunciado)
 * VERSIÓN 2: Contador de Pares, Impares y Ceros (tu código actual)
 * 
 * Ambas versiones solicitan números al usuario y los clasifican según
 * diferentes criterios usando bucles for y estructuras condicionales.
 * 
 * @author Gonza
 ********************************************************************************/

import java.util.Scanner;

public class Ej6Ciclofor {
    
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // ===== VERSIÓN 1: POSITIVOS, NEGATIVOS Y CEROS =====
        // (Según el enunciado del problema)
        
        System.out.println("=== CONTADOR DE POSITIVOS, NEGATIVOS Y CEROS ===");
        
        // Contadores para cada categoría de números
        int contPositivos = 0;  // Contador de números mayores a 0
        int contNegativos = 0;  // Contador de números menores a 0  
        int contCeros = 0;      // Contador de números igual a 0
        
        // Bucle for para solicitar exactamente 10 números
        for (int i = 0; i < 10; i++) {
            // Mostrar cuál número se está pidiendo (1°, 2°, etc.)
            System.out.print("Ingrese el " + (i + 1) + "° número: ");
            
            // Leer y convertir la entrada del usuario
            int numero = Integer.parseInt(input.nextLine());
            
            // Clasificar el número según su signo
            if (numero > 0) {
                // Número positivo (mayor que 0)
                contPositivos++;
                System.out.println("  → Positivo detectado");
                
            } else if (numero < 0) {
                // Número negativo (menor que 0)
                contNegativos++;
                System.out.println("  → Negativo detectado");
                
            } else {
                // Número igual a cero
                contCeros++;
                System.out.println("  → Cero detectado");
            }
        }
        
        // Mostrar resultados de la clasificación por signo
        System.out.println("\n=== RESULTADOS (POSITIVOS/NEGATIVOS) ===");
        System.out.println("Números positivos: " + contPositivos);
        System.out.println("Números negativos: " + contNegativos);
        System.out.println("Números ceros: " + contCeros);
        System.out.println("Total de números ingresados: " + (contPositivos + contNegativos + contCeros));
        
        
        // ===== VERSIÓN 2: PARES, IMPARES Y CEROS =====
        // (Tu código actual comentado)
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("=== CONTADOR DE PARES, IMPARES Y CEROS ===");
        
        // Reiniciar contadores para la segunda clasificación
        int contPar = 0;     // Contador de números pares (divisibles por 2)
        int contImpar = 0;   // Contador de números impares (no divisibles por 2)
        contCeros = 0;       // Reiniciar contador de ceros
        
        // Bucle for para solicitar 5 números (como en tu código original)
        for (int i = 0; i < 5; i++) {
            
            // Solicitar número al usuario
            System.out.print("Ingrese el " + (i + 1) + "° número: ");
            int numero = Integer.parseInt(input.nextLine());
            
            // Clasificar el número según paridad
            if (numero == 0) {
                // Caso especial: el cero se cuenta separadamente
                // Nota: matemáticamente 0 es par, pero aquí se maneja aparte
                contCeros++;
                System.out.println("  → Cero detectado");
                
            } else if (numero % 2 != 0) {
                // Número impar: el residuo de dividir por 2 no es cero
                contImpar++;
                System.out.println("  → Impar detectado");
                
            } else {
                // Número par: el residuo de dividir por 2 es cero
                contPar++;
                System.out.println("  → Par detectado");
            }
        }
        
        // Mostrar resultados de la clasificación por paridad
        System.out.println("\n=== RESULTADOS (PARES/IMPARES) ===");
        System.out.println("N° Pares: " + contPar);
        System.out.println("N° Impares: " + contImpar);
        System.out.println("N° Ceros: " + contCeros);
        System.out.println("Total de números ingresados: " + (contPar + contImpar + contCeros));
        
        // Cerrar el scanner para liberar recursos del sistema
        input.close();
    }
}