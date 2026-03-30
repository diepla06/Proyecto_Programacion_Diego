package Tema_7.Ejercicio.B5;

import java.io.*;
import java.util.ArrayList;

public class B5 {
    public static void main(String[] args) {

        String rutaDiccionario = "diccionario.txt";
        File carpeta = new File("Diccionario");

        if (!carpeta.exists()) {
            carpeta.mkdir();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(rutaDiccionario))) {
            String palabra;
            while ((palabra = br.readLine()) != null) {
                if (!palabra.isEmpty()) {
                    char primeraLetra = Character.toUpperCase(palabra.charAt(0));

                    if (primeraLetra >= 'A' && primeraLetra <= 'Z') {
                        String nombreArchivo = "Diccionario/" + primeraLetra + ".txt";

                        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo,       true))) {
                            bw.write(palabra);
                            bw.newLine();
                        }
                    }
                }
            }
            System.out.println("Diccionario organizado por letras en la carpeta 'Diccionario'.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
