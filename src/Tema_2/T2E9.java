package Tema_2;

import java.util.Scanner;

public class T2E9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime los dolares que tengas, te los voy a pasar a euros");
        double euros = scanner.nextDouble();
        double conversion = euros * 0.86;
        System.out.println(conversion + "€");
    }
}
