package Tema_3;

import java.util.Scanner;

import static Tema_3.T3E1.numberSign;
import static Tema_3.T3E3.calculateCircleArea;
import static Tema_3.T3E3.calculateCirclePerimeter;
import static Tema_3.T3E4.*;
import static Tema_3.T3E5.tablaMultiplicar;
import static Tema_3.T3E8.diaMesAnyo;
import static Tema_3.T3E9.piramide;

public class T3E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char eleccion;

        System.out.println("Dime en que programa quieres meterte");
        System.out.println("a) Muestra el signo de un número introducido por el usuario.\n" +
                "b) Indica si el usuario es mayor de edad o no.\n" +
                "c) Calcula el área y perímetro de un círculo.\n" +
                "d) Conversor de euros a dólares y de dólares a euros.\n" +
                "e) Mostrar tabla de multiplicar de un número.\n" +
                "f) Mostrar tablas de multiplicar del 1 al 10.\n" +
                "g) Comprobador de números primos.\n" +
                "h) Comprobador de fechas.\n" +
                "i) Dibujar triángulos.");

        eleccion = sc.next().charAt(0);

        while (eleccion != 'a' && eleccion != 'b' && eleccion != 'c' && eleccion != 'd' && eleccion != 'e' && eleccion != 'f' && eleccion != 'g' && eleccion != 'h' && eleccion != 'i'){
            System.out.println("Dime un valor correcto");
            eleccion = sc.next().charAt(0);
        }

        switch (eleccion) {
            case 'a':
                System.out.println("Dime un numero y te digo si es mayor, menor o igual a 0");

                int num = sc.nextInt();

                int result = numberSign(num);
                if (result == 0){
                    System.out.println("El numero es 0");
                }else if (result == 1){
                    System.out.println("El numero es mayor que 0");
                }else if (result == -1){
                    System.out.println("El numero es menor que 0");
                }
                break;
            case 'b':
                numberSign(3);

                System.out.println("Dime tu edad");
                int age = sc.nextInt();

                boolean edad = T3E2.isAdult(age);
                if (edad){
                    System.out.println("Eres mayor de edad");
                }else {
                    System.out.println("Eres menor de edad");
                }
                break;
            case 'c':
                double perimetro;
                double area;

                System.out.println("Dime un radio mayor a 0");
                double radio = sc.nextDouble();

                boolean valido =  T3E3.validRadius(radio);
                if (valido == false){
                    System.out.println("Este numero no es valido");
                }else {
                    perimetro = calculateCirclePerimeter(radio);
                    area = calculateCircleArea(radio);

                    System.out.println("El perimetro es " + perimetro + "\n El area es " + area );
                }
                break;
            case 'd':
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
                break;
            case 'e':
                int numero;

                System.out.println("Dime un numero entero del 1 al 10 y te digo su tabla de multiplicar");
                numero = sc.nextInt();

                if(numero < 1 || numero > 10){
                    System.out.println("Ese numero no esta entre el 1 y el 10");
                }else {
                    tablaMultiplicar(numero);
                }
                break;
            case 'f':
                System.out.println("Te digo todas las tablas del 1 al 10");
                numero = 1;
                int i = 1;
                for(numero = 1; numero < 11 ; numero++) {
                    T3E5.tablaMultiplicar(numero);
                }
                break;
            case 'g':

                boolean primo;

                System.out.println("Dime numeros y yo te dire si es primo o no, en el caso de que me pongas el 0, se terminara el programa");
                num = sc.nextInt();

                while (num != 0){
                    //comprobarsies positivo (clculo primo),y si esnegativo(digo quenoes correcto)
                    primo = T3E7.primo(num);
                    if (primo){
                        System.out.println(num + " es primo");
                    }else {
                        System.out.println(num + " no es primo");
                    }
                    System.out.println("Dime otro numero positivo o 0 para finalizar");
                    num = sc.nextInt();
                }
                System.out.println("Finalizando programa...");
                break;
            case 'h':
                int dia;
                int mes;
                int anyo;


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
                break;
            case 'i':
                int line;
                char caracter;

                System.out.println("Dime las lineas que quieres que tenga");
                line = sc.nextInt();

                System.out.println("Dime que caracter quieres que tenga");
                caracter = sc.next().charAt(0);

                piramide(line,caracter);
                break;
        }
    }
}
