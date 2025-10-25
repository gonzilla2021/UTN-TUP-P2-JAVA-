// Hereda de Exception
public class EdadInvalidaException extends Exception {

    public EdadInvalidaException(String mensaje) {
        super(mensaje);  // pasa el mensaje al constructor de Exception
    }
}
