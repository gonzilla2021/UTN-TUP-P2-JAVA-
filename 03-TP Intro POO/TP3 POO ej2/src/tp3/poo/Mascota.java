package tp3.poo;


public class Mascota {

    public Mascota() {
    }
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo(){
        System.out.println("Mi mascota se llama "+nombre
                +" es una "+especie+" y tiene "+edad + " años");
        
    }
    public void cumplirAnios(){
        edad++;
    }
    
    
}
