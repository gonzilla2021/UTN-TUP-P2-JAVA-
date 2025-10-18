import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

                List<Animal> anim = new ArrayList<>();
                Animal perro = new Perro();
                Animal gato = new Gato();
                Animal vaca = new Vaca();


                anim.add(perro);
                anim.add(gato);
                anim.add(vaca);


                for(Animal a: anim){
                    a.hacerSonido();
                }


            }
        }

