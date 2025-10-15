package Tema_2;

import java.util.Scanner;

public class T2E5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tres numeros sin decimales y te dire la media entre los tres sin decimales");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int media = (num3 + num2 + num1) / 3;
        double media2 = (num3 + num2 + num1) / 3;
        System.out.println("La media de los tres numeros es " + media + " sin decimales y "  + media2 + "con decimales");
    }
}
