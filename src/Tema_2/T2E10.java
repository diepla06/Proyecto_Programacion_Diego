package Tema_2;

import java.util.Scanner;

public class T2E10 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tres tunmeros y estan ordenados de mayor a menor");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        if (num1 > num2 && num2 > num3){
            System.out.println(num1 + ">" + num2 + ">" + num3);
            System.out.println("Los numeros estan de mayor a menor");
        }else {
            System.out.println("Los numeros " + num1 + ", " + num2 + ", " + num3 + " no estan de mayor a menor");
        }
    }
}
