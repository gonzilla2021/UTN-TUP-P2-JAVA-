package tp3pooej4;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
   

    public int getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
    
    
    
    public int ponerHuevo(){
        return huevosPuestos++;
    }
    
    public int envejecer(){
        return edad++;
    }
    
    public void mostrarEstado(){
        System.out.println("La gallina: " + idGallina);
        System.out.println("Su edad es: " + edad);
        System.out.println("Puso " + huevosPuestos + " Huevos");
    }
}
