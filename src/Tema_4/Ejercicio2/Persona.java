package Tema_4.Ejercicio2;

import java.sql.SQLOutput;
import java.util.IllegalFormatCodePointException;

public class Persona {
    String DNI;
    private String nombre;
    private String apellido;
    private int edad;

    final static int adultAge = 18;
    final static int retiredAge = 65;

    public void Persona(){
        this.DNI = "00000000X";
        this.nombre = "Manolo";
        this.apellido = "Moreno Garcia";
        this.edad = 52;
    }

    public void Persona(String DNI, String nombre, String apellido, int edad){
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad){
        if (edad >= 0){
            this.edad = edad;
        }
    }
    public void print(String DNI, String nombre, String apellido, int edad){
        System.out.println("Dni: " + DNI + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad);
    }
    public String toString(){
       return  "Dni: " + DNI + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad;
    }
    public void isAdult(int edad){
        if (edad >= adultAge){
            System.out.println("Tiene: " + edad + ", es mayor de edad");
        }else {
            System.out.println("Tiene: " + edad + ", es menor de edad");
        }
    }
    public  void isRetired(int edad){
        if (edad > retiredAge){
            System.out.println("Tiene: " + edad + ", esta jubilado");
        }else {
            System.out.println("Tiene: " + edad + ", no esta jubilado");
        }
    }
    public void ageDifference(Persona Persona1){
        this.edad = Persona1.getEdad();
    }
    public boolean checkDNI(String DNI){
        boolean checkDNI = true;
        String num = DNI.substring(0,8);
        int onlyNum = Integer.parseInt(num);
        int resto = onlyNum % 23;
        switch (resto){
            case 0:
                num += "T";
                break;
            case 1:
                num += "W";
                break;
            case 2:
                num += "T";
                break;
            case 3:
                num += "A";
                break;
            case 4:
                num += "G";
                break;
            case 5:
                num += "M";
                break;
            case 6:
                num += "Y";
                break;
            case 7:
                num += "F";
                break;
            case 8:
                num += "P";
                break;
            case 9:
                num += "D";
                break;
            case 10:
                num += "X";
                break;
            case 11:
                num += "B";
                break;
            case 12:
                num += "N";
                break;
            case 13:
                num += "J";
                break;
            case 14:
                num += "Z";
                break;
            case 15:
                num += "S";
                break;
            case 16:
                num += "Q";
                break;
            case 17:
                num += "V";
                break;
            case 18:
                num += "H";
                break;
            case 19:
                num += "L";
                break;
            case 20:
                num += "C";
                break;
            case 21:
                num += "K";
                break;
            case 22:
                num += "E";
                break;
        }
        if (num.equals(DNI)){
            return checkDNI;
        }else {
            checkDNI = false;
            return checkDNI;
        }
    }
}
