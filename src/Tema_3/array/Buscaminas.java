package Tema_3.array;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

// No se importan clases innecesarias


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();


            int TAMANO_ARRAY = 20;
            int NUMERO_MINAS = 6;
            int VALOR_MINA = -1;


            int[] tableroSecreto = new int[TAMANO_ARRAY];

            boolean[] casillasVisibles = new boolean[TAMANO_ARRAY];

            System.out.println("--- ¡BUSCAMINAS EN ARRAY! ---");
            System.out.println("Tablero: " + TAMANO_ARRAY + " casillas. Minas: " + NUMERO_MINAS);


            int minasColocadas = 0;
            while (minasColocadas < NUMERO_MINAS) {
                int posAleatoria = random.nextInt(TAMANO_ARRAY);

                // Si la posición aún no tiene mina, la colocamos
                if (tableroSecreto[posAleatoria] != VALOR_MINA) {
                    tableroSecreto[posAleatoria] = VALOR_MINA;
                    minasColocadas++;
                }
            }


            for (int i = 0; i < TAMANO_ARRAY; i++) {

                if (tableroSecreto[i] != VALOR_MINA) {
                    int contadorMinas = 0;


                    if (i > 0 && tableroSecreto[i - 1] == VALOR_MINA) {
                        contadorMinas++;
                    }


                    if (i < TAMANO_ARRAY - 1 && tableroSecreto[i + 1] == VALOR_MINA) {
                        contadorMinas++;
                    }
                    tableroSecreto[i] = contadorMinas;
                }
            }


            boolean juegoActivo = true;

            while (juegoActivo) {

                // --- MOSTRAR TABLERO JUGADOR ---
                System.out.println("\n--- Tablero Actual ---");

                // Mostrar índices (1 a 20)
                for (int i = 1; i <= TAMANO_ARRAY; i++) {
                    System.out.printf("%3d", i);
                }
                System.out.println();

                // Mostrar estado de las casillas
                for (int i = 0; i < TAMANO_ARRAY; i++) {
                    if (casillasVisibles[i]) {
                        // Si está visible, muestra el número (0, 1 o 2)
                        System.out.printf("%3d", tableroSecreto[i]);
                    } else {
                        // Si está oculta, muestra el carácter '?'
                        System.out.print(" ? ");
                    }
                }
                System.out.println("\n");


                int posicion = -1;
                while (posicion < 1 || posicion > TAMANO_ARRAY) {
                    System.out.print("Introduce una posición para destapar (1 a " + TAMANO_ARRAY + "): ");
                    if (scanner.hasNextInt()) {
                        posicion = scanner.nextInt();
                        if (posicion < 1 || posicion > TAMANO_ARRAY) {
                            System.out.println(" Posición inválida. Debe estar entre 1 y " + TAMANO_ARRAY + ".");
                        }
                    } else {
                        System.out.println(" Entrada no válida. Por favor, introduce un número.");
                        scanner.next();
                    }
                }
                int indice = posicion - 1;


                if (tableroSecreto[indice] == VALOR_MINA) {

                    System.out.println("\n ¡BOOM! Has pisado una mina en la posición " + posicion + ".");
                    juegoActivo = false; // El juego termina
                }
                else {

                    if (!casillasVisibles[indice]) {
                        casillasVisibles[indice] = true;
                        System.out.println("Casilla " + posicion + " revelada: " + tableroSecreto[indice]);
                    } else {
                        System.out.println("Esa casilla (" + posicion + ") ya estaba revelada. Elige otra.");
                    }

                    // --- VERIFICAR CONDICIÓN DE VICTORIA ---
                    int casillasNoMina = TAMANO_ARRAY - NUMERO_MINAS;
                    int casillasReveladas = 0;

                    for (int i = 0; i < TAMANO_ARRAY; i++) {
                        if (tableroSecreto[i] != VALOR_MINA && casillasVisibles[i]) {
                            casillasReveladas++;
                        }
                    }

                    if (casillasReveladas == casillasNoMina) {
                        System.out.println("\n ¡FELICIDADES! ¡HAS GANADO LA PARTIDA! ");
                        juegoActivo = false;
                    }
                }
            }
            System.out.println("\n--- Tablero Final ---");


            for (int i = 1; i <= TAMANO_ARRAY; i++) {
                System.out.printf("%3d", i);
            }
            System.out.println();


            for (int i = 0; i < TAMANO_ARRAY; i++) {
                if (tableroSecreto[i] == VALOR_MINA) {
                    System.out.print(" X ");
                } else {
                    System.out.printf("%3d", tableroSecreto[i]);
                }
            }
            System.out.println("\n");

        }
}
