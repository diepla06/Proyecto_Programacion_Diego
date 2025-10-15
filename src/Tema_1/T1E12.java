package Tema_1;

import java.util.Scanner;

public class T1E12 {
    public static void main(String[] args) {
        System.out.println("Dime un año");
        Scanner scanner = new Scanner(System.in);
        int anyo = scanner.nextInt();
        if (anyo % 400 == 0) {
            System.out.println(anyo + " es bisiesto");
        }else if ((anyo % 4 == 0) && (anyo % 100 != 0)) {
            System.out.println(anyo + " es bisiesto");
        }else {
            System.out.println(anyo + " no es bisiesto");
        }
    }
}
