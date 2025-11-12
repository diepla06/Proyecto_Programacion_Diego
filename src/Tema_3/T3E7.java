package Tema_3;

import java.util.Scanner;

public class T3E7 {
    public static boolean primo(int num) {
        boolean primo = true;
        if (num <= 1) {
            return false;
        } else {
            for (int a = 2; a <= Math.sqrt(num); a++) {
                if (num % a == 0) {
                    primo = false;
                    break;
                }
            }
            return primo;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        boolean primo;

        System.out.println("Dime numeros y yo te dire si es primo o no, en el caso de que me pongas el 0, se terminara el programa");
        num = sc.nextInt();

        while (num != 0){
            //comprobarsies positivo (clculo primo),y si esnegativo(digo quenoes correcto)
            primo = primo(num);
            if (primo){
                System.out.println(num + " es primo");
            }else {
                System.out.println(num + " no es primo");
            }
            System.out.println("Dime otro numero positivo o 0 para finalizar");
            num = sc.nextInt();
        }
        System.out.println("Finalizando programa...");
    }

}
