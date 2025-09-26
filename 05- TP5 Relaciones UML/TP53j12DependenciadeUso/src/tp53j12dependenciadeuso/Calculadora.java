
package tp53j12dependenciadeuso;

public class Calculadora {
    

    // DEPENDENCIA DE USO: Recibe Impuesto como parámetro pero no lo guarda
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto para: " +
                impuesto.getContribuyente().getNombre());
        System.out.println("CUIL: " + impuesto.getContribuyente().getCuil());
        System.out.println("Monto base: $" + impuesto.getMonto());
        
        double total = impuesto.getMonto() * 1.05; // 5% de interés
        System.out.println("Total a pagar: $" + total);
        System.out.println("-------------------");
    }
}
