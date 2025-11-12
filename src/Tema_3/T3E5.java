package Tema_3;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class T3E5 {

    public static void tablaMultiplicar(int numero){
        for (int i =0;i<10;i++){
            int mult = numero * i;
            System.out.println("El resultado es " + mult);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
;
        int numero;


        System.out.println("Dime un numero entero del 1 al 10 y te digo su tabla de multiplicar");
        numero = sc.nextInt();

        if(numero < 1 || numero > 10){
            System.out.println("Ese numero no esta entre el 1 y el 10");
        }else {
            tablaMultiplicar(numero);
        }
    }
}
