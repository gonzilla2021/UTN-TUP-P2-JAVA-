/*
4. Gestión de Gallinas en Granja Digital
a. Crear una clase Gallina con los atributos: idGallina, edad,
huevosPuestos.
Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y
mostrar su estado.

 */
package tp3pooej4;

public class TP3POOej4 {

   
    public static void main(String[] args) {
        // 
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        System.out.println("=== GALLINA 1 ===");
        
        
        System.out.println("Huevos Puestos");
        gallina1.setHuevosPuestos(3);
        System.out.println(gallina1.getHuevosPuestos()); 
        System.out.println("La gallina pone un huevo");
        gallina1.ponerHuevo();
        System.out.println(gallina1.getHuevosPuestos());
        
        System.out.println("Edad Actual");
        gallina1.setEdad(5);
        System.out.println(gallina1.getEdad());
        System.out.println("Edad luego de 1 año");
        gallina1.envejecer();
        System.out.println(gallina1.getEdad());
        
        gallina1.mostrarEstado();
        
        System.out.println("=== GALLINA 2 ===");
        
        
        System.out.println("Huevos Puestos");
        gallina2.setHuevosPuestos(13);
        System.out.println(gallina2.getHuevosPuestos());
        System.out.println("La gallina pone un huevo");
        gallina2.ponerHuevo();
        System.out.println(gallina2.getHuevosPuestos());
        
        System.out.println("Edad Actual");
        gallina2.setEdad(24);
        System.out.println(gallina2.getEdad());
        System.out.println("Edad luego de 1 año");
        gallina2.envejecer();
        System.out.println(gallina2.getEdad());
        
        gallina2.mostrarEstado();
        
    }
    
}
