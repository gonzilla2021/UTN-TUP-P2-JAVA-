
public class TP5ej11DependenciaUso {

  
    public static void main(String[] args) {
       
        // Crear artistas
        Artista artista1 = new Artista("Taylor Swift", "Pop");
        Artista artista2 = new Artista("Metallica", "Heavy Metal");
        Artista artista3 = new Artista("Bad Bunny", "Reggaeton");
        
        // Crear canciones
        Cancion cancion1 = new Cancion("Shake It Off", artista1);
        Cancion cancion2 = new Cancion("Enter Sandman", artista2);
        Cancion cancion3 = new Cancion("Titi Me Preguntó", artista3);
        
        // Crear reproductor
        Reproductor reproductor = new Reproductor();
        
        // Usar el método que demuestra dependencia de uso
        System.out.println("=== INICIANDO REPRODUCCIÓN ===");
        reproductor.reproducir(cancion1);
        reproductor.reproducir(cancion2);
        reproductor.reproducir(cancion3);
        
        // Mostrar información de las canciones
        System.out.println("=== INFORMACIÓN DE CANCIONES ===");
        reproductor.mostrarInfoCancion(cancion1);
        System.out.println();
        reproductor.mostrarInfoCancion(cancion2);
    }
}

