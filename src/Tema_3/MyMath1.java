package Tema_3;

import java.util.Scanner;

public class MyMath1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado;
        double base;
        double altura;
        double radio;

        System.out.println("Vamos a calcular el area y el preimetro del cuadrado, rectangulo y circulo");

        //Quadrado
        System.out.println("Dime un lado del cuadrado");
        lado = sc.nextDouble();
        double pQuadrado = MyMath.squarePerimeter(lado);
        double aQuadrado = MyMath.squareArea(lado);
        System.out.println("El perimetro: " + pQuadrado + "\nEl area: " + aQuadrado);

        //Rectangulo
        System.out.println("Dime la base de tu rectangulo");
        base = sc.nextDouble();
        System.out.println("Ahora dime la altura");
        altura = sc.nextDouble();
        double pRectangulo = MyMath.rectanglePerimeter(base, altura);
        double aRectangulo = MyMath.rectangleArea(base, altura);
        System.out.println("El perimetro: " + pRectangulo + "\nEl area: " + aRectangulo);

        //Circulo
        System.out.println("Dime el radio de tu circulo");
        radio = sc.nextDouble();
        double pCirculo = MyMath.circlePerimeter(radio);
        double aCirculo = MyMath.circleArea(radio);
        System.out.println("El perimetro: " + pCirculo + "\nEl area: " + aCirculo);

    }
}
