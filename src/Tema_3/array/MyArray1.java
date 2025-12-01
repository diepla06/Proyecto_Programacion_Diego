package Tema_3.array;

import Tema_3.MyMath;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static Tema_3.array.MyArray.*;

public class MyArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] muestra = new int[] {1,2,3,4,5,6};
        int[] muestra2 = new int[] {6,19,15,3,4,7};
        int[] muestra3;

        char opcion;
        int num;


        do {
            opcion = Character.toLowerCase(sc.next().charAt(0));


            switch (opcion) {
                case 'a':
                    printArrays(muestra);
                    break;

                case 'b':
                    int max;
                    max = maxArrays(muestra);
                    System.out.println("El numero mas alto es : " + max);
                    break;

                case 'c':
                    int min;
                    min = minArrays(muestra);
                    System.out.println("El numero mas bajo es : " + min);
                    break;

                case 'd':
                    double media;
                    media = mediaArrays(muestra);
                    System.out.println("La media de los numeros es : " + media);
                    break;


                case 'e':
                    boolean resultado;
                    System.out.println("Dime un numero y te dire si esta dentro del array");
                    num = sc.nextInt();
                    resultado = buscarArrays(muestra, num);
                    if (!resultado){
                        System.out.println("No hay ningun valor que sea " + num);
                    }else {
                        System.out.println("El numero " + num + " se ha encontrado en la array");
                    }
                    break;


                case 'f':
                    System.out.println("Voy a sumer los dos vectores");

                    muestra3 = sumaArrays(muestra, muestra2);

                    System.out.println("El primer array es : " + Arrays.toString(muestra));
                    System.out.println("El segundo array es : " + Arrays.toString(muestra2));
                    System.out.println("El resultado es : " + Arrays.toString(muestra3));
                    break;

                case 'g':
                    muestra3 = restaArrays(muestra, muestra2);

                    System.out.println("El primer array es : " + Arrays.toString(muestra));
                    System.out.println("El segundo array es : " + Arrays.toString(muestra2));
                    System.out.println("El resultado es : " + Arrays.toString(muestra3));
                    break;

                case 'h':

                    break;

                case 'i':

                    break;

                case 'j':

                    break;

                default:
                    // No se realiza ninguna acción y se muestra un mensaje de error/no válido
                    System.out.println("La opción '" + opcion + "' sirve para parar el programa. No se ejecuta ninguna tarea.");
                    System.out.println("Dime una opcion valida : ");
                    break;
            }
        } while (opcion < 'a' || opcion > 'j');
    }
}
