package Tema_6.Ejercicio3;

public class Triangulo extends Figura2D {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double calcularArea() {
        return (getDimen1() * getDimen2()) / 2;
    }

    @Override
    public double calcularPerimetro() {

        double hipo = Math.sqrt(Math.pow(getDimen1(), 2) + Math.pow(getDimen2(), 2));
        return getDimen1() + getDimen2() + hipo;
    }
}
