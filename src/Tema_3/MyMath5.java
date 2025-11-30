package Tema_3;

import java.util.Scanner;

public class MyMath5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont;

        System.out.println("Dime un numero y te dire cuantos impares tiene");
        num = sc.nextInt();

        cont = MyMath.numerosImpares(num);
        System.out.println("Son " + cont + " Impares");
    }
}
