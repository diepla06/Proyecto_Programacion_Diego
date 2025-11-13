package Tema_3;

import java.util.Scanner;

public class T3E6 {
    public static void main(String[] args) {
        System.out.println("Te digo todas las tablas del 1 al 10");
        int numero = 1;
        int i = 1;
        for(numero = 1; numero < 11 ; numero++) {
            T3E5.tablaMultiplicar(numero);
        }
    }
}
