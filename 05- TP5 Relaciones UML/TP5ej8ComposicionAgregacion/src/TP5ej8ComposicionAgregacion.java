
public class TP5ej8ComposicionAgregacion {


    public static void main(String[] args) {
      
        Usuario usuario = new Usuario("Laura Castellini", "laura@email.com");
        FirmaDigital firma = new FirmaDigital("HASH-ABC123", "2025-09-26", usuario);

        Documento documento = new Documento("Contrato Laboral", "Contenido del contrato...", firma);

        // Pruebas
        System.out.println(documento);
        System.out.println("El documento fue firmado por: " + documento.getFirmaDigital().getUsuario().getNombre());
        System.out.println("El hash de la firma es: " + documento.getFirmaDigital().getCodigoHash());
    }
}

