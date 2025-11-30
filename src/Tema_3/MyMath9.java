package Tema_3;

import java.util.Scanner;

public class MyMath9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduce un número entero para sumar sus dígitos: ");
        int numUsuario = scanner.nextInt();

        int sumaUsuario = MyMath.sumarDigitos(numUsuario);

        System.out.printf("El número %d tiene una suma de dígitos de **%d**.\n", numUsuario, sumaUsuario);
    }
}
