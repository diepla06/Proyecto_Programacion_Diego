package Tema_3.array;

import java.util.Arrays;
import java.util.Scanner;

import static Tema_3.array.MyArray.*;

public class MyArray1 {
    public static void main(String[] args) {

        int[] muestra = new int[] {1,2,3,4,5,6};
        printArrays(muestra);

        int max;
        max = MyArray.maxArrays(muestra);
        System.out.println("El numero mas alto es : " + max);

        int min;
        min = MyArray.minArrays(muestra);
        System.out.println("El numero mas bajo es : " + min);

        double media;
        media = MyArray.mediaArrays(muestra);
        System.out.println("La media de los numeros es : " + media);

        boolean resultado;
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te dire si esta dentro del array");
        num = sc.nextInt();

        resultado = MyArray.buscarArrays(muestra, num);
        if (!resultado){
            System.out.println("No hay ningun valor que sea " + num);
        }else {
            System.out.println("El numero " + num + " se ha encontrado en la array");
        }

        int vector1;
        int vector2;
        int[] muestra2 = new int[] {6,19,15,3,4,7};
        int[] muestra3 = new int[6];
        System.out.println("Voy a sumer los dos vectores");


    }
}
