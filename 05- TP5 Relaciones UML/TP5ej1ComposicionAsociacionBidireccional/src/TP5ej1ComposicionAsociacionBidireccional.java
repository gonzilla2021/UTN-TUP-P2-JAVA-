
public class TP5ej1ComposicionAsociacionBidireccional {

    public static void main(String[] args) {

        Foto foto = new Foto("imagen123.jpg", "JPG");
        Titular titular = new Titular("Juan Pérez", "12345678X");

        Pasaporte pasaporte = new Pasaporte("A1234567","11/09/2001", foto, titular);

        // Pruebas
        System.out.println(pasaporte);
        System.out.println("El titular tambien conoce su pasaporte: " + titular.getPasaporte().getNumero());
        
    }
}


 
