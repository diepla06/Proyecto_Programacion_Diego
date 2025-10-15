package Tema_1;

import java.util.Scanner;

public class T1E6 {
    public static void main(String[] args){
        System.out.println("Dime un valor que equivale al radio de un circulo "); ;
        Scanner input = new Scanner(System.in) ;
        double radio = input.nextDouble() ;
        double Area = 3.14 * radio * radio ;
        System.out.println("El area del circulo es: " + Area ); ;
    }
}
