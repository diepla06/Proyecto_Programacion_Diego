package Tema_2;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_Juego {
    public static void main(String[] args) {
        System.out.println("Vamos a jugar a un juego el cual e creas tu personaje. \na este personaje le vas a poder dar vida, ataque, velocidad de ataque y defensa.\nLas estadisquicas son como maximo 200 y minimo 1 en total tiene que dar 500 entre todas las estadisticas.\nSi pulsas 1 elegiras tu las estadisticas y si pulsas 2 te daran una sestadisticas random.");

        Scanner sc = new Scanner(System.in);
        int personaje = sc.nextInt();
        Random random = new Random();
        int suma;

        String nombre1;
        int vida1=0;
        int ataque1=0;
        int velocidad1=0;
        int defensa1=0;

        String nombre2;
        int vida2=0;
        int ataque2=0;
        int velocidad2=0;
        int defensa2=0;

        while (personaje != 1 && personaje !=2) {
            System.out.println("Recuerda que solo puedes elegir 1 para elegir tu las estadisticas o 2 para que se hagan random");
            personaje = sc.nextInt();
        }
        switch (personaje) {

            case 1: {
                /*
                Nombre y estadisticas del personaje 1 elegidas por el usuario.
                 */
                System.out.println("Ingrese el nombre del personaje 1: ");

                nombre1 = sc.nextLine();
                vida1 = sc.nextInt();
                ataque1 = sc.nextInt();
                velocidad1 = sc.nextInt();
                defensa1 = sc.nextInt();

                System.out.println(nombre1);
                System.out.println("vida: " + vida1);
                System.out.println("ataque:  " + ataque1);
                System.out.println("velocidad: " + velocidad1);
                System.out.println("vida: " + defensa1);

                /*
                Nombre y estadisticas del personaje 2 elegidas por el usuario.
                 */

                System.out.println("Ingrese el nombre del personaje 2: ");

                    nombre2 = sc.nextLine();
                    vida2 = sc.nextInt();
                    ataque2 = sc.nextInt();
                    velocidad2 = sc.nextInt();
                    defensa2 = sc.nextInt();

                System.out.println(nombre2);
                System.out.println("vida: " + vida2);
                System.out.println("ataque:  " + ataque2);
                System.out.println("velocidad: " + velocidad2);
                System.out.println("vida: " + defensa2);
            }
            case 2: {
                /*
                Nombre y estadisticas del personaje 1 random.
                 */
                System.out.println("Ingrese el nombre del personaje 1: ");
                nombre1 = sc.nextLine();



                do {
                    vida1 = random.nextInt(1, 200);
                    ataque1 = random.nextInt(1, 200);
                    velocidad1 = random.nextInt(1, 200);
                    defensa1 = random.nextInt(1, 200);
                    suma = vida1 + ataque1 + velocidad1 + defensa1;

                }while ((suma == 500) && ((vida1 < 0 && vida1 > 201) || (ataque1 < 0 && ataque1 > 201) || (velocidad1 < 0 && velocidad1 > 201) || (defensa1 < 0 && defensa1 > 201)));

                System.out.println(nombre1);
                System.out.println("vida: " + vida1);
                System.out.println("ataque:  " + ataque1);
                System.out.println("velocidad: " + velocidad1);
                System.out.println("vida: " + defensa1);
                System.out.println("La suma de las stats es: " + suma);
                /*
                Nombre y estadisticas del personaje 2 random.
                 */

                System.out.println("Ingrese el nombre del personaje 2: ");
                nombre2 = sc.nextLine();

                while ((vida2 > 0 && vida2 < 200) || (ataque2 > 0 && ataque2 < 200) || (velocidad2 > 0 && velocidad2 < 200) || (defensa2 > 0 && defensa2 < 200)) {
                    vida2 = random.nextInt(1, 200);
                    ataque2 = random.nextInt(1, 200);
                    velocidad2 = random.nextInt(1, 200);
                    defensa2 = random.nextInt(1, 200);
                }

                System.out.println(nombre2);
                System.out.println("vida: " + vida2);
                System.out.println("ataque:  " + ataque2);
                System.out.println("velocidad: " + velocidad2);
                System.out.println("vida: " + defensa2);
            }
        }
    }
}
