package Tema_2;

import java.util.Scanner;

/*
Haz un programa que encuentre e imprima por consola los 20 primeros
números primos.
 */
public class T2E27 {
    public static void main(String[] args) {
        System.out.println("Te voy a decir los 20 primeros numeros primos");

        int num = 2;
        int contador = 20;

        while (contador == 20) {
            boolean primo = true;
            for (int a = 2; a <= Math.sqrt(num); a++) {
                if (num % a == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println(num);
                contador++;
            }
            num++;
        }
    }
}