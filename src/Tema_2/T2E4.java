package Tema_2;

import java.util.Scanner;

public class T2E4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tres numeros y te dire cual es el mayor");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        if ((num1 >= num2) && (num1 >= num3)){
            System.out.println("El numero mayor es " + num1);
        } else if ((num2 >= num1) && (num2 >= num3)){
            System.out.println("El numero mayor es " + num2);
        }else if ((num3 >= num1) && (num3 >= num2)){
            System.out.println("El numero mayor es " + num3);
        }
    }
}
