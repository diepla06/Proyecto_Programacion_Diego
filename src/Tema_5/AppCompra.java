package Tema_5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numProductos ;
        String producto;
        Set<String> setProducto = new HashSet<>();

        System.out.println("Dime cuantos productos vas a apuntar en la lista de la compra:");
        numProductos = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime los productos que necesitas apunta: ");
        for (int i = 0; i <= numProductos; i++){
            producto = sc.nextLine();
            if (!setProducto.contains(producto)) {
                setProducto.add(producto);
            }else{
                System.out.println("El producto ya existe");
            }
        }

        System.out.println("Lista: \n" + setProducto);
    }
}
