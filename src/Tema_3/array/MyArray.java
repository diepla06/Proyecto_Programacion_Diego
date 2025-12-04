package Tema_3.array;

import java.util.Arrays;

public class MyArray {


    public static void printArrays(int[] muestra) {
        int num;
        for (num = 0; num < muestra.length; num++) {
            System.out.println(muestra[num]);
        }
    }

    public static int maxArrays(int[] muestra) {

        int max = muestra[0];

        for (int i = 0; i < muestra.length; i++) {
            if (muestra[i] > max) {
                max = muestra[i];
            }
        }
        return max;
    }

    public static int minArrays(int[] muestra) {
        int min = muestra[0];

        for (int i = 0; i < muestra.length; i++) {
            if (muestra[i] < min) {
                min = muestra[i];
            }
        }
        return min;
    }

    public static double mediaArrays(int[] muestra) {
        int i;
        double media = 0;
        double suma = 0;
        for (i = 0; i < muestra.length; i++) {
            suma = suma + muestra[i];
        }
        media = suma / muestra.length;
        return media;
    }

    public static boolean buscarArrays(int[] muestra, int num) {


        boolean resultado = false;

        for (int i = 0; i < muestra.length; i++) {
            if (muestra[i] == num) {
                resultado = true;
            }
        }
        return resultado;
    }

    public static int[] sumaArrays(int[] mustra, int[] mustra2) {

        int[] mustra3 = new int[6];

        for (int i = 0; i < mustra.length; i++) {
            mustra3[i] = mustra[i] + mustra2[i];
        }
        return mustra3;
    }
    public static int[] restaArrays(int[] muestra, int[] muestra2) {

        int[] muestra3 = new int[6];

        for (int i = 0; i < muestra.length; i++) {
            muestra3[i] = muestra[i] - muestra2[i];
        }
        return muestra3;

    }
    public static int escalaArray(int[] muestra, int[] muestra2){
        int[] muestra3 = new int[6];
        int suma = 0;

        for (int i = 0; i < muestra.length; i++) {
            muestra3[i] = muestra[i] * muestra2[i];
        }
        for (int i = 0; i < muestra.length; i++){
            suma += muestra3[i] ;
        }
        return suma;
    }
    public static int[] reversaArray(int[] muestra){
       int[] reversa = new int[6];
       int pasa = 0;


       for (int i  = muestra.length -1; i >= 0 ; i--){
           reversa[pasa] = muestra[i];
           pasa ++;
       }
       return reversa;
    }

    public static void reversaArrays(int[] muestra) {
        int[] reversa = new int[6];
        int pasa = 0;

        for (int i = muestra.length -1; i >= 0 ; i--){
            reversa[pasa] = muestra[i];
            pasa ++;
        }

        System.out.println("Vamos a hacer la reversa de la siguiente array: \n" + Arrays.toString(muestra));
        System.out.println(Arrays.toString(reversa));
    }
    public static boolean capicuaArray(int[] muestra){
        for (int i = 0; i < muestra.length / 2 ; i ++)
            if (muestra[i] != muestra[muestra.length - 1 - i]){
                return false;
            }
        return true;
    }
}


