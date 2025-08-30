package ejercicio13recursividad;

/*
 * 13. Impresión recursiva de arrays antes y después de modificar un elemento
 * - Declarar array con precios
 * - Función recursiva para mostrar precios originales
 * - Modificar un precio específico  
 * - Función recursiva para mostrar precios modificados
 */
public class Ejercicio13Recursividad {
    
    public static void main(String[] args) {
        
        // a. Declarar e inicializar array con precios de productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar precios originales usando recursión
        System.out.println("Precios originales:");
        mostrarPreciosRecursivo(precios, 0); // Empezar desde índice 0
        
        // c. Modificar el precio de un producto específico (índice 2)
        precios[2] = 129.99; // Cambiar 149.75 por 129.99
        
        // d. Mostrar precios modificados usando recursión
        System.out.println("\nPrecios modificados:");
        mostrarPreciosRecursivo(precios, 0); // Empezar desde índice 0 otra vez
    }
    
    /**
     * Función recursiva para mostrar todos los precios del array
     * @param precios - array con los precios a mostrar
     * @param indice - posición actual en el array (para la recursión)
     */
    public static void mostrarPreciosRecursivo(double[] precios, int indice) {
        
        // CASO BASE: Si llegamos al final del array, parar la recursión
        if (indice >= precios.length) {
            return; // Salir del método (parar recursión)
        }
        
        // PASO RECURSIVO: Mostrar el precio actual
        System.out.println("Precio: $" + precios[indice]);
        
        // LLAMADA RECURSIVA: Llamarse a sí mismo con el siguiente índice
        mostrarPreciosRecursivo(precios, indice + 1);
    }
    
    /**
     * Versión alternativa con explicación paso a paso
     * (solo para entender mejor cómo funciona)
     */
    public static void mostrarPreciosRecursivoConExplicacion(double[] precios, int indice) {
        System.out.println("Llamada recursiva con índice: " + indice);
        
        // CASO BASE: condición de parada
        if (indice >= precios.length) {
            System.out.println("Fin de la recursión (índice >= longitud del array)");
            return;
        }
        
        // PASO ACTUAL: procesar elemento actual
        System.out.println("Procesando índice " + indice + ": Precio: $" + precios[indice]);
        
        // LLAMADA RECURSIVA: continuar con el siguiente elemento
        System.out.println("Llamando recursión para índice " + (indice + 1));
        mostrarPreciosRecursivoConExplicacion(precios, indice + 1);
        
        System.out.println("Volviendo de la recursión del índice " + indice);
    }
}