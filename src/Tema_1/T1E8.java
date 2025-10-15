package Tema_1;

import java.util.Scanner;

public class T1E8 {
    public  static void main(String[] args) {
        System.out.println ("Dime dos numeros enteros") ;
        Scanner scanner1 = new Scanner (System.in) ;
        int num1 = scanner1.nextInt() ;
        Scanner scanner2 = new Scanner(System.in) ;
        int num2 = scanner2.nextInt() ;
        if (num1 > num2){
            System.out.println(num1 + " es mayor que " + num2 ) ;
        } else if (num1 == num2) {
            System.out.println(num1 + " es igual que " + num2 ) ;
        }else if (num2 > num1) {
            System.out.println(num2 + " es mayor que " + num1 ) ;
        }


    }
}
