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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double valor;
        double dolar;
        double euro;
        int elecion;

        System.out.println("Dime el valor que quieres transformar");
        valor = sc.nextDouble();

        System.out.println("Sy quieres pasar a dolares pulse 1, si quiere pasar a euros pulse 2");
        elecion = sc.nextInt();

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
