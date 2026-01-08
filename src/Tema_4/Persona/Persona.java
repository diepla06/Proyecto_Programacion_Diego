package Tema_4.Persona;

public class Persona {
    public static final int EDAD_DEF = 72;
    String nombre;
    int edad;


    public String getNombre() {
       return nombre;
    }
    public void setNombre(){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(){
        if(edad > 0) {
            this.edad = edad;
        }
    }

    public Persona(){
        nombre = "Juan Pablo";
        edad = EDAD_DEF;
    }
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre){
        this.nombre = nombre;
        this.edad = EDAD_DEF;
    }


    public void saludar() {
        System.out.println("¡Hola!");
    }

    public void presentarme() {
        System.out.println("Soy " + nombre + " y tengo " + edad + " años ");
    }

    public void saludarA(String nombre) {
        System.out.println("¡Hola " + nombre + "!");
    }

    public void ShowdInfo(){
        System.out.println("Tengo " + edad + " años y me llamo " + nombre);
    }


}
