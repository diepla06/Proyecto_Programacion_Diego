package Tema_2;

import java.util.Random;
import java.util.Scanner;

/*
 “El número secreto”. Programa un juego en el que se calcula
aleatoriamente un número de 1 a 100. El usuario debe adivinarlo. Cada
vez que el usuario pone un número el programa le indicará si lo ha
acertado, si el número secreto es mayor o si es menor. Termina cuando
el usuario acierta el número.
 */
public class T2E29 {
    public static void main(String[] args) {
        System.out.println("Hacertaras el numero (1-100)");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomInt = random.nextInt(1, 100);
        int num = sc.nextInt();

        while (num != randomInt) {
            if (num > randomInt) {
                System.out.println(num + " Es mayor que el numero secreto ");
            } else if (num < randomInt) {
                System.out.println(num + " Es menor que el numero secreto");
            }
            num = sc.nextInt();

        }
        System.out.println(num + " Es el numero secreto");
    }
}
