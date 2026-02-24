package Tema_6.Ejercicio3;

public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    public void setLado(double lado) {
        setDimen1(lado);
        setDimen2(lado);
    }
}
