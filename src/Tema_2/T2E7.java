package Tema_2;

import java.util.Scanner;

public class T2E7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime dos numeros y restare el mayor con el menor");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        if (num1 >= num2){
            double resultado = num1 - num2;
            System.out.println(num1 + "-" + num2 + " = " + resultado);
        }else{
            double resultado = num2 - num1;
            System.out.println(num2 + "-" + num1 + "=" + resultado);
        }
    }
}
