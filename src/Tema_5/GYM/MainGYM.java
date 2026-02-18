package Tema_5.GYM;
import java.util.Scanner;

public class MainGYM {
    public static void main(String[] args) {
        Gimnasio miGym = new Gimnasio();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\nAPP GESTIÓN GIMNASIO");
            System.out.println("1. Alta | 2. Baja | 3. Buscar | 4. Modificar | 5. Salir");
            System.out.print("Opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> {
                        System.out.print("DNI: "); String dni = sc.nextLine();
                        System.out.print("Nombre: "); String nom = sc.nextLine();
                        System.out.print("Edad: "); int edad = Integer.parseInt(sc.nextLine());
                        if (miGym.darAlta(dni, nom, edad)) System.out.println("¡Éxito!");
                        else System.out.println("Error: El DNI ya existe.");
                    }
                    case 2 -> {
                        System.out.print("DNI a borrar: ");
                        if (miGym.darBaja(sc.nextLine())) System.out.println("Eliminado.");
                        else System.out.println("Error: No encontrado.");
                    }
                    case 3 -> {
                        System.out.print("DNI a buscar: ");
                        Usuraio u = miGym.buscar(sc.nextLine());
                        System.out.println(u != null ? u : "Error: No encontrado.");
                    }
                    case 4 -> {
                        System.out.print("DNI a modificar: "); String dni = sc.nextLine();
                        System.out.print("Nuevo nombre (vacío para saltar): "); String nom = sc.nextLine();
                        System.out.print("Nueva edad (0 para saltar): "); int ed = Integer.parseInt(sc.nextLine());
                        if (miGym.modificar(dni, nom, ed)) System.out.println("Actualizado.");
                        else System.out.println("Error: No se pudo modificar.");
                    }
                }
            } catch (Exception e) {
                System.err.println("Error de entrada. Inténtalo de nuevo.");
            }
        } while (opcion != 5);
    }
}
