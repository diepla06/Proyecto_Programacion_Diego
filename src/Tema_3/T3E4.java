package Tema_3;

import java.util.Scanner;

public class T3E4 {
    public static double euro2dolar(double valor){
        double dolar = valor * 1.16;
        return dolar;
    }

    public static double dolar2euro(double valor){
        double euro = valor * 0.86;
        return euro;
    }

    public static void showMenu(){
        System.out.println("Esta aplicacion pasa de dolares a euros y de auros a dolares");
        System.out.println("Si quieres pasar de dolara euros, pulsa 1 \n Si quieres pasar de euros a dolares, pulsa 2");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor;
        double dolar;
        double euro;
        int elecion;


        showMenu();
        elecion = sc.nextInt();

        System.out.println("Dime el valor que quieres transformar");
        valor = sc.nextDouble();

        switch (elecion){
            case 1:
                dolar = euro2dolar(valor);
                System.out.println("En dolares es " + dolar);

                break;
            case 2:
                euro = dolar2euro(valor);
                System.out.println("En euros es " + euro);

                break;
        }

    }

}
