
public class TP5ej13DepondenciaDeCreacion {


    public static void main(String[] args) {
      
        // Crear usuarios
        Usuario usuario1 = new Usuario("Ana García", "ana@email.com");
        Usuario usuario2 = new Usuario("Luis Martínez", "luis@email.com");
        
        // Crear generador
        GeneradorQR generador = new GeneradorQR();
        
        // Usar dependencia de creación
        generador.generar("QR12345", usuario1);
        generador.generar("QR67890", usuario2);
        
        // Ejemplo adicional
        generador.generarConFecha("CODIGO", usuario1);
    }
}
