package Tema_2;

import java.util.Scanner;

public class T2E2 {
    public static void main(String[]args){
        System.out.println("Dime la base y la atura de un rectangulo"); ;
        Scanner valor = new Scanner(System.in) ;
        double Lado = valor.nextDouble() ;
        double altura = valor.nextDouble();
        double superficie = Lado * altura ;
        double perimerto = 2 * (Lado + altura) ;
        System.out.println("La superficie es: " + superficie + " y el perimetro es:" + perimerto);
    }
}
