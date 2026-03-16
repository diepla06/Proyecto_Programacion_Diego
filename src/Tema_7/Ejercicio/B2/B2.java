package Tema_7.Ejercicio.B2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class B2 {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        String fileName = "/home/dieplamon/IdeaProjects/Proyecto_Diego/Resources/alumnos_notas.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineSplit = line.split(" ");
                String nombre = lineSplit[0] + " " + lineSplit[1];

                // MOVIDO AQUÍ: Se reinician para cada alumno
                double suma = 0;
                int cuentaNotas = 0;

                for (int i = 2; i < lineSplit.length; i++) {
                    double nota = Double.parseDouble(lineSplit[i]);
                    suma += nota;
                    cuentaNotas++;
                }

                double notaMedia = (cuentaNotas > 0) ? (suma / cuentaNotas) : 0;
                listaAlumnos.add(new Alumno(nombre, notaMedia));
            }

            listaAlumnos.sort(java.util.Comparator.comparingDouble(Alumno::getNotaMedia).reversed());


            for (Alumno al : listaAlumnos) {
                System.out.println(al);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




