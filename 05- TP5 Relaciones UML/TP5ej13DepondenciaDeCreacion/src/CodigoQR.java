
public class CodigoQR {
    
    private String valor;
    private Usuario usuario; // Asociación unidireccional: CódigoQR → Usuario
    
    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }
    
    public String getValor() {
        return valor;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void mostrarInfo() {
        System.out.println("Código QR: " + valor);
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Email: " + usuario.getEmail());
    }
}

