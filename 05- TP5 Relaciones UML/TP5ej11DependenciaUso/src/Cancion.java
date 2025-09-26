
public class Cancion {
 
    private String titulo;
    private Artista artista; // Asociación unidireccional Canción → Artista
    
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
    }
    
    // Getters y setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public Artista getArtista() {
        return artista;
    }
    
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    @Override
    public String toString() {
        return "'" + titulo + "' por " + artista.getNombre();
    }
}


