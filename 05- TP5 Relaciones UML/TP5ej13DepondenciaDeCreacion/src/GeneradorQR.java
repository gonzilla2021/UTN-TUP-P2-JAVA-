
public class GeneradorQR {
 
    // DEPENDENCIA DE CREACIÓN: Crea un CódigoQR dentro del método pero no lo guarda
    public void generar(String valor, Usuario usuario) {
        // Creación del objeto dentro del método
        CodigoQR codigo = new CodigoQR(valor, usuario);
        
        System.out.println("Generando código QR...");
        codigo.mostrarInfo();
        System.out.println("Código generado exitosamente");
        System.out.println("-------------------");
        
        // El objeto CodigoQR se destruye cuando el método termina
        // No se guarda como atributo de GeneradorQR
    }
    
    // Otro ejemplo de dependencia de creación
    public void generarConFecha(String valor, Usuario usuario) {
        // Creación temporal dentro del método
        CodigoQR codigoTemporal = new CodigoQR(valor + "-" + 
                System.currentTimeMillis(), usuario);
        
        System.out.println("Código con fecha: " + codigoTemporal.getValor());
        // El objeto se pierde al finalizar el método
    }
}

