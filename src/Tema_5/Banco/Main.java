package Tema_5.Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColaBanco miBanco = new ColaBanco();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- SISTEMA DE TURNOS BANCARIOS ---");
            System.out.println("1. Nuevo cliente (cola)");
            System.out.println("2. Atender siguiente");
            System.out.println("3. Cliente abandona la cola");
            System.out.println("4. Ver estado de la cola");
            System.out.println("5. Salir");
            System.out.print("Selecciona: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Nombre: "); String n = sc.nextLine();
                        System.out.print("Edad: "); int e = Integer.parseInt(sc.nextLine());
                        System.out.print("DNI: "); String d = sc.nextLine();
                        miBanco.anadirPersona(new Usuario(n, e, d));
                    }
                    case 2 -> {
                        Usuario atendido = miBanco.atenderSiguiente();
                        if (atendido != null) System.out.println("Atendiendo a: " + atendido.getNombre());
                        else System.out.println("No hay nadie en la cola.");
                    }
                    case 3 -> {
                        System.out.print("DNI del cliente que se va: ");
                        String dni = sc.nextLine();
                        if (miBanco.abandonarCola(dni)) System.out.println("Cliente retirado.");
                        else System.out.println("Error: No se encontró ese DNI en la cola.");
                    }
                    case 4 -> miBanco.mostrarCola();
                }
            } catch (Exception e) {
                System.err.println("Entrada no válida.");
            }
        } while (opcion != 5);
    }
}