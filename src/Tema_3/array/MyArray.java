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

        for (int i = 1; i < muestra.length; i++) {
            if (muestra[i] > max) {
                max = muestra[i];
            }
        }
        return max;
    }

    public static int minArrays(int[] muestra) {
        int min = muestra[0];

        for (int i = 1; i < muestra.length; i++) {
            if (muestra[i] < min) {
                min = muestra[i];
            }
        }
        return min;
    }

    public static int mediaArrays(int[] muestra) {
        int media = muestra[0];
        int suma = 0;
        for (int i = 1; i < muestra.length; i++) {
            suma = suma + muestra[i];
        }
        media = suma / muestra.length;
        return media;
    }
}


