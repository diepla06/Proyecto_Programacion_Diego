package Tema_5.Excepciones.Ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();
        int opcion = 0;

        System.out.println("SISTEMA DE GESTIÓN: EL REFUGIO");
        System.out.println("Objetivo: Registrar 5 gatos aptos para adopción.");

        while (listaGatos.size() < 5) {
            try {
                System.out.println("\nESTADO DEL REFUGIO: [" + listaGatos.size() + "/5]");
                System.out.println("1. Registrar nuevo gato");
                System.out.println("2. Ver gatos registrados");
                System.out.println("3. Salir (solo si el cupo está lleno)");
                System.out.print("Selecciona una opción: ");

                opcion = Integer.parseInt(sn.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre del gato (mín. 3 letras): ");
                        String nombre = sn.nextLine();
                        System.out.print("Edad del gato: ");
                        int edad = Integer.parseInt(sn.nextLine());


                        Gato g = new Gato(nombre, edad);
                        listaGatos.add(g);
                        System.out.println("¡Miau! Gato registrado con éxito.");
                        break;

                    case 2:
                        if (listaGatos.isEmpty()) {
                            System.out.println("El refugio está vacío actualmente.");
                        } else {
                            System.out.println("\n--- LISTA DE HUÉSPEDES ---");
                            for (Gato gato : listaGatos) {
                                gato.imprimir();
                            }
                        }
                        break;

                    case 3:
                        if (listaGatos.size() < 5) {
                            System.out.println("Aún faltan " + (5 - listaGatos.size()) + " gatos por registrar.");
                        }
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {
                System.err.println("Error: ¡La edad debe ser un número!");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        System.out.println("\n==========================================");
        System.out.println("¡CUPO LLENO! Registro completado con éxito.");
        System.out.println("Listado final de los 5 elegidos:");
        for (Gato g : listaGatos) {
            g.imprimir();
        }
        System.out.println("==========================================");

        sn.close();
    }
}
