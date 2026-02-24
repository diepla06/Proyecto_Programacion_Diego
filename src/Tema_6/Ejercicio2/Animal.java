package Tema_6.Ejercicio2;

/*2. Crea una clase Animal. Cualquier subclase que creemos de animal debe
tener los métodos comer, dormir y hacerRuido. Haz 5 subclases de animales
diferentes piensa que hacen todos más o menos igual, qué diferente e
implementa un método único para cada animal.*/

abstract public class Animal {

    private String nombre;


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " se ha quedado dormido.");
    }

    // Método que cada subclase DEBE implementar
    public abstract void hacerRuido();

}
