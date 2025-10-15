package Tema_2;

import java.util.Scanner;

public class T2E17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una opción (0: cuadrado, 1: rectángulo, 2: triángulo): ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 0:
                System.out.print("Ingrese el lado del cuadrado: ");
                double lado = sc.nextDouble();
                double superficieCuad = lado * lado;
                double perimetroCuad = 4 * lado;
                System.out.println("Superficie del cuadrado: " + superficieCuad);
                System.out.println("Perímetro del cuadrado: " + perimetroCuad);

            case 1:
                System.out.print("Ingrese la base del rectángulo: ");
                double base = sc.nextDouble();
                System.out.print("Ingrese la altura del rectángulo: ");
                double altura = sc.nextDouble();
                double superficieRect = base * altura;
                double perimetroRect = 2 * (base + altura);
                System.out.println("Superficie del rectángulo: " + superficieRect);
                System.out.println("Perímetro del rectángulo: " + perimetroRect);

            case 2:
                System.out.print("Ingrese la base del triángulo: ");
                double baseTri = sc.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaTri = sc.nextDouble();
                double superficieTri = (baseTri * alturaTri) / 2;
                System.out.println("Superficie del triángulo: " + superficieTri);

            default:
                System.out.println("Error: opción no válida.");
        }
    }
}
