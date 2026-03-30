package Tema_7.Ejercicio.B3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Archivo de origen: ");
        String origen = sc.nextLine();

        System.out.print("Archivo de destino: ");
        String destino = sc.nextLine();

        ArrayList<String> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(origen))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lista.add(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
            return;
        }

        Collections.sort(lista);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destino))) {
            for (String s : lista) {
                bw.write(s);
                bw.newLine();
            }
            System.out.println("Archivo guardado en " + destino);
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

}
