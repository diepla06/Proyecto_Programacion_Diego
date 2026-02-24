package Tema_6.Ejercicio2;

public class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    public void bolaPelo(){
        System.out.println(getNombre() + " escupe una bola de pelo.");
    }
}
