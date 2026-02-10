package Tema_5.Banco;

public class Usuario {
    private String nombre;
    private int edad;
    private String dni;

    public Usuario(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public Usuario() {
        nombre = "Diego";
        edad = 19;
        dni = "20828555V";
    }


    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {return edad;}
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getDni() { return dni; }
    public String setDni() {
        return dni;
    }

    public String toString() {
        return "[DNI: " + dni + " | Nombre: " + nombre + " | Edad: " + edad + "]";
    }
}
