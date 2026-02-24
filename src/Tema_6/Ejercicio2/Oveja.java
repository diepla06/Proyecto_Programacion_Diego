package Tema_6.Ejercicio2;

public class Oveja extends Animal{
    public Oveja(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " dice: ¡Beeeee!");
    }

    public void esquilar(){
        System.out.println(getNombre() + " la estan esquilando.");
    }
}
