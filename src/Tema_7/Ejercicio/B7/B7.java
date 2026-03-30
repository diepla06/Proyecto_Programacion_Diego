package Tema_7.Ejercicio.B7;
import java.io.*;
import java.util.*;


public class B7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la ruta del libro (ej: Libros/quijote_cervantes.txt): ");
        String ruta = sc.nextLine();

        int lineas = 0;
        int palabrasTotales = 0;
        int caracteres = 0;
        HashMap<String, Integer> mapaPalabras = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas++;
                caracteres += linea.length();


                String[] palabras = linea.toLowerCase().split("[\\s\\p{Punct}]+");

                for (String p : palabras) {
                    if (!p.isEmpty()) {
                        palabrasTotales++;
                        mapaPalabras.put(p, mapaPalabras.getOrDefault(p, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
            return;
        }


        List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapaPalabras.entrySet());
        lista.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Líneas: " + lineas);
        System.out.println("Palabras: " + palabrasTotales);
        System.out.println("Caracteres: " + caracteres);
        System.out.println("\nTop 10 palabras más comunes:");

        for (int i = 0; i < Math.min(10, lista.size()); i++) {
            System.out.println((i + 1) + ". " + lista.get(i).getKey() + " (" + lista.get(i).getValue() + " veces)");
        }
    }

}
