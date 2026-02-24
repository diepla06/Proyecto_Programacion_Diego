package Tema_6.Ejercicio4;

public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro(1, "El Quijote", "Cervantes", "Planeta");

        DVD d1 = new DVD();
        d1.setNumero(2);
        d1.setTitulo("Interstellar");
        d1.setDirector("Christopher Nolan");
        d1.setAnio(2014);
        d1.setTipo("Ciencia Ficción");

        Ficha[] inventario = {l1, d1};

        for (Ficha f : inventario) {
            f.mostrarDetalles();
        }
    }
}
