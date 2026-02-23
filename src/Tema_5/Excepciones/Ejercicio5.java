package Tema_5.Excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio5 {

        public static void imprimePositivo(int p) throws Exception {
            if (p < 0) {
                throw new Exception("Error: El número " + p + " no es positivo.");
            }
            System.out.println("Confirmado, el número positivo es: " + p);
        }

        public static void imprimeNegativo(int n) throws Exception {
            if (n >= 0) {
                throw new Exception("Error: El número " + n + " no es negativo.");
            }
            System.out.println("Confirmado, el número negativo es: " + n);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int usuarioNum;

            System.out.println("--- Probador de Funciones con Excepciones ---");

            while (true) {
                try {
                    System.out.print("\nIntroduce un número (o escribe algo no numérico para salir): ");
                    usuarioNum = sc.nextInt();

                    System.out.println("Intentando imprimir como positivo...");
                    imprimePositivo(usuarioNum);

                    System.out.println("Intentando imprimir como negativo...");
                    imprimeNegativo(usuarioNum);

                } catch (InputMismatchException e) {
                    System.err.println("Saliendo del programa por entrada no válida...");
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.err.println(e.getMessage());
                }
            }
    }
}
