package Tema_7.Ejercicio.B1;

import java.io.*;

public class B1 {
    public static void main(String[] args) {
        buscarMax();
        buscarMin();
    }

   public static void buscarMax() {
       String fileName = "/home/dieplamon/IdeaProjects/Proyecto_Diego/Resources/numeros.txt";
       try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
           String line;
           int num = 99999999;
           while ((line = br.readLine()) != null) {
               if (num > Integer.parseInt(line)) {
                   num = Integer.parseInt(line);
               }
           }
           System.out.println("El numero menor es :" + num);
           ;
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
    public static void buscarMin(){


        String fileName = "/home/dieplamon/IdeaProjects/Proyecto_Diego/Resources/numeros.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                int num = 0;
                while ((line = br.readLine()) != null) {
                    if (num < Integer.parseInt(line)){
                        num = Integer.parseInt(line);
                    }
                }
            System.out.println("El numero mayor es :" + num);;
            } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
