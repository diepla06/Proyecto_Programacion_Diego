package Tema_2;

import java.util.Scanner;

public class T2E20 {
    public static void main(String[] args){
        System.out.println("Dime dos numeros si B es mayor a A te dire todos los numeros impares entre ellos");
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B){
            System.out.println("A es mayor a B");
        }else if(A < B){

            while (A < B) {
                //
                boolean impar = A % 2 == 1;

                if (impar == true) {
                    System.out.println(A);
                }
                A++;
            }
        }else {
            System.out.println("A es igual a B");
        }
    }
}
