package Tema_3;

import java.util.Scanner;

public class MyMath4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont;

        System.out.println("Dime un numero y te dire cuantos pares tiene");
        num = sc.nextInt();

        cont = MyMath.numerosPares(num);
        System.out.println("Son " + cont + " pares");
    }
}
