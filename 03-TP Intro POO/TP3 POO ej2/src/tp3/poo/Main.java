
package tp3.poo;
/*2. Registro de Mascotas 
a. Crear una clase Mascota con los atributos: nombre, especie, edad. 
Métodos requeridos: mostrarInfo(), cumplirAnios(). 
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y 
verificar los cambios.*/


public class Main {

     public static void main(String[] args) {
        Mascota miMascota = new Mascota();
        
        miMascota.nombre = "Yin Yan";
        miMascota.especie = "Gata";
        miMascota.edad = 6;
        
        miMascota.mostrarInfo();
        miMascota.cumplirAnios();
       
        int edadActual=miMascota.edad;
        System.out.print("En 1 año YinYan tendra: "+edadActual + " Años");
    }
    
}
