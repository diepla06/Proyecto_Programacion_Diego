package Tema_3.array;

import java.util.Random;
import java.util.Scanner;

public class AtrapaLaMosca {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] posicionesJuego = new int[15];

        int posicionMosca = random.nextInt(posicionesJuego.length);
        int intentos = 0;
        boolean juegoTerminado = false;

        System.out.println("El juego comienza. Posiciones: 1 a " + posicionesJuego.length);

        while (!juegoTerminado) {
            intentos++;
            System.out.println("\n--- Turno " + intentos + " ---");

            int indiceJugador = -1;

            while (indiceJugador < 0 || indiceJugador >= posicionesJuego.length) {
                System.out.print("Introducir posición (1 - " + posicionesJuego.length + "): ");
                if (scanner.hasNextInt()) {
                    int posicionElegida = scanner.nextInt();
                    indiceJugador = posicionElegida - 1;

                    if (indiceJugador < 0 || indiceJugador >= posicionesJuego.length) {
                        System.out.println("Entrada fuera de rango.");
                    }
                } else {
                    System.out.println("Entrada no válida.");
                    scanner.next();
                }
            }

            if (indiceJugador == posicionMosca) {
                System.out.println("\n--- JUGADOR GANA ---");
                System.out.println("Intentos totales: " + intentos);
                juegoTerminado = true;


            } else if (Math.abs(indiceJugador - posicionMosca) == 1) {
                System.out.println("Casi. La mosca noto tu presencia.");

                posicionMosca = random.nextInt(posicionesJuego.length);
                System.out.println("Cambia de posición.");

            } else {
                System.out.println("Fallo. La mosca no se mueve.");
            }
        }
    }
}