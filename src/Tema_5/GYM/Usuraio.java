package Tema_5.GYM;

public class Usuraio {
    private String nombre;
    private int edad;
    private String dni;

    public void Usuario() {
        nombre = "Padiel";
        edad = 19;
        dni = "29025454P";
    }

    public void Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    public String getNombre() {return nombre;}
    public void setNombre() {
        this.nombre = nombre;
    }

    public int getEdad() {return edad;}
    public void setEdad(){
        this.nombre=nombre;
    }

    public String getdni(){return dni;}
    public void setDni(){
        this.dni = dni;
    }

}