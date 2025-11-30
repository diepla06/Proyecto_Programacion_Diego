package Tema_3;

import java.util.Scanner;

public class MyMath11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo;

        System.out.println("Dime un numero y te dire si es primo");
        num = sc.nextInt();

        primo = MyMath.esPrimo(num);

        if (primo) {
            System.out.println(num + " es primo");
        }else  {
            System.out.println(num + " no es primo");
        }
    }
}
