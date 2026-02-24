package Tema_6.Ejercicio3;

public class Rectangulo extends Figura2D {
    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return getDimen1() * getDimen2();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (getDimen1() + getDimen2());
    }
}
