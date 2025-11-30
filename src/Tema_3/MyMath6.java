package Tema_3;

import java.util.Scanner;

public class MyMath6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int resultado = MyMath.factorial(num);
        System.out.println("El factorial de " + resultado);
    }
}
