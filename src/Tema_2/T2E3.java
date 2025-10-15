package Tema_2;

import java.util.Scanner;

public class T2E3 {
    public static void main(String[]args){
        System.out.println("Dime la base y la atura de un triangulo"); ;
        Scanner valor = new Scanner(System.in) ;
        double Lado = valor.nextDouble() ;
        double altura = valor.nextDouble();
        double superficie = (Lado * altura) / 2;
        System.out.println("La superficie es: " + superficie);
    }
}
