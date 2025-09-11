
package tp3.poo;


public class Libro {
   //Atributos 
   private String titulo;
   private String autor;
   private int anioPublicacion;
   
   //Getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
   
   //setter

    public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2025) { // puedes ajustar el límite superior si lo deseas
            this.anioPublicacion = anio;
        } else {
            System.out.println("Año de publicación inválido: " + anio);
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
   
}
