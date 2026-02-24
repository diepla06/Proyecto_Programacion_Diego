package Tema_6.Ejercicio8;

public class AtaqueBolaFuego implements IAtaqueAvanzado {
    private String nombre;
    private double danyoMagico;
    private double manaCoste;

    public AtaqueBolaFuego() {}

    public AtaqueBolaFuego(String nombre, double danyoMagico, double manaCoste) {
        this.nombre = nombre;
        this.danyoMagico = danyoMagico;
        this.manaCoste = manaCoste;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getDanyoMagico() { return danyoMagico; }
    public void setDanyoMagico(double danyoMagico) { this.danyoMagico = danyoMagico; }
    public double getManaCoste() { return manaCoste; }
    public void setManaCoste(double manaCoste) { this.manaCoste = manaCoste; }

    @Override
    public void lanzar() { System.out.println("¡" + nombre + " lanzada!"); }

    @Override
    public void mostrarCoste() {
        System.out.println("Coste -> Mana: " + manaCoste + " | Esfuerzo Fisico: 0");
    }

    @Override
    public void mostrarDanyoInfligido() {
        System.out.println("Danyo -> Magico: " + danyoMagico + " | Fisico: 0");
    }
}
