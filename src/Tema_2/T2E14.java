package Tema_2;

import java.util.Scanner;

public class T2E14 {
    public static void main(String[] args) {
        System.out.println("Dime las noches y las personas que soys (con este oreden):");

        Scanner sc = new Scanner(System.in);
        int noches = sc.nextInt();
        int personas = sc.nextInt();

        if (noches >= 7 && personas > 5) {
            double precio1 = (15 * noches) * 0.25 ;
            double precio2 = 15 * noches - precio1;
            System.out.println("Le hemos hecho un 25% de descuento por ser mas de 5 personas y quedarte mas de una semana");
            System.out.println("El precio sera de " + precio2 + "€ por persona.");
        }else {
            double precio2 = 15 * noches*personas;
            System.out.println("Se le quedaria en " + precio2 + "€ por persona.");
        }
    }
}
