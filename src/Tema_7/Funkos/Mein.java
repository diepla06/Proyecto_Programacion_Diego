package Tema_7.Funkos;

import java.util.*;

public class Mein {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionFunkos gestion = new GestionFunkos();
        ArrayList<Funko> lista = gestion.loadFunkos();
        int op;

        do {
            System.out.println("\n1.Añadir 2.Borrar 3.Mostrar 4.Caro 5.Media 6.Agrupar 7.2023 0.Salir");
            op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1:
                    String id = UUID.randomUUID().toString(); // Genera un ID automático
                    System.out.print("Nombre: "); String nom = sc.nextLine();
                    System.out.print("Modelo: "); String mod = sc.nextLine();
                    System.out.print("Precio: "); double pre = sc.nextDouble();
                    System.out.print("Fecha (AAAA-MM-DD): "); String fec = sc.next();
                    lista.add(new Funko(id, nom, mod, pre, fec));
                    gestion.saveFunkos(lista);
                    break;
                case 2:
                    System.out.print("Nombre a borrar: ");
                    String b = sc.nextLine();
                    if(lista.removeIf(f -> f.getNombre().equalsIgnoreCase(b))) {
                        gestion.saveFunkos(lista);
                        System.out.println("Borrado.");
                    }
                    break;
                case 3:
                    lista.forEach(System.out::println);
                    break;
                case 4: gestion.mostrarMasCaro(lista); break;
                case 5: gestion.mostrarMedia(lista); break;
                case 6: gestion.mostrarAgrupados(lista); break;
                case 7:
                    for(Funko f : lista) if(f.getFecha().startsWith("2023")) System.out.println(f);
                    break;
            }
        } while (op != 0);
    }
}