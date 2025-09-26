
package tp5ej2agregacionasociacionbidireccional;

public class TP5ej2AgregacionAsociacionBidireccional {

    public static void main(String[] args) {
        
        Bateria bateria = new Bateria("BAT123", 5000);
        Usuario usuario = new Usuario("Gonzalo Castellini", "87654321Z");

        Celular celular = new Celular("123456789012345", "Samsung", "Galaxy S20", bateria, usuario);

        // Pruebas
        System.out.println(celular);
        System.out.println("El usuario también conoce su celular: " + usuario.getCelular().getModelo());
    }
}

      
