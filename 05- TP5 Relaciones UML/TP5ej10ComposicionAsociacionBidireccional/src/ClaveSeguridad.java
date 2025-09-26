
public class ClaveSeguridad {


    String codigo;
    String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad{codigo='" + codigo + "', ultimaModificacion='" 
                + ultimaModificacion + "'}";
    }
}

