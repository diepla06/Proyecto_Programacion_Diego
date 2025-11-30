package Tema_3;

import java.util.Scanner;

public class MyMath8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los coeficientes (a, b, c) de la ecuación ax^2 + bx + c = 0:");

        System.out.print("Valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Valor de c: ");
        double c = scanner.nextDouble();


        int soluciones = MyMath.funcion(a, b, c);

        System.out.printf("\nLa ecuación: %.2fx^2 + %.2fx + %.2f = 0\n", a, b, c);
        System.out.printf("Tiene **%d** solución(es) real(es).\n", soluciones);


    }
}
