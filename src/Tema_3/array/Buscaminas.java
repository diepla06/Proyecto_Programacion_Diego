package Tema_3.array;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random GeneradorAleatorio = new Random(2);

        int[] tableroBuscaMinas = new int [20];
        int mina = -1;
        int ANCHO_TABLERO = 20;
    }

    public int contarBombasVecinas(int indice, int[] tableroBuscaMina, int mina, int ANCHO_TABLERO) {
        int contador = 0;

        if (indice > 0) {
            if (tableroBuscaMina[indice - 1] == mina) {
                contador++;
            }
        }

        if (indice < ANCHO_TABLERO - 1) {
            if (tableroBuscaMina[indice + 1] == mina) {
                contador++;
            }
        }

        return contador;
    }
}
