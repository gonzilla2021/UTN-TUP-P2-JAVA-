
package ejercicio12array;
/*
 * 12. Modificación de un array de precios y visualización de resultados
 * - Declarar array con precios
 * - Mostrar precios originales
 * - Modificar un precio específico
 * - Mostrar precios modificados
 */
public class Ejercicio12Array {
    
    public static void main(String[] args) {
        
        // a. Declarar e inicializar array con precios de productos
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Mostrar valores originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios);
        
        // c. Modificar el precio de un producto específico (índice 2)
        precios[2] = 129.99; // Cambiar 149.75 por 129.99
        
        // d. Mostrar valores modificados
        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios);
    }
    
    /**
     * Método para mostrar todos los precios del array
     * @param arrayPrecios - array con los precios a mostrar
     */
    public static void mostrarPrecios(double[] arrayPrecios) {
        // Recorrer array con for-each para mostrar valores
        for (double precio : arrayPrecios) {
            System.out.println("Precio: $" + precio);
        }
    }
}   
    
  