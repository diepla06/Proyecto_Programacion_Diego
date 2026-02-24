package Tema_6.Ejercicio3;

public class Circulo extends Figura2D {
    public Circulo(double radio) {
        super(radio, 0);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(getDimen1(), 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * getDimen1();
    }
}
