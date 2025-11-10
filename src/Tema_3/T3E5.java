package Tema_3;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class T3E5 {

    public static int tablaMultiplicar(int numero, int contador){
        int result = numero * contador;
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
;
        int numero;
        int result;

        System.out.println("Dime un numero entero del 1 al 10 y te digo su tabla de multiplicar");
        numero = sc.nextInt();

        if(numero < 1 || numero > 10){
            System.out.println("Ese numero no esta entre el 1 y el 10");
        }else {
            for(int contador = 1 ; contador <= 10 ; contador++) {
                result = tablaMultiplicar(numero, contador);
                System.out.println(numero + " * " + contador + " = " + result);
            }
        }
    }
}
