package Tema_2;

import java.util.Scanner;


public class T2E24 {
    public static void main(String[] args) {
        System.out.println("Inreoduce las notas cuando quieras acabar el programa pon -1");
        Scanner sc = new Scanner(System.in);
        int nota = sc.nextInt();
        int susp = 0;
        int apro = 0;

        while (nota != -1) {
            if (nota > 0 && nota < 10){
                if (nota < 5) {
                    susp++;
                } else {
                    apro++;
                }
            }else{
                System.out.println("Esa nota no esta entre el uno y el 10");
            }
            nota = sc.nextInt();
        }
        System.out.println("hay " + apro + " aprobados y " + susp + " suspendidos");
    }
}
