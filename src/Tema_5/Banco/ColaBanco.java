package Tema_5.Banco;

import java.util.LinkedList;

public class ColaBanco {
    private LinkedList<Usuario> cola = new LinkedList<>();

    //Añadir al final de la cola
    public void anadirPersona(Usuario u) {
        cola.addLast(u);
        System.out.println(u.getNombre() + " se ha unido a la cola.");
    }

    //Primero "atendido"
    public Usuario atenderSiguiente() {
        if (cola.isEmpty()) return null;
        return cola.removeFirst();
    }

    //"Se ha cansado de esperar"
    public boolean abandonarCola(String dni) {
        for (Usuario u : cola) {
            if (u.getDni().equalsIgnoreCase(dni)) {
                cola.remove(u);
                return true;
            }
        }
        return false;
    }

    public void mostrarCola() {
        if (cola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("\n ESTADO DE LA COLA ");
            for (int i = 0; i < cola.size(); i++) {
                System.out.println((i + 1) + ". " + cola.get(i));
            }
        }
    }
}
