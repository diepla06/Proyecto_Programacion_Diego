package Tema_2;

import java.util.Scanner;

public class T2E15 {
    public static void main(String[] args) {
        System.out.println("Dime un mes y un año y tedire cuantos dias tiene es mes");
        Scanner sc = new Scanner(System.in);

        int mes = sc.nextInt();
        int anio = sc.nextInt();
        int dias = 0;

        boolean bisiesto = (anio % 4 == 0) && (anio % 100 != 0 || anio % 400 == 0);


        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
             dias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
             dias = 30;
        } else if (mes == 2) {
            if (bisiesto) {
                 dias = 29;
            } else {
                 dias = 28;
            }
        } else {
            System.out.println("Mes inválido");
        }

        System.out.println(dias + " dias.");
    }
}
