package Tema_5.Excepciones.Ejercicio6;

import java.util.Scanner;

public class MainGato {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Gato miGato = null;
        int opcion = 0;

        System.out.println(" BIENVENIDO AL GESTOR DE GATOS ");

        do {
            try {
                System.out.println("\nMenú Principal");
                System.out.println("1. Crear nuevo Gato");
                System.out.println("2. Cambiar nombre");
                System.out.println("3. Cambiar edad");
                System.out.println("4. Mostrar info del Gato");
                System.out.println("5. Salir");
                System.out.print("Elige una opción: ");

                opcion = Integer.parseInt(sn.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el nombre: ");
                        String nom = sn.nextLine();
                        System.out.print("Introduce la edad: ");
                        int ed = Integer.parseInt(sn.nextLine());
                        miGato = new Gato(nom, ed);
                        System.out.println("¡Gato creado con éxito!");
                        break;

                    case 2:
                        validarExistencia(miGato);
                        System.out.print("Nuevo nombre: ");
                        miGato.setNombre(sn.nextLine());
                        System.out.println("Nombre actualizado.");
                        break;

                    case 3:
                        validarExistencia(miGato);
                        System.out.print("Nueva edad: ");
                        miGato.setEdad(Integer.parseInt(sn.nextLine()));
                        System.out.println("Edad actualizada.");
                        break;

                    case 4:
                        validarExistencia(miGato);
                        miGato.imprimir();
                        break;

                    case 5:
                        System.out.println("¡Adiós!");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (NumberFormatException e) {
                System.err.println("Error: ¡Debes introducir un número válido!");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } while (opcion != 5);

        sn.close();
    }

    private static void validarExistencia(Gato g) throws Exception {
        if (g == null) {
            throw new Exception("Error: Primero debes crear un gato (Opción 1).");
        }
    }
}
