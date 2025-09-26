
public class FirmaDigital {

    private String codigoHash;
    private String fecha;
    private Usuario usuario; // Agregación

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital{codigoHash='" + codigoHash + "', fecha='" 
                + fecha + "', usuario=" + usuario + "}";
    }
}

