package Tema_3;

import java.io.InputStream;
import java.util.Scanner;

public class T3E8 {
    public static boolean diaMesAnyo(int dia, int mes, int anyo){
        if ((dia < 1 || dia > 31) || (mes < 1 || mes > 12)){
            return false;
        }else{
            return true;
        }
        //añademe febrero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anyo;
        boolean valido;

        System.out.println("Dime un dia mes y año y te dire si es valido o no");
        System.out.println("Dime el dia DD");
        dia = sc.nextInt();

        System.out.println("Dime el dia MM");
        mes = sc.nextInt();

        System.out.println("Dime el dia AA");
        anyo = sc.nextInt();

        valido = diaMesAnyo(dia, mes, anyo);

        if (valido == true){
            System.out.println("La facha nombrada es valida");
        }else {
            System.out.println("La fecha nombrada no es valida");
        }
    }

}
