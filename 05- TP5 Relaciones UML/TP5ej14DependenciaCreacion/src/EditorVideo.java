
public class EditorVideo {
 
    // DEPENDENCIA DE CREACIÓN: Crea un Render dentro del método pero no lo guarda
    public void exportar(String formato, Proyecto proyecto) {
        // Creación del objeto Render dentro del método
        Render render = new Render(formato, proyecto);
        
        System.out.println("Iniciando exportación...");
        render.ejecutarRender();
        System.out.println("Exportación finalizada");
        System.out.println("-------------------");
        
        // El objeto Render se destruye cuando el método termina
    }
    
    // Otro ejemplo de dependencia de creación
    public void exportarConCalidad(String formato, Proyecto proyecto, String calidad) {
        // Creación temporal dentro del método
        Render renderTemp = new Render(formato + " (" + calidad + ")", proyecto);
        
        System.out.println("Exportando con calidad: " + calidad);
        renderTemp.ejecutarRender();
        // El objeto se pierde al finalizar el método
    }
}

