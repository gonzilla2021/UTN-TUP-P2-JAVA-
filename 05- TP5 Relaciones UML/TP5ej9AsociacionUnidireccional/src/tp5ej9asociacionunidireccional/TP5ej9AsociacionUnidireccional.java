
package tp5ej9asociacionunidireccional;

public class TP5ej9AsociacionUnidireccional {

 
    public static void main(String[] args) {

        Paciente p = new Paciente("María Pérez", "OSDE");
        Profesional pr = new Profesional("Dr. Juan Gómez", "Cardiología");

        CitaMedica cita = new CitaMedica(
            "27/09/2025",
            "19:30 horas",
            p,
            pr
        );

        System.out.println(cita);

        // Ejemplo de acceso a los datos:
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Fecha y hora: " + cita.getFecha() + " " + cita.getHora());
    }
}


