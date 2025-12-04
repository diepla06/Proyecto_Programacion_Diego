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

        System.out.println("\n--- MENU ---\n");
        System.out.println("a. Imprimir Array");
        System.out.println("b. Numero macimo de el Array");
        System.out.println("c. Numero minimo de el Array");
        System.out.println("d. Media de el Array");
        System.out.println("e. Te digo si el numero existe en el Array");
        System.out.println("f. Funcion que hace la suma de dos vectores");
        System.out.println("g. Funcion que hace la resta de dos vectores");
        System.out.println("h. Funcion que hace el producto escalar de dos vectores");
        System.out.println("i. Inversor de orden de el Array");
        System.out.println("j. Procedimiento de inversor de array");
        System.out.println("k. Te digo si el Array es capicua");
        System.out.println("\n--- EXIT ---\n //--Cualquier otro caracter--//");
        
        System.out.println("Dime una letra");

        boolean volver = true;
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
                    int resultado2;
                    resultado2 = escalaArray(muestra, muestra2);

                    System.out.println("El primer array es : " + Arrays.toString(muestra));
                    System.out.println("El segundo array es : " + Arrays.toString(muestra2));
                    System.out.println("El resultado es : " + resultado2);
                    break;

                case 'i':
                    int[] reversa = MyArray.reversaArray(muestra);

                    System.out.println("Vamos a hacer la reversa de la siguiente array: \n" + Arrays.toString(muestra));
                    System.out.println(Arrays.toString(reversa));
                    break;

                case 'j':
                    MyArray.reversaArrays(muestra);
                    break;

                case 'k':
                boolean capicua= MyArray.capicuaArray(muestra);

                if (capicua){
                    System.out.println("El array es capicua");
                }else{
                    System.out.println("el array no es capicua");
                }
                break;

                default:
                    // No se realiza ninguna acción y se muestra un mensaje de error/no válido
                    System.out.println("La opción '" + opcion + "' sirve para parar el programa. No se ejecuta ninguna tarea.");
                    System.out.println("Si no quieres que el programa se apague dime un valor valido, si no vuelve a presionar un valor no valido");
                    System.out.println("Dime una opcion valida : ");
                    sc.nextLine();
                    opcion = sc.next().charAt(0);
                    
                    if (opcion < 'a' || opcion > 'j'){
                        boolean b = !volver;
                    }
                    break;
            }
        } while (!volver);
    }
}
