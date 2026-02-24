package Tema_6.Ejercicio2;

public class Perro extends Animal {

    public Perro(String nombre){
         super(nombre);
    }

    @Override
    public void hacerRuido(){
        System.out.println(getNombre() + " dice: ¡Guau guau!");
    }

    public void tumbarseHaciaArriba(){
        System.out.println(getNombre() + " se a tumbado hacia arriba.");
    }
}
