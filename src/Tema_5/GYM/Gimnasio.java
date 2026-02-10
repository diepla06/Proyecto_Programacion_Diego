package Tema_5.GYM;
import java.util.HashMap;
import java.util.Map;



public class Gimnasio {
    private Map<String, Usuraio > usuarios = new HashMap<>();

    public boolean darAlta(String dni, String nombre, int edad) {
        if (usuarios.containsKey(dni)) return false; // Ya existe
        usuarios.put(dni, new Usuraio(nombre, edad));
        return true;
    }

    public boolean darBaja(String dni) {
        return usuarios.remove(dni) != null;
    }

    public Usuraio buscar(String dni) {
        return usuarios.get(dni);
    }

    public boolean modificar(String dni, String nombre, int edad) {
        Usuraio user = usuarios.get(dni);
        if (user == null) return false;

        if (!nombre.isEmpty()) user.setNombre(nombre);
        if (edad > 0) user.setEdad(edad);
        return true;
    }



}
