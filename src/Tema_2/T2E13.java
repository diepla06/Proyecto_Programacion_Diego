package Tema_2;

import java.util.Scanner;

public class T2E13 {
    public static void main(String[] args) {
        System.out.println("Dime las horas, minutos y segundos que quieras y le sumaré 1 segundo:");
        Scanner sc = new Scanner(System.in);

        int horas = sc.nextInt();
        int min = sc.nextInt();
        int segundo = sc.nextInt();

        // Comprobar que las entradas son correctas
        if (horas < 0 || horas >= 24 || min < 0 || min >= 60 || segundo < 0 || segundo >= 60) {
            System.out.println("Datos incorrectos. Por favor, introduce valores válidos.");
        } else {
            segundo++;

            if (segundo == 60) {
                segundo = 0;
                min++;
            }

            if (min == 60) {
                min = 0;
                horas++;
            }

            if (horas == 24) {
                horas = 0;
            }
            System.out.println("Resultado: " + horas + ":" + min + ":" + segundo + ":");
        }
    }
}
