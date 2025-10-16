package Tema_2;

import java.util.Scanner;

/*
Haz un programa que encuentre e imprima por consola los 20 primeros
números primos.
 */
public class T2E27 {
    public static void main(String[] args){
        System.out.println("Te voy a decir los 20 primeros numeros primos");

        int num = 1;
        int contador = 20;

       while (contador == 20) {
           contador++;
             if (num > 0) {
                  boolean result = num % 2 == 0;
                  result = num % 3 == 0;
                  result = num % 5 == 0;

                   System.out.println("El numero " + num + " no es un numero  primo");
              } else {
                   System.out.println("el numero " + num + " es un numero primo");
              }
        num ++;
       }
    }
}
