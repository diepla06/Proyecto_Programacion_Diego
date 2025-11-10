package Tema_3;

import java.util.Scanner;

public class T3E6 {
    public static int tablaMultiplicar(int numero, int contador){

        int result = numero * contador;
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ;

        int result;

        System.out.println("Te voy a decir las tablas del 1 al 10");

        for (int contador = 1; contador <= 10; contador++) {
            System.out.println("Tabla del " + contador);
            for (int numero = 1; numero <= 10 ; numero++) {
                result = tablaMultiplicar(numero, contador);
                System.out.println(numero + " * " + contador + " = " + result);
            }

        }
    }
}
