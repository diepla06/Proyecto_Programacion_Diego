package Tema_3;

import java.util.Scanner;

public class T3E1 {
    public static int numberSign(int num){
        if (num == 0){
            return 0;
        }else if (num > 0){
            return 1;
        }else {
            return -1;
        }
    }

    public static void main(String[] args){
        System.out.println("Dime un numero y te digo si es mayor, menor o igual a 0");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = numberSign(num);
        if (result == 0){
            System.out.println("El numero es 0");
        }else if (result == 1){
            System.out.println("El numero es mayor que 0");
        }else if (result == -1){
            System.out.println("El numero es menor que 0");
        }

    }
}
