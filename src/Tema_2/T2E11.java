package Tema_2;

import java.util.Scanner;

public class T2E11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = sc.nextInt();

        // Orden ascendente: num1 < num2 < num3 y consecutivos
        if (num2 == num1 + 1 && num3 == num2 + 1) {
            System.out.println(num1 + ", " + num2 + ", " + num3);
            System.out.println("Los números están consecutivos (ascendentes).");
        }
        // Orden descendente: num1 > num2 > num3 y consecutivos
        else if (num2 == num1 - 1 && num3 == num2 - 1) {
            System.out.println(num1 + ", " + num2 + ", " + num3);
            System.out.println("Los números están consecutivos (descendentes).");
        }
        else {
            System.out.println("Los números no son consecutivos.");
        }
    }
}
