package Tema_4.Ejercicio3;

import java.util.Scanner;

public class MainHorda {
    public static void main(String[] args) throws InterruptedException {
                Scanner sc = new Scanner(System.in);

                System.out.print("Nombre de tu Héroe: ");
                String nombre = sc.nextLine();
                Hero jugador = new Hero(nombre, 1, 150, 150, 0, 20, 5);

                int contadorHordas = 0;

                //BUCLE DEL JUEGO
                while (jugador.getHealth() > 0) {
                    contadorHordas++;

                    Thread.sleep(1000);

                    System.out.println("\n=== LLEGA LA HORDA " + contadorHordas + " ===");

                    int numEnemigos = (int)(Math.random() * 3) + 1; // 1 a 3
                    System.out.println("¡Aparecen " + numEnemigos + " enemigos débiles!");

                    Hero[] enemigos = new Hero[numEnemigos];


                    for (int i = 0; i < enemigos.length; i++) {
                        enemigos[i] = new Hero("Goblin " + (i+1), 1, 30, 30, 0, 5, 1);
                    }

                    //PELEA DE LA HORDA
                    boolean quedanEnemigos = true;

                    while (jugador.getHealth() > 0 && quedanEnemigos) {


                        for (int i = 0; i < enemigos.length; i++) {
                            if (enemigos[i] != null) { //
                                if (Math.random() < 0.1) {
                                    System.out.println("💨 " + enemigos[i].getName() + " huye del miedo.");
                                    enemigos[i] = null; // Desaparece del array
                                }
                            }
                        }


                        boolean atacaste = false;
                        for (int i = 0; i < enemigos.length; i++) {
                            if (enemigos[i] != null) {
                                jugador.attack(enemigos[i]);


                                if (enemigos[i].getHealth() <= 0) {
                                    System.out.println("💀 " + enemigos[i].getName() + " ha muerto.");
                                    enemigos[i] = null;
                                }
                                atacaste = true;
                                break;
                            }
                        }


                        if (!atacaste) {
                            quedanEnemigos = false;
                        }


                        quedanEnemigos = false;
                        for (int i = 0; i < enemigos.length; i++) {
                            if (enemigos[i] != null) {
                                enemigos[i].attack(jugador);
                                quedanEnemigos = true;
                            }
                        }

                        System.out.println(">> Tu Vida: " + jugador.getHealth());
                    }

                    //AL ACABAR LA HORDA
                    if (jugador.getHealth() > 0) {
                        if (Math.random() < 0.001) jugador.rest();
                        if (Math.random() < 0.10) jugador.drinkPotion();
                    }
                }

                System.out.println("\nGAME OVER - Has sobrevivido a " + (contadorHordas - 1) + " hordas.");


    }
}
