
public class TP5ej7AgregacionAsociacionBidireccional {

    public static void main(String[] args) {
      
        Motor motor = new Motor("V8", "SN-MTR-001");
        Conductor conductor = new Conductor("Pedro Sánchez", "LIC-123456");

        Vehiculo vehiculo = new Vehiculo("ABC123", "Ford Mustang", motor, conductor);

        // Pruebas
        System.out.println(vehiculo);
        System.out.println("El conductor también conoce su vehículo: " + conductor.getVehiculo().getModelo());
        System.out.println("El motor del vehículo es: " + vehiculo.getMotor().getTipo());
    }
}

    
