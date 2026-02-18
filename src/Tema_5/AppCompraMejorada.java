package Tema_5;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppCompraMejorada {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 0;
    Set<String> listaCompra = new HashSet<>();
    Set<String> carroCompra = new HashSet<>();

    System.out.println("¿Cuántos productos vas a comprar?");
    int num = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < num; i++) {
        contador ++;
        System.out.print("Producto " + contador + " : ");
        listaCompra.add(sc.nextLine());
    }

    System.out.println("\nEscribe qué vas metiendo al carro ('fin' para acabar):");
    contador ++;
    System.out.print("Producto " + contador + " : ");

    String prod;

    while (!(prod = sc.nextLine()).equalsIgnoreCase("fin")) {
        contador ++;
        System.out.print("Producto " + contador + " : ");
        carroCompra.add(prod);
    }


    System.out.print("\nTe falta añadir: ");
    for (String p : listaCompra) {
        if (!carroCompra.contains(p)) {
            System.out.print("[" + p + "] ");
        }
    }

    System.out.print("\nYa tienes en el carro: ");
    for (String p : carroCompra) {
        if (listaCompra.contains(p)) {
            System.out.print("[" + p + "] ");
        }
    }

    System.out.print("\nCaprichos extra: ");
    for (String p : carroCompra) {
        if (!listaCompra.contains(p)) {
            System.out.print("[" + p + "] ");
        }
    }
    System.out.println();
}

}
