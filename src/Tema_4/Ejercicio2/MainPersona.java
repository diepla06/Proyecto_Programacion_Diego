package Tema_4.Ejercicio2;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        String dni;
        String nombre;
        String apellidos;
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu dni: ");
        dni = sc.nextLine();

        System.out.println("Dime tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Dime tus apellidos: ");
        apellidos = sc.nextLine();

        System.out.println("Dime tu edad");
        edad = sc.nextInt();

        Persona persona1 = new Persona();
        persona1.setDNI(dni);
        persona1.setNombre(nombre);
        persona1.setApellido(apellidos);
        persona1.setEdad(edad);
        persona1.print(dni,nombre, apellidos, edad);
        System.out.println(persona1);
        persona1.isAdult(persona1.getEdad());
        persona1.isRetired(persona1.getEdad());
        persona1.ageDifference(persona1);
        if(persona1.checkDNI(persona1.setDNI(dni))){
            System.out.println(persona1.checkDNI(persona1.setDNI(dni)));
        }
    }
}
