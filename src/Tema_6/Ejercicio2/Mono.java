package Tema_6.Ejercicio2;

public class Mono extends Animal{
    public Mono(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerRuido() {
        System.out.println(getNombre() + " dice: ¡Uh, uh, ah, ah!");
    }

    public void comerPlatano(){
        System.out.println(getNombre() + " se esta comiendo un platano.");
    }
}
