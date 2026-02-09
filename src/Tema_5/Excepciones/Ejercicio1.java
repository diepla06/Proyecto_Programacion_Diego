package Tema_5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        try {
            System.out.print("Dime un numero: ");
            num = sc.nextInt();

            System.out.println("Valor introducido: " + num);
        }catch (InputMismatchException ex){
            System.out.println("Valor introducido incorrecto // " + ex.getMessage());
        }

    }
}
