package Tema_3.Strings;

import java.util.Scanner;

    public class MenuMyString {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            String utilidades = new String();

            String opcion;
            boolean salir = false;

            System.out.println("--- 💻 MENÚ DE UTILIDADES DE CADENAS (MyString) 💻 ---");

            while (!salir) {

                // 1. Mostrar Opciones
                System.out.println("\nSeleccione una función:");
                System.out.println("--------------------------------------------------------------------------------------------------");
                System.out.println("[a] - Invertir y Mayúsculas.");
                System.out.println("[b] - Contar Vocales.");
                System.out.println("[c] - Palabra de Mayor Longitud.");
                System.out.println("[d] - Contar Inclusiones de una Subcadena.");
                System.out.println("[e] - Contar Palabras.");
                System.out.println("[f] - Formatear Número de Teléfono (34555332211 -> (+34)-555-332211).");
                System.out.println("[g] - Histograma de Frecuencias de Vocales (Procedimiento).");
                System.out.println("[S] - Salir.");
                System.out.println("--------------------------------------------------------------------------------------------------");
                System.out.print("Ingrese su elección (a, b, c, d, e, f, g, S): ");

                // 2. Capturar y preparar la entrada
                opcion = scanner.nextLine().toUpperCase().trim();

                // 3. Evaluar la opción
                switch (opcion) {
                    case "A":
                        System.out.print("\n[A] Introduce una cadena para invertir y poner en mayúsculas: ");
                        String cadA = scanner.nextLine();
                        System.out.println("-> Resultado: " + Utilidades.invertirYMayusculas(cadA));
                        break;

                    case "B":
                        System.out.print("\n[B] Introduce una cadena para contar sus vocales: ");
                        String cadB = scanner.nextLine();
                        System.out.println("-> Número de vocales: " + utilidades.contarVocales(cadB));
                        break;

                    case "C":
                        System.out.print("\n[C] Introduce una frase para encontrar la palabra más larga: ");
                        String cadC = scanner.nextLine();
                        System.out.println("-> Palabra de mayor longitud: \"" + utilidades.palabraMayorLongitud(cadC) + "\"");
                        break;

                    case "D":
                        System.out.print("\n[D] Introduce la cadena principal (donde buscar): ");
                        String principalD = scanner.nextLine();
                        System.out.print("Introduce la subcadena (lo que buscar): ");
                        String subD = scanner.nextLine();
                        int veces = utilidades.contarInclusiones(principalD, subD);
                        System.out.println("-> La subcadena se incluye " + veces + " veces.");
                        break;

                    case "E":
                        System.out.print("\n[E] Introduce una frase para contar las palabras: ");
                        String cadE = scanner.nextLine();
                        System.out.println("-> Número de palabras: " + utilidades.contarPalabras(cadE));
                        break;

                    case "F":
                        System.out.print("\n[F] Introduce el número de teléfono (11 dígitos, ej: 34555332211): ");
                        String telefonoF = scanner.nextLine();
                        System.out.println("-> Formato: " + utilidades.formatearTelefono(telefonoF));
                        break;

                    case "G":
                        System.out.print("\n[G] Introduce una cadena para ver el histograma de vocales: ");
                        String cadG = scanner.nextLine();
                        // Este es un procedimiento (void), solo se llama
                        utilidades.mostrarHistogramaVocales(cadG);
                        break;

                    case "S":
                        System.out.println("\n👋 ¡Gracias! Saliendo del programa...");
                        salir = true;
                        break;

                    default:
                        System.out.println("\n🚫 ERROR: Opción no válida. Por favor, ingrese A, B, C, D, E, F, G, o S.");
                }
            }

            scanner.close();
        }
    }

