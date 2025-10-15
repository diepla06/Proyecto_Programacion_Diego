package Tema_2;

import java.util.Scanner;

public class T2E12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Dime el segundo número:");
        int num2 = scanner.nextInt();
        System.out.println("Dime el tercer número:");
        int num3 = scanner.nextInt();

        System.out.println("Los números ordenados de mayor a menor son:");

        if (num1 >= num2 && num1 >= num3) {
            System.out.print(num1 + ", ");
            if (num2 >= num3) {
                System.out.println(num2 + ", " + num3);
            } else {
                System.out.println(num3 + ", " + num2);
            }

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.print(num2 + ", ");
            if (num1 >= num3) {
                System.out.println(num1 + ", " + num3);
            } else {
                System.out.println(num3 + ", " + num1);
            }

        } else {
            System.out.print(num3 + ", ");
            if (num1 >= num2) {
                System.out.println(num1 + ", " + num2);
            } else {
                System.out.println(num2 + ", " + num1);
            }
        }

        scanner.close();
    }
}
