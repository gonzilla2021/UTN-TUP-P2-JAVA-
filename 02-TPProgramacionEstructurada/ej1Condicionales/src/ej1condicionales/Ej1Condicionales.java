package ej1condicionales;

import java.util.Scanner;

/**
 * Programa para verificar si un año es bisiesto
 * 
 * Reglas para año bisiesto:
 * - Divisible por 4 Y no divisible por 100, O
 * - Divisible por 400
 * 
 * @author Gonzalo Castellini
 */
public class Ej1Condicionales {
    
    public static void main(String[] args) {
        
        // Crear objeto Scanner para leer entrada del usuario
        Scanner input = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un año
        System.out.print("Ingrese un año: ");
        
        // Leer el año ingresado y convertirlo a entero
        int anio = Integer.parseInt(input.nextLine());
        
        // Mostrar el año ingresado para confirmación
        System.out.println("El año ingresado es: " + anio);
        
        // Verificar si el año es bisiesto usando las reglas:
        // 1. Divisible por 4 Y no divisible por 100 (años como 2004, 2008, etc.)
        // 2. O divisible por 400 (años como 1600, 2000, etc.)
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            // Si cumple las condiciones, es bisiesto
            System.out.println("El año " + anio + " es bisiesto.");
            
        } else {
            // Si no cumple las condiciones, no es bisiesto
            System.out.println("El año " + anio + " NO es bisiesto.");
        }
        
        // Cerrar el scanner para liberar recursos
        input.close();
    }
}  