package Tema_3.array;

import java.util.Scanner;
import java.util.Arrays;

public class SimulacionesWifi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] coberturas = new int[20];

        int habitacionSeleccionada = -1;
        int potenciaRouter = -1;

        while (habitacionSeleccionada < 1 || habitacionSeleccionada > 20) {
            System.out.print("Introducir número de habitación para el router (1-20): ");
            if (scanner.hasNextInt()) {
                habitacionSeleccionada = scanner.nextInt();
                if (habitacionSeleccionada < 1 || habitacionSeleccionada > 20) {
                    System.out.println("Habitación fuera de rango.");
                }
            } else {
                System.out.println("Entrada no válida.");
                scanner.next();
            }
        }

        while (potenciaRouter < 1 || potenciaRouter > 6) {
            System.out.print("Introducir potencia de transmisión (1-6): ");
            if (scanner.hasNextInt()) {
                potenciaRouter = scanner.nextInt();
                if (potenciaRouter < 1 || potenciaRouter > 6) {
                    System.out.println("Potencia fuera de rango.");
                }
            } else {
                System.out.println("Entrada no válida.");
                scanner.next();
            }
        }

        int indiceRouter = habitacionSeleccionada - 1;

        coberturas[indiceRouter] = potenciaRouter;

        for (int i = 1; i < potenciaRouter; i++) {
            int indiceDerecha = indiceRouter + i;
            int potencia = potenciaRouter - i;

            if (indiceDerecha < coberturas.length) {
                coberturas[indiceDerecha] = potencia;
            }
        }

        for (int i = 1; i < potenciaRouter; i++) {
            int indiceIzquierda = indiceRouter - i;
            int potencia = potenciaRouter - i;

            if (indiceIzquierda >= 0) {
                coberturas[indiceIzquierda] = potencia;
            }
        }

        System.out.println("\n--- SIMULACIÓN FINALIZADA ---");
        System.out.println(Arrays.toString(coberturas));


    }
}

