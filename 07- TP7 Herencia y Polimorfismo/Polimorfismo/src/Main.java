import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        Empleado e1 = new EmpleadoTemporal("Juan Perez", 8, 1000);
        Empleado e2 = new EmpleadoPlanta("Alejandro", 10000);

        empleados.add(e1);
        empleados.add(e2);

        for(Empleado emp : empleados){
            double sueldo = emp.calcularSueldo(); //Polimorfismo

            if (emp instanceof EmpleadoPlanta){
                System.out.println("Sueldo de planta es: "+ sueldo);

            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("Sueldo Temporal es: "+ sueldo);
            }

        }

    }
}