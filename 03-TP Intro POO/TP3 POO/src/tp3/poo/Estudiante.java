package tp3.poo;
//Clase EStudiante
public class Estudiante {
    //Atributos
    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Materia: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("=========================");
               
    }
    
    public int subirCalificacion(int puntos){
        calificacion = puntos + calificacion;
        return calificacion;
                
    }
    
    public int bajarCalificacion(int puntos){
        calificacion = calificacion - puntos;
        return calificacion;
    }
               
    
}
