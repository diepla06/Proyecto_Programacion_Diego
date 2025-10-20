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

            boolean primo = true;
            for (int a = 2; a <= Math.sqrt(num); a++) {
                if (num % a == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                System.out.println("El numero introducido es primo");
            }else{
                System.out.println("El numero introducido no es primo");
            }


    }
}
