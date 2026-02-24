package Tema_6.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista (Array) de Animales
        Animal[] misAnimales = {
                new Perro("Rex"),
                new Gato("Salem"),
                new Mono("Tweety"),
                new Vaca("Flipper"),
                new Oveja("Kaa")
        };

        for (Animal a : misAnimales) {
            System.out.println("--- " + a.getNombre() + " ---");
            a.comer();
            a.hacerRuido();

            if (a instanceof Perro) {
                Perro miPerrito = (Perro) a;
                miPerrito.tumbarseHaciaArriba();
            }

            if (a instanceof Gato) {
                Gato miGatito = (Gato) a;
                miGatito.bolaPelo();
            }

            if (a instanceof Mono) {
                Mono miMonito = (Mono) a;
                miMonito.comerPlatano();
            }

            if (a instanceof Vaca) {
                Vaca mivaquita = (Vaca) a;
                mivaquita.ordenyando();
            }

            if (a instanceof Oveja) {
                Oveja miOvegita = (Oveja) a;
                miOvegita.esquilar();
            }

            System.out.println();
        }
    }
}
