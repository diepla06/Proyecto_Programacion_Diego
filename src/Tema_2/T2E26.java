package Tema_2;

import java.util.Scanner;

/* Haz un programa que pida un número entero por consola e indica si es
primo o no. Un número primo sólo es divisible por él mismo y por la
unidad.
 */
public class T2E26 {
    public static void main(String[] args){
        System.out.println("Dime un numero y te dire si es primo o no");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        if (num > 0){
            boolean result = num % 3 == 0;
            result = num % 3 == 0;
            result = num % 5 == 0;
            System.out.println("El numero " + num + " no es un numero  primo");
        }else if (num <= 0){
            System.out.println("Ese numero " + num + " no es un numero primo");
        }else {
            System.out.println("el numero " + num + " es un numero primo");
        }
    }
}
