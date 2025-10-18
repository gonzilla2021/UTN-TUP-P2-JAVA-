import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();

        Circulo c1 = new Circulo("Circulo1", 5.0);
        Circulo c2 = new Circulo("Circulo2", 8.5);
        Rectangulo r1 = new Rectangulo("Rectangulo", 2, 5);
        Rectangulo r2 = new Rectangulo("Cuadrado", 5, 5);

        figuras.add(c1);
        figuras.add(c2);
        figuras.add(r1);
        figuras.add(r2);

        for (Figura f:figuras){
            System.out.println(f.getNombre() + " -> Area " + f.calcularArea());

        }
    }
}