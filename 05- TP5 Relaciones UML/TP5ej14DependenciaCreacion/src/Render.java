
public class Render {
  
    private String formato;
    private Proyecto proyecto; // Asociación unidireccional: Render → Proyecto
    
    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public Proyecto getProyecto() {
        return proyecto;
    }
    
    public void ejecutarRender() {
        System.out.println("Renderizando proyecto: " + proyecto.getNombre());
        System.out.println("Duración: " + proyecto.getDuracionMin() + " minutos");
        System.out.println("Formato: " + formato);
        System.out.println("Progreso: 0%...50%...100%");
        System.out.println("Render completado");
    }
}

