package Tema_6.Ejercicio3;

public abstract class Figura2D {
    //base, lado o radio
    private double dimen1;
    //altura o segundo lado
    private double dimen2;

    public Figura2D(){};

    public Figura2D(double d1, double d2) {
        this.dimen1 = d1;
        this.dimen2 = d2;
    }


    public double getDimen1() { return dimen1; }
    public void setDimen1(double d1) { this.dimen1 = d1; }

    public double getDimen2() { return dimen2; }
    public void setDimen2(double d2) { this.dimen2 = d2; }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
