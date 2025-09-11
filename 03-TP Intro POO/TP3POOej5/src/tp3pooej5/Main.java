/*
5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia),
recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.

 */
package tp3pooej5;

public class Main {

    public static void main(String[] args) {
        //
        Nave halcon = new Nave();
        
        
        halcon.setNombre("El Halcon Milenario ");
        halcon.avanzar();
        halcon.setCombustible(50);
        halcon.mostrar();
        halcon.despegar();
        halcon.avanzar();
        halcon.mostrar();
        halcon.recargarCombustible();
        halcon.mostrar();
    }
    
}
