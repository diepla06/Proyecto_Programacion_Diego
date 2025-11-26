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
        int i ;
        double media = 0;
        double suma = 0;
        for (i = 0; i < muestra.length; i++) {
            suma = suma + muestra[i];
        }
        media = suma / muestra.length;
        return media;
    }
}


