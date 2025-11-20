package Tema_3;

import java.util.Scanner;

public class MyMath3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int cifra;

        System.out.println("Dime un numero entero y te dire cuantos digitos tiene");
        num = sc.nextInt();

        cifra = MyMath.numeroDigito(num);

        System.out.println("El numero que me has dado tiene " + cifra + " numeros.");
    }
}
