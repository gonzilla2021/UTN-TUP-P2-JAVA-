
package ej2elmayor;

import java.util.Scanner;

 /**
 * Programa para determinar el mayor de tres números
 * 
 * Este programa solicita al usuario tres números enteros y determina cuál
 * es el mayor de los tres utilizando un bucle for y comparaciones.
 * 
 * Método utilizado: Comparación iterativa con variable auxiliar
 * @author Gonzalo Castellini
 */



public class Ej2ElMayor {
    
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Inicializar variable para almacenar el número mayor
        // Se usa Integer.MIN_VALUE para asegurar que cualquier número ingresado
        // sea mayor que este valor inicial (-2,147,483,648)
        int max = Integer.MIN_VALUE;
        
        System.out.println("=== PROGRAMA: MAYOR DE TRES NÚMEROS ===");
        
        // Bucle para solicitar exactamente 3 números al usuario
        for (int j = 0; j < 3; j++) {
            
            // Solicitar el número al usuario (j+1 para mostrar "1°", "2°", "3°")
            System.out.print("Ingresa el " + (j + 1) + "° número: ");
            
            // Leer y convertir la entrada del usuario a entero
            int numero = Integer.parseInt(input.nextLine());
            
            // Comparar el número actual con el mayor encontrado hasta ahora
            if (numero > max) {
                // Si el número actual es mayor, actualizamos la variable max
                max = numero;
                System.out.println("  → Nuevo número mayor: " + max);
            } else {
                // Si no es mayor, informamos que se mantiene el actual
                System.out.println("  → El mayor sigue siendo: " + max);
            }
        }
        
        // Mostrar el resultado final
        System.out.println("\n=== RESULTADO ===");
        System.out.println("El mayor de los tres números es: " + max);
        
        // Cerrar el scanner para liberar recursos del sistema
        input.close();
    }
}