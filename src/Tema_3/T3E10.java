package Tema_3;

import java.util.Scanner;

public class T3E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char eleccion;

        System.out.println("Dime en que programa quieres meterte");
        System.out.println("a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos.");

        eleccion = sc.next().charAt(0);

        while (eleccion != 'a' && eleccion != 'b' && eleccion != 'c' && eleccion != 'd' && eleccion != 'e' && eleccion != 'f' && eleccion != 'g' && eleccion != 'h' && eleccion != 'i'){
            System.out.println("Dime un valor correcto");
            eleccion = sc.next().charAt(0);
        }

        switch (eleccion) {
            case 'a':
                T3E1.main(args);
                break;
            case 'b':
                T3E2.main(args);
                break;
            case 'c':
                T3E3.main(args);
                break;
            case 'd':
                T3E4.main(args);
                break;
            case 'e':
                T3E5.main(args);
                break;
            case 'f':
                T3E6.main(args);
                break;
            case 'g':
                T3E7.main(args);
                break;
            case 'h':
                T3E8.main(args);
                break;
            case 'i':
                T3E9.main(args);
                break;
        }
    }
}
