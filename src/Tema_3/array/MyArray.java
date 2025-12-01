package Tema_3.array;

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
        for (int b = 0; b < muestra.length; b++){
            suma += muestra3[b] ;
        }
        return suma;
    }
}


