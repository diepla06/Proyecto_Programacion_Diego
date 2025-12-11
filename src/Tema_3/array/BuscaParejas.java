package Tema_3.array;

import java.util.Scanner;
import java.util.Random;

public class BuscaParejas {
    public static void main(String[] args) throws InterruptedException {
        Scanner entradaUsuario = new Scanner(System.in);
        Random generadorAleatorio = new Random();


        int[] tableroCartas = new int[20];
        int indiceLlenado = 0;

        for (int numeroPareja = 1; numeroPareja <= 10; numeroPareja++) {
            tableroCartas[indiceLlenado++] = numeroPareja;
            tableroCartas[indiceLlenado++] = numeroPareja;
        }

        for (int i = tableroCartas.length - 1; i > 0; i--) {
            int indiceAleatorio = generadorAleatorio.nextInt(i + 1);
            int temporal = tableroCartas[i];
            tableroCartas[i] = tableroCartas[indiceAleatorio];
            tableroCartas[indiceAleatorio] = temporal;
        }

        boolean[] cartaDescubierta = new boolean[20];
        int contadorParejasEncontradas = 0;

        System.out.println("El juego comienza. Encuentra 10 parejas.");


        while (contadorParejasEncontradas < 10) {

            System.out.println("\n--- ESTADO DEL TABLERO ---");
            for (int i = 0; i < tableroCartas.length; i++) {
                System.out.print("(" + (i + 1) + ")");
                if (cartaDescubierta[i]) {
                    System.out.print(tableroCartas[i] + " ");
                } else {
                    System.out.print("X ");
                }
                if ((i + 1) % 5 == 0) {
                    System.out.println();
                }
            }

            System.out.println("\nSelecciona dos posiciones (1-20):");

            int posicion1 = -1;
            while (posicion1 < 0 || posicion1 >= 20 || cartaDescubierta[posicion1]) {
                System.out.print("Posición 1: ");
                if (entradaUsuario.hasNextInt()) {
                    posicion1 = entradaUsuario.nextInt() - 1;
                    if (posicion1 < 0 || posicion1 >= 20 || cartaDescubierta[posicion1]) {
                        System.out.println("Posición no válida, fuera de rango o ya visible.");
                    }
                } else {
                    System.out.println("Entrada no válida.");
                    entradaUsuario.next();
                }
            }

            int posicion2 = -1;
            while (posicion2 < 0 || posicion2 >= 20 || posicion2 == posicion1 || cartaDescubierta[posicion2]) {
                System.out.print("Posición 2: ");
                if (entradaUsuario.hasNextInt()) {
                    posicion2 = entradaUsuario.nextInt() - 1;
                    if (posicion2 < 0 || posicion2 >= 20 || posicion2 == posicion1 || cartaDescubierta[posicion2]) {
                        System.out.println("Posición no válida, ya visible o igual a la primera.");
                    }
                } else {
                    System.out.println("Entrada no válida.");
                    entradaUsuario.next();
                }
            }

            int valorCarta1 = tableroCartas[posicion1];
            int valorCarta2 = tableroCartas[posicion2];

            System.out.println("\n--- REVELACIÓN ---");
            for (int i = 0; i < tableroCartas.length; i++) {
                System.out.print("(" + (i + 1) + ")");
                if (cartaDescubierta[i] || i == posicion1 || i == posicion2) {

                    System.out.print(tableroCartas[i] + " ");
                } else {
                    System.out.print("X ");
                }

            }
            System.out.println("...");



            if (valorCarta1 == valorCarta2) {
                System.out.println("¡Pareja encontrada! Se quedan visibles.");
                cartaDescubierta[posicion1] = true;
                cartaDescubierta[posicion2] = true;
                contadorParejasEncontradas++;
            } else {
                System.out.println("No son pareja. Ocultando cartas inmediatamente.");

                Thread.sleep(5000);

                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n--- JUEGO TERMINADO ---");
        System.out.println("Has encontrado las 10 parejas.");
    }
}
