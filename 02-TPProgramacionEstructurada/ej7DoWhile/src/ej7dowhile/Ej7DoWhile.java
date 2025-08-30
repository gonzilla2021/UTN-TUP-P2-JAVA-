
package ej7dowhile;
/******************************************************************************** 
 * Programa de validación de notas usando bucle do-while
 * 
 * Este programa solicita una nota al usuario y valida que esté en el rango
 * válido de 0 a 10. Si la nota está fuera del rango, repite la solicitud
 * hasta que el usuario ingrese un valor correcto.
 * 
 * Ventaja del do-while:
 * - Garantiza que se ejecute al menos una vez la solicitud
 * - Perfecto para validaciones donde necesitamos repetir hasta obtener 
 *   una entrada válida
 * 
 * Rango válido: 0 ≤ nota ≤ 10
 * 
 * @author Gonzalo
 ********************************************************************************/

import java.util.Scanner;

public class Ej7DoWhile {
    
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Variable para almacenar la nota ingresada
        int nota;
        
        // ===== PRESENTACIÓN DEL PROGRAMA =====
        System.out.println("=== VALIDADOR DE NOTAS ===");
        System.out.println("Ingrese una nota válida entre 0 y 10 (inclusive)\n");
        
        // ===== BUCLE DO-WHILE PARA VALIDACIÓN =====
        // El bucle do-while es ideal para validaciones porque:
        // 1. Siempre ejecuta el bloque al menos una vez
        // 2. Evalúa la condición al final, después de cada intento
        
        do {
            // Solicitar la nota al usuario
            System.out.print("Ingrese una nota (0-10): ");
            
            // Leer y convertir la entrada del usuario a entero
            nota = Integer.parseInt(input.nextLine());
            
            // ===== VALIDACIÓN DEL RANGO =====
            // Verificar si la nota está fuera del rango válido
            // Condición: nota < 0 OR nota > 10
            if (nota < 0 || nota > 10) {
                // Nota inválida: mostrar mensaje de error específico
                System.out.println(" Error: Nota inválida.");
                
                // Dar feedback específico según el tipo de error
                if (nota < 0) {
                    System.out.println("La nota no puede ser negativa.");
                } else {
                    System.out.println("La nota no puede ser mayor a 10.");
                }
                
                System.out.println("Ingrese una nota entre 0 y 10.\n");
                
            } else {
                // Nota válida: mostrar confirmación
                System.out.println("Nota válida ingresada: " + nota);
            }
            
        } while (nota < 0 || nota > 10); 
        // CONDICIÓN DE REPETICIÓN:
        // El bucle continúa mientras la nota esté fuera del rango válido
        // Se detiene cuando: nota >= 0 AND nota <= 10
        
        // ===== CONFIRMACIÓN FINAL =====
        System.out.println("\n=== PROCESO COMPLETADO ===");
        System.out.println("Nota guardada correctamente: " + nota);
        
        // Mostrar clasificación adicional de la nota
        if (nota >= 7) {
            System.out.println("Clasificación: Aprobado");
        } else if (nota >= 4) {
            System.out.println("Clasificación: Regular");
        } else {
            System.out.println("Clasificación: Reprobado");
        }
        
        // Cerrar el scanner para liberar recursos del sistema
        input.close();
    }
}