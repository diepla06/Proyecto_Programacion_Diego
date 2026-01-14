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

        Persona Persona1 = new Persona();
        Persona1.DNI = dni;
        Persona1.setNombre(nombre);
        Persona1.setApellido(apellidos);
        Persona1.setEdad(edad);
        Persona1.print(dni,nombre, apellidos, edad);
        System.out.println(Persona1);
        Persona1.isAdult(Persona1.getEdad());
        Persona1.isRetired(Persona1.getEdad());
        Persona1.ageDifference(Persona1);
        if(Persona1.checkDNI(Persona1.DNI)){
            System.out.println(Persona1.checkDNI(Persona1.DNI));
        }
    }
}
