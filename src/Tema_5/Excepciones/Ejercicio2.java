package Tema_5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int resultado;

       try {
            System.out.println("Dime dos valores y los divido.");
            System.out.print("Valor 1: ");
            num1 = sc.nextInt();
            System.out.print("Valor 2: ");
            num2 = sc.nextInt();

            resultado = num1 / num2;

           System.out.println("El resultado es " + resultado);

        }catch (InputMismatchException exInp){
           System.out.println("Valor introducido incorrecto // ERROR: " + exInp.getMessage());
       }catch (ArithmeticException exAri){
           System.out.println(num1 + "/" + num2 + "=" + "0" + " // ERROR: " + exAri.getMessage());
       }
    }
}
