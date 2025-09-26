public class TP5ej14DependenciaCreacion {

  
    public static void main(String[] args) {
       
        // Crear proyectos
        Proyecto proyecto1 = new Proyecto("Documental Naturaleza", 120);
        Proyecto proyecto2 = new Proyecto("Cortometraje Drama", 45);
        Proyecto proyecto3 = new Proyecto("Video Musical", 5);
        
        // Crear editor de video
        EditorVideo editor = new EditorVideo();
        
        // Usar dependencia de creación
        editor.exportar("MP4", proyecto1);
        editor.exportar("AVI", proyecto2);
        editor.exportar("MOV", proyecto3);
        
        // Ejemplo con calidad
        editor.exportarConCalidad("MP4", proyecto1, "1080p");
    }
}

