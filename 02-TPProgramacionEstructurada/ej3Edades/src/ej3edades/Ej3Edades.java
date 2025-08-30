package ej3edades;

/******************************************************************************** 
 * Programa para clasificar personas según su edad en diferentes categorías
 * 
 * Categorías de edad:
 * - Edad inválida: menor a 0 años
 * - Niño: 0 a 11 años
 * - Adolescente: 12 a 17 años  
 * - Adulto: 18 a 59 años
 * - Adulto Mayor: 60 años en adelante
 * 
 * @author Gonzalo
 ********************************************************************************/

import java.util.Scanner;

public class Ej3Edades {
    
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Solicitar la edad al usuario
        System.out.print("Ingresa tu edad: ");
        
        // Leer y convertir la entrada a número entero
        int edad = Integer.parseInt(input.nextLine());
        
        // ===== VALIDACIÓN Y CLASIFICACIÓN DE EDAD =====
        
        // Primera validación: verificar que la edad sea un número válido
        if (edad < 0) {
            // Caso de error: edad negativa no es válida
            System.out.println("Edad no válida");
            
        } else {
            // Si la edad es válida, proceder con la clasificación
            
            // Estructura de if-else if anidada para clasificar por rangos de edad
            
            if (edad < 12) {
                // Rango de 0 a 11 años: Clasificado como niño
                System.out.println("Niño");
                
            } else if (edad < 18) {
                // Rango de 12 a 17 años: Clasificado como adolescente
                System.out.println("Adolescente");
                
            } else if (edad < 60) {
                // Rango de 18 a 59 años: Clasificado como adulto
                System.out.println("Adulto");
                
            } else {
                // Rango de 60 años en adelante: Clasificado como adulto mayor
                System.out.println("Adulto Mayor");
            }
        }
        
        // Cerrar el scanner para liberar recursos del sistema
        input.close();
    }
}   
