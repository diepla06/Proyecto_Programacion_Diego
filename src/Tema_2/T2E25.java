package Tema_2;

import java.util.Scanner;

/*
Haz un programa que pide un número entero por consola y calcula el
factorial. Por ejemplo el factorial de 5 es: 5! = 5 * 4 * 3 * 2 * 1
 */
public class T2E25 {
    public static void main(String[] args) {
        System.out.println("Dime un numero y te hare el factorial");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int cont = 1;

        if (num < 0){
            System.out.println("No existen los factoriales de numeros negativos");
        }else{
            while (num != 0) {
                cont = cont * num;
                num --;
            }
            System.out.println("El factorial es " + cont);
        }
    }
}
