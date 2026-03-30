package Tema_7.Ejercicio.B4;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        ArrayList<String> listaNombres = new ArrayList<>();
        ArrayList<String> listaApellidos = new ArrayList<>();

        try (BufferedReader brN = new BufferedReader(new FileReader("usa_nombres.txt"));
             BufferedReader brA = new BufferedReader(new FileReader("usa_apellidos.txt"))) {

            String linea;
            while ((linea = brN.readLine()) != null) listaNombres.add(linea);
            while ((linea = brA.readLine()) != null) listaApellidos.add(linea);

        } catch (IOException e) {
            System.out.println("Error al leer los archivos base.");
            return;
        }

        System.out.print("¿Cuántos nombres quieres generar? ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        System.out.print("¿A qué archivo los quieres añadir? ");
        String nombreArchivo = sc.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            for (int i = 0; i < cantidad; i++) {
                String nombreAleatorio = listaNombres.get(rd.nextInt(listaNombres.size()));
                String apellidoAleatorio = listaApellidos.get(rd.nextInt(listaApellidos.size()));

                bw.write(nombreAleatorio + " " + apellidoAleatorio);
                bw.newLine();
            }
            System.out.println("Se han generado " + cantidad + " nombres en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo.");
        }
    }

}
