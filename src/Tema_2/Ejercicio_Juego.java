package Tema_2;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio_Juego {
    public static void main(String[] args) {
        System.out.println("Vamos a jugar a un juego el cual e creas tu personaje. \na este personaje le vas a poder dar vida, ataque, velocidad de ataque y defensa.\nLas estadisquicas son como maximo 200 y minimo 1 en total tiene que dar 500 entre todas las estadisticas.\nSi pulsas 1 elegiras tu las estadisticas y si pulsas 2 te daran una sestadisticas random.");

        Scanner sc = new Scanner(System.in);
        int personaje = sc.nextInt();
        sc.nextLine();

        Random random = new Random();
        double suma;

        String nombre1= "";
        double vida1=0;
        double ataque1=0;
        double velocidad1=0;
        double defensa1=0;

        String nombre2 = "";
        double vida2=0;
        double ataque2=0;
        double velocidad2=0;
        double defensa2=0;

        double critChance = 0.10;
        double critMult = 1.5;
        double base ;
        boolean critico;
        double multiplicador;
        double danio;



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
                    sc.nextLine();

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

                }while (suma != 500);
                System.out.println(nombre1);
                System.out.println("vida: " + vida1);
                System.out.println("ataque:  " + ataque1);
                System.out.println("velocidad: " + velocidad1);
                System.out.println("defensa: " + defensa1);

                /*
                Nombre y estadisticas del personaje 2 random.
                 */

                System.out.println("Ingrese el nombre del personaje 2: ");
                nombre2 = sc.nextLine();



                do {
                    vida2 = random.nextInt(1, 200);
                    ataque2 = random.nextInt(1, 200);
                    velocidad2 = random.nextInt(1, 200);
                    defensa2 = random.nextInt(1, 200);
                    suma = vida2 + ataque2 + velocidad2 + defensa2;

                }while (suma != 500);
                System.out.println(nombre2);
                System.out.println("vida: " + vida2);
                System.out.println("ataque:  " + ataque2);
                System.out.println("velocidad: " + velocidad2);
                System.out.println("defensa: " + defensa2);
            }
        }
        System.out.println("EMPIEZA EL COMBATE");
        System.out.println("El jugador uno tiene " + velocidad1 + " de velocidad y el jugador dos tiene " + velocidad2 + " de velocidad") ;
        do {
            System.out.println("*".repeat(300));
            if (ataque1 > 0 && ataque2 > 0){
                if (velocidad1 > velocidad2){
                    base = ataque1 * 10.00 / defensa2;
                    critico = random.nextDouble() < critChance;
                    if (critico) {
                        multiplicador = critMult;
                    } else {
                        multiplicador = 1.0;
                    }
                    danio = base * multiplicador;
                    vida2 = vida2 - danio;
                    defensa2 = vida2;
                    System.out.println("El jugador " + nombre2 + " ha recibido " + ((int) danio));
                    if (vida2 > 0) {
                        System.out.println("Vida de " + nombre2 + " = " + "█".repeat((int) vida2));
                    } else {
                        System.out.println("Vida de " + nombre2 + " = 0");
                    }



                    base = ataque2 * 10.00 / defensa1;
                    critico = random.nextDouble() < critChance;
                    if (critico) {
                        multiplicador = critMult;
                    } else {
                        multiplicador = 1.0;
                    }
                    danio = base * multiplicador;
                    vida1 = vida1 - danio;
                    defensa2 = vida2;
                    System.out.println("El jugador " + nombre1 + " ha recibido " + ((int)danio));
                    if (vida1 > 0) {
                        System.out.println("Vida de " + nombre1 + " = " + "█".repeat((int) vida1));
                    } else {
                        System.out.println("Vida de " + nombre1 + " = 0");
                    }

                }else if (velocidad2 > velocidad1) {
                    base = ataque2 * 10.00 / defensa1;
                    critico = random.nextDouble() < critChance;
                    if (critico) {
                        multiplicador = critMult;
                    } else {
                        multiplicador = 1.0;
                    }
                    danio = base * multiplicador;
                    vida1 = vida1 - danio;
                    defensa1 = vida1;
                    System.out.println("El jugador " + nombre1 + " ha recibido " + ((int)danio));
                    if (vida1 > 0) {
                        System.out.println("Vida de " + nombre1 + " = "+ "█".repeat((int) vida1));
                    } else {
                        System.out.println("Vida de " + nombre1 + " = 0");
                    }

                    base = ataque1 * 10.00 / defensa2;
                    critico = random.nextDouble() < critChance;
                    if (critico) {
                        multiplicador = critMult;
                    } else {
                        multiplicador = 1.0;
                    }
                    danio = base * multiplicador;
                    vida2 = vida2 - danio;
                    defensa2 = vida2;
                    System.out.println("El jugador " + nombre2 + " ha recibido " + ((int)danio));
                    if (vida2 > 0) {
                        System.out.println("Vida de " + nombre2 + " = "+ "█".repeat((int) vida2));
                    } else {
                        System.out.println("Vida de " + nombre2 + " = 0");
                    }
                }
            }
        }while (vida1 >0 && vida2 >0);
        if (vida1 <= 0){
            System.out.println("EL GANADOR ES " + nombre2);
        } else {
            System.out.println("EL GANADOR ES " + nombre1);
        }
    }
}
