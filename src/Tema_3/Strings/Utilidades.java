package Tema_3.Strings;

import java.util.HashMap;
import java.util.Locale;

public class Strings {
    public String invertirYMayusculas(String cadena) {
        // Usamos StringBuilder para la construcción eficiente
        StringBuilder cadenaInvertida = new StringBuilder();

        // Recorremos desde el último índice (length - 1) hasta 0
        for (int i = cadena.length() - 1; i >= 0; i--) {
            // Se añade el carácter tal cual
            cadenaInvertida.append(cadena.charAt(i));
        }

        // ¡Ojo! No podemos usar .toUpperCase() aquí
        return cadenaInvertida.toString();
    }

    // --- B. Función: Contar Vocales (SIN toLowerCase) ---
    /**
     * Recibe una cadena y devuelve el número total de vocales, contando A/a, E/e, etc.
     * @param cadena La cadena de entrada.
     * @return El número de vocales encontradas.
     */
    public int contarVocales(String cadena) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Verificación extendida para contar tanto mayúsculas como minúsculas
            if (caracter == 'a' || caracter == 'A' ||
                    caracter == 'e' || caracter == 'E' ||
                    caracter == 'i' || caracter == 'I' ||
                    caracter == 'o' || caracter == 'O' ||
                    caracter == 'u' || caracter == 'U') {
                contador++;
            }
        }
        return contador;
    }

    // --- C. Función: Palabra de Mayor Longitud (Lógica Básica) ---
    public String palabraMayorLongitud(String cadena) {
        String palabraMasLarga = "";
        String palabraActual = "";

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter != ' ') {
                palabraActual = palabraActual + caracter;
            } else {
                if (palabraActual.length() > palabraMasLarga.length()) {
                    palabraMasLarga = palabraActual;
                }
                palabraActual = "";
            }
        }

        // Caso de la última palabra
        if (palabraActual.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabraActual;
        }

        return palabraMasLarga;
    }

    // --- D. Función: Contar Inclusiones de Subcadena (Lógica Básica) ---
    public int contarInclusiones(String principal, String subcadena) {
        if (subcadena.length() == 0 || principal.length() < subcadena.length()) {
            return 0;
        }

        int contador = 0;
        int tamanoPrincipal = principal.length();
        int tamanoSub = subcadena.length();

        for (int i = 0; i <= tamanoPrincipal - tamanoSub; i++) {
            boolean coincide = true;

            for (int j = 0; j < tamanoSub; j++) {
                if (principal.charAt(i + j) != subcadena.charAt(j)) {
                    coincide = false;
                    break;
                }
            }

            if (coincide) {
                contador++;
                // Saltamos la longitud para evitar solapamientos
                i = i + tamanoSub - 1;
            }
        }
        return contador;
    }

    // --- E. Función: Contar Palabras (Lógica Básica) ---
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.length() == 0) {
            return 0;
        }

        int contadorPalabras = 0;
        boolean enPalabra = false;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter != ' ') {
                if (!enPalabra) {
                    contadorPalabras++;
                    enPalabra = true;
                }
            } else {
                enPalabra = false;
            }
        }

        return contadorPalabras;
    }

    // --- F. Función: Formato de Número de Teléfono (Lógica Básica) ---
    public String formatearTelefono(String telefono) {
        if (telefono == null || telefono.length() != 11) {
            return "Error: El número de teléfono debe tener exactamente 11 dígitos.";
        }

        String resultado = "(+";

        // 1. Código de país: (0 y 1)
        resultado += telefono.charAt(0);
        resultado += telefono.charAt(1);
        resultado += ")-";

        // 2. Prefijo: (2, 3 y 4)
        resultado += telefono.charAt(2);
        resultado += telefono.charAt(3);
        resultado += telefono.charAt(4);
        resultado += "-";

        // 3. Bloque final: (5 a 10)
        for (int i = 5; i < 11; i++) {
            resultado += telefono.charAt(i);
        }

        return resultado;
    }

    // --- G. Procedimiento: Histograma de Frecuencias de Vocales (SIN HashMap/toLowerCase) ---
    /**
     * Muestra el histograma de vocales. Cuenta mayúsculas y minúsculas juntas.
     * @param cadena La cadena de entrada para el análisis.
     */
    public void mostrarHistogramaVocales(String cadena) {
        System.out.println("\n--- Histograma de Frecuencias de Vocales ---");

        // Array simple para las 5 cuentas: [a/A, e/E, i/I, o/O, u/U]
        int[] frecuencias = new int[5]; // 0=a, 1=e, 2=i, 3=o, 4=u

        // Contar frecuencias
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Usamos el switch para agrupar minúsculas y mayúsculas
            switch (caracter) {
                case 'a':
                case 'A':
                    frecuencias[0]++;
                    break;
                case 'e':
                case 'E':
                    frecuencias[1]++;
                    break;
                case 'i':
                case 'I':
                    frecuencias[2]++;
                    break;
                case 'o':
                case 'O':
                    frecuencias[3]++;
                    break;
                case 'u':
                case 'U':
                    frecuencias[4]++;
                    break;
            }
        }

        // Mostrar el Histograma
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        for (int j = 0; j < 5; j++) {
            char vocal = vocales[j];
            int cuenta = frecuencias[j];

            String asteriscos = "";

            // Generar la cadena de asteriscos
            for (int k = 0; k < cuenta; k++) {
                asteriscos += "*";
            }

            System.out.printf("%c %2d %s\n", vocal, cuenta, asteriscos);
        }
    }

    }
