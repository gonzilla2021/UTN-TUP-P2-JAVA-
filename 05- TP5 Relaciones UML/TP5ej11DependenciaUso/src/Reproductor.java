
public class Reproductor {

    // DEPENDENCIA DE USO: El método reproducir recibe una Canción como parámetro
    // pero no la almacena como atributo de la clase
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().getNombre());
        System.out.println("Género: " + cancion.getArtista().getGenero());
        System.out.println("Reproducción en curso...");
        System.out.println("----------------------------------------");
    }
    
    // Otro método que también demuestra dependencia de uso
    public void mostrarInfoCancion(Cancion cancion) {
        System.out.println("Información de la canción:");
        System.out.println("Título: " + cancion.getTitulo());
        System.out.println("Artista: " + cancion.getArtista().toString());
    }
}
