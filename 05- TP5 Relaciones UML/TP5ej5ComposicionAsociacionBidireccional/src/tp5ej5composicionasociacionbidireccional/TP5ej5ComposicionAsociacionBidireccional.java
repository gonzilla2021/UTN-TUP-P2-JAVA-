
package tp5ej5composicionasociacionbidireccional;

public class TP5ej5ComposicionAsociacionBidireccional {

    public static void main(String[] args) {
      
        PlacaMadre placaMadre = new PlacaMadre("ASUS ROG STRIX B550-F", "AMD B550");
        Propietario propietario = new Propietario("Carlos Gómez", "98765432L");

        Computadora computadora = new Computadora("Dell", "SN123456789", placaMadre, propietario);

        // Pruebas
        System.out.println(computadora);
        System.out.println("El propietario también conoce su computadora: " + propietario.getComputadora().getMarca());
        System.out.println("La placa madre de la computadora es: " + computadora.getPlacaMadre().getModelo());
    }
}

    