package Tema_2;

import java.util.Scanner;

public class T2E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime los euros que tengas, te los voy a pasar a dolares");
        double euros = scanner.nextDouble();
        double conversion = euros * 1.17;
        System.out.println(conversion + "$");
    }
}


