/*
 TAREAS A REALIZAR 
1. Implementar la clase Empleado aplicando todos los puntos anteriores. 
2. Crear una clase de prueba con método main que: 
○ Instancie varios objetos usando ambos constructores. 
○ Aplique los métodos actualizarSalario() sobre distintos 
empleados. 
○ Imprima la información de cada empleado con toString(). 
○ Muestre el total de empleados creados con 
mostrarTotalEmpleados().
 */
package tp4.poo;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===\n");
        
        // Mostrar total inicial
        System.out.println("Total de empleados inicial: " + Empleado.mostrarTotalEmpleados());
        
        System.out.println("\n=== Instancias con el constructor completo ===");
        Empleado colaborador1 = new Empleado(10, "Juan Pérez", "Supervisor", 2000.0);
        System.out.println(colaborador1);
        
        Empleado colaborador2 = new Empleado(11, "María González", "Gerente", 5000.0);
        System.out.println(colaborador2);
        
        System.out.println("\n=== Instancias con el constructor sobrecargado ===");
        Empleado colaborador3 = new Empleado("Carlos López", "Operario");
        System.out.println(colaborador3);
        
        Empleado colaborador4 = new Empleado("Ana Martínez", "Jefe de Área");
        System.out.println(colaborador4);
        
        System.out.println("\n=== Actualizar salario por PORCENTAJE ===");
        System.out.println("ANTES: " + colaborador1);
        colaborador1.actualizarSalario(50); // 50% de aumento
        System.out.println("DESPUÉS (+50%): " + colaborador1);
        
        System.out.println("\n=== Actualizar salario por MONTO FIJO ===");
        System.out.println("ANTES: " + colaborador3);
        colaborador3.actualizarSalario(1500.0); // $1500 de aumento
        System.out.println("DESPUÉS (+$150): " + colaborador3);
        
        System.out.println("\n=== Más pruebas de actualización ===");
        System.out.println("ANTES: " + colaborador2);
        colaborador2.actualizarSalario(1000.0); // Monto fijo
        System.out.println("DESPUÉS (+$1000): " + colaborador2);
        
        System.out.println("ANTES: " + colaborador4);
        colaborador4.actualizarSalario(25); // 25% de aumento
        System.out.println("DESPUÉS (+25%): " + colaborador4);
        
        System.out.println("\n=== RESUMEN FINAL ===");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        System.out.println("\n=== Lista completa de empleados ===");
        System.out.println(colaborador1);
        System.out.println(colaborador2);
        System.out.println(colaborador3);
        System.out.println(colaborador4);
    }
}
