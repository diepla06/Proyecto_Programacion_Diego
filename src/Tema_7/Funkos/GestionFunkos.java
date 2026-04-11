package Tema_7.Funkos;

import java.io.*;
import java.util.*;

public class GestionFunkos {
    // IMPORTANTE: Asegúrate de que esta ruta es la que ves en tu IntelliJ
    private final String RUTA = "src/Tema_7/Funkos/funkos (1).csv";

    public ArrayList<Funko> loadFunkos() {
        ArrayList<Funko> lista = new ArrayList<>();
        File f = new File(RUTA);

        if (!f.exists()) return lista;

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea = br.readLine(); // Saltamos la cabecera (nombres de columnas)

            while ((linea = br.readLine()) != null) {
                String[] d = linea.split(",");
                if (d.length >= 5) {
                    // Leemos las 5 columnas de tu archivo
                    lista.add(new Funko(d[0], d[1], d[2],
                            Double.parseDouble(d[3]), d[4]));
                }
            }
        } catch (Exception e) {
            System.out.println("Error al cargar: " + e.getMessage());
        }
        return lista;
    }

    public void saveFunkos(ArrayList<Funko> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA))) {
            bw.write("COD,NOMBRE,MODELO,PRECIO,FECHA_LANZAMIENTO");
            bw.newLine();
            for (Funko f : lista) {
                bw.write(f.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar.");
        }
    }

    public void mostrarMasCaro(ArrayList<Funko> lista) {
        if (lista.isEmpty()) return;
        Funko caro = lista.get(0);
        for (Funko f : lista) if (f.getPrecio() > caro.getPrecio()) caro = f;
        System.out.println("El más caro es: " + caro);
    }

    public void mostrarMedia(ArrayList<Funko> lista) {
        double suma = 0;
        for (Funko f : lista) suma += f.getPrecio();
        System.out.printf("Media de precios: %.2f€\n", (suma / lista.size()));
    }

    public void mostrarAgrupados(ArrayList<Funko> lista) {
        HashSet<String> modelos = new HashSet<>();
        for (Funko f : lista) modelos.add(f.getModelo());
        for (String m : modelos) {
            System.out.println("\n--- " + m + " ---");
            for (Funko f : lista) if (f.getModelo().equals(m)) System.out.println(f);
        }
    }
}