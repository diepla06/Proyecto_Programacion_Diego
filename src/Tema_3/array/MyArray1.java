package Tema_3.array;

import java.util.Arrays;

import static Tema_3.array.MyArray.*;

public class MyArray1 {
    public static void main(String[] args) {

        int[] muestra = new int[] {1,2,3,4,5,6};
        printArrays(muestra);

        int max;
        max = MyArray.maxArrays(muestra);

        minArrays(muestra);
        
    }
}
