package Tema_3;

import java.util.Scanner;

public class T3E9 {
    public static void piramide(int line, char caracter){
        for (int i = 1; i <= line ; i++){
            int numSimbolo = 2 * i -1;
            int espacios = line - i;
            System.out.println(" " .repeat(espacios) + String.valueOf(caracter).repeat(numSimbolo));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line;
        char caracter;

        System.out.println("Dime las lineas que quieres que tenga");
        line = sc.nextInt();

        System.out.println("Dime que caracter quieres que tenga");
        caracter = sc.next().charAt(0);

        piramide(line,caracter);

    }
}
