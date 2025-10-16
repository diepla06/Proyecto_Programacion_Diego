package Tema_2;

import java.util.Scanner;

/*22. Realiza un programa que lea por consola un número entero e indique
cuántas cifras tiene. Pista: usa varias divisiones entre 10*/
public class T2E22 {
    public static void main(String[] args){
        System.out.println("Dime un numero entero y yo te dire cuantas cifras tiene");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cont = 1;
        int cifra = 1;
        while (num > cifra) {
            cifra = cifra*10;
            cont++;
        }
        System.out.println("El numero que me has dicho tiene estas cifras " + cont);

    }
}
