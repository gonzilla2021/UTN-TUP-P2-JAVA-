
package tp3pooej5;

public class Nave {
    private String nombre;
    private int combustible;
    
    public int despegar(){
        System.out.println("Despegando...consume 25 de combustible ");
        this.combustible = combustible - 25;
        return combustible;
    }
    
    public int avanzar(){
        if(this.combustible>25){
            System.out.println("Avanzando...consume 25 de combustible ");
            this.combustible = combustible - 25;
            
            }else{
                    System.out.println("La nave no tiene combustible");
                 }
        return combustible;
    }
    
    public void recargarCombustible(){
        System.out.print("Recarga de combustible: ");
        this.combustible = combustible + 50;
        
    }
    
    public void mostrar(){
        System.out.print("La Nave: " + nombre);
        System.out.println("El combustible es: " + combustible);    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    
    
    
}
