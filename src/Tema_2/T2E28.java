package Tema_2;

/*
Haz un programa que calcule un número aleatorio de la lotería de
Navidad (de 0 a 99.999) y después pida al usuario por consola hasta 5
números indicando cada vez si ha ganado la lotería o no
 */

import java.util.Random;
import java.util.Scanner;

public class T2E28 {
    public static void main(String[] args){
        Random random = new Random();
        int randomInt = random.nextInt(10000 , 99999);

        System.out.println("Dime un numero del 0 al 99.999");
        Scanner sc = new Scanner(System.in);

        int cont;
        for (cont = 4;cont > -1;cont-- ) {
            int num = sc.nextInt();
            if ((10000 <= num) && (num <= 99999)) {
                if (num == randomInt){
                    System.out.println("Enorabuena es el numero premiado ");
                    System.exit(1);
                }else {
                    System.out.println("Intentalo de nuevo te quedan " + cont + " intentos");
                }
            } else {
                System.out.println("Ese numero no esta entre el 0 y el 99.999");
            }
        }
    }
}
