
public class Vehiculo {
    
    private String patente;
    private String modelo;
    private Motor motor;       // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
        conductor.setVehiculo(this); // Mantiene la relación bidireccional
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    @Override
    public String toString() {
        return "Vehiculo{patente='" + patente + "', modelo='" + modelo +
               "', motor=" + motor + ", conductor=" + conductor + "}";
    }

}
