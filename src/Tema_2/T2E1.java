package Tema_2;

import java.util.Scanner;

public class T2E1 {
    public static void main(String[] args) {
            System.out.println("Dime un valor que equivale al lado de un cuadrado");
            Scanner input = new Scanner(System.in) ;
            double Lado = input.nextDouble() ;
            double Superficie = Lado * Lado ;
            double perimerto = Lado * 4 ;
            System.out.println("La superficie es: " + Superficie + " y el perimetro es:" + perimerto);
    }
}
