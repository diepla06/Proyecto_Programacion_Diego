package Tema_3;

import java.util.Scanner;

public class T3E2 {
    public static boolean isAdult(int age){
        if (age > 18){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        T3E1.numberSign(3);
        T3E1.main(args);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad");
        int age = sc.nextInt();

        boolean edad = isAdult(age);
        if (edad){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }

    }
}
