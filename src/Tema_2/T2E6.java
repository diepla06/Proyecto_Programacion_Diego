package Tema_2;

import java.util.Scanner;

public class T2E6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero y te dire si es positivo, negativo o zero");
        double num1 = scanner.nextDouble();
        if (num1 == 0) {
            System.out.println(num1 +" es igual a 0");
        } else if (num1 > 0){
            System.out.println(num1 + " es positivo");
        }else {
            System.out.println(num1 + " es negativo");
        }
    }
}
