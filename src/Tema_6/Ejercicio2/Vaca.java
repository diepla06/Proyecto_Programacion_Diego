package Tema_6.Ejercicio2;

public class Vaca extends Animal{
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " dice: ¡Muuuuu!");
    }

    public void ordenyando(){
        System.out.println(getNombre() + " la estan ordeñado");
    }
}
