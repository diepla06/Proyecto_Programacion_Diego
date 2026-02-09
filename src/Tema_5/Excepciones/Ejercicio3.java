package Tema_5.Excepciones;

import java.awt.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] vector = new double[5];
        Scanner sc = new Scanner(System.in);
        double num;
        boolean correcto;

            System.out.println("Ves diciendome valores en total 5");

            for (int i = 0; i < vector.length; i++) {
                correcto = false;
                while (!correcto) {
                    try {
                        System.out.print("Dime un numero decimal: ");
                        num = sc.nextDouble();

                        vector[i] = num;
                        correcto = true;
                    } catch (InputMismatchException ex) {
                        System.err.println("Eso no es un numero // ERROR: " + ex.getMessage());
                        System.out.println("\n");
                        sc.nextLine();
                    }

                }
            }
        for (int i = 0; i < vector.length; i++) {
            System.out.print((i + 1) + ": " + vector[i] + " // ");
        }


    }
}
