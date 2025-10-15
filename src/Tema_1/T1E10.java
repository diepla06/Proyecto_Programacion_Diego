package Tema_1;

import java.util.Scanner;

public class T1E10 {
    public static void main(String[] args) {
        System.out.println ("Dime dos numeros") ;
        Scanner scanner1 = new Scanner (System.in) ;
        double num1 = scanner1.nextDouble() ;
        Scanner scanner2 = new Scanner (System.in) ;
        double num2 = scanner2.nextDouble() ;
        double resultado =  num1 + num2 ;
        System.out.println ("Resultado de la suma es: " + resultado) ;
        resultado = num1 - num2 ;
        System.out.println ("Resultado de la resta es: " + resultado) ;
        resultado = num1 * num2 ;
        System.out.println ("Resultado de la multiplicación: " + resultado) ;
        resultado = num1 / num2 ;
        System.out.println ("Resultado de la división: " + resultado) ;
        resultado = num1 % num2;
        System.out.println ("Resultado del resto: " + resultado) ;
    }
}
