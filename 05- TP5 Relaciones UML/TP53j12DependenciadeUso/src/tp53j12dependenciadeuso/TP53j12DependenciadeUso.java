
package tp53j12dependenciadeuso;


public class TP53j12DependenciadeUso {

    public static void main(String[] args) {
        // Crear contribuyentes
        Contribuyente cont1 = new Contribuyente("Maria Gonzalez", "27-12345678-9");
        Contribuyente cont2 = new Contribuyente("Carlos Rodriguez", "20-87654321-0");
        
        // Crear impuestos
        Impuesto imp1 = new Impuesto(8500.0, cont1);
        Impuesto imp2 = new Impuesto(12500.0, cont2);
        
        // Crear calculadora
        Calculadora calc = new Calculadora();
        
        // Usar dependencia de uso
        calc.calcular(imp1);
        calc.calcular(imp2);
    }
}
