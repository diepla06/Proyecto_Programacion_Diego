package Tema_5.Excepciones;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Ejercicio4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sn = new Scanner(System.in);


        int n = rand.nextInt(100) + 1;
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(10) + 1;
        }

        System.out.println("Vector creado con éxito. Tamaño: " + n);
        int posicion = 0;


        while (true) {
            try {
                System.out.print("\nIntroduce la posición a consultar (negativo para salir): ");
                posicion = sn.nextInt();

                if (posicion < 0) {
                    break;
                }

                System.out.println("Valor en la posición [" + posicion + "]: " + vector[posicion]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error: La posición " + posicion + " está fuera de rango. (Máximo: " + (n - 1) + ")");
            } catch (InputMismatchException e) {
                System.err.println("Error: Debes introducir un número entero válido.");
                sn.next();
            } catch (Exception e) {
                System.err.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }

        System.out.println("Programa finalizado. ¡Hasta pronto!");
        sn.close();
    }
}

