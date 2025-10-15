package Tema_2;

import javax.swing.*;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class T2E16 {
    public static void main(String[] args){
        System.out.println("Quieres pasar de euros a dolares pulse E, quieres pasar de dolares a euros pulse D");
        Scanner sc = new Scanner(System.in);

        char opcion = sc.next().charAt(0);

        switch (opcion){

            case 'E':
                  System.out.println("Dime los euros que tengas, te los voy a pasar a dolares");
                  double euros = sc.nextDouble();
                  double conversion = euros * 1.17;
                  System.out.println(conversion + "$");

            case 'D':
                    System.out.println("Dime los dolares que tengas, te los voy a pasar a euros");
                    double dolares = sc.nextDouble();
                    double conversion2 = dolares * 0.86;
                    System.out.println(conversion2 + "€");

            default:
                System.out.println("Ese valor no es ni E mayuscula, ni D mayuscula");
        }

    }
}
