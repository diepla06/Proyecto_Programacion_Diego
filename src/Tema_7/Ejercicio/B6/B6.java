package Tema_7.Ejercicio.B6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número a buscar: ");
        String objetivo = sc.nextLine();

        // arraylist para guardar los numeros
        ArrayList<Character> listaPi = new ArrayList<>();
        String ruta = "/home/dieplamon/IdeaProjects/Proyecto_Diego/Resources/pi-million.txt";

        // llenar el Arraylist
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            int c;
            while ((c = br.read()) != -1) {
                char caracter = (char) c;
                if (Character.isDigit(caracter)) {
                    listaPi.add(caracter);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // recorremos el arraylist
        boolean encontrado = false;

        for (int i = 0; i <= listaPi.size() - objetivo.length(); i++) {
            boolean coincidenTodos = true;

            // comparamos los elementos
            for (int j = 0; j < objetivo.length(); j++) {
                if (listaPi.get(i + j) != objetivo.charAt(j)) {
                    coincidenTodos = false;
                    break;
                }
            }

            if (coincidenTodos) {
                encontrado = true;
                break;
            }
        }

        System.out.println(encontrado ? "¡Encontrado!" : "No encontrado.");
    }
}
