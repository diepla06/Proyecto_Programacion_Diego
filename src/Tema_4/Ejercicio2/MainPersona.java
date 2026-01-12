package Tema_4.Ejercicio2;

import java.util.Scanner;

public class MainPersona {
    public static void main(String[] args) {
        String DNI;
        String Nombre;
        String Apellidos;
        int Edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu dni: ");
        DNI = sc.nextLine();

        System.out.println("Dime tu nombre: ");
        Nombre = sc.nextLine();

        System.out.println("Dime tus apellidos: ");
        Apellidos = sc.nextLine();




        Persona Persona1 = new Persona();
        Persona1.DNI = DNI;
        Persona1.setNombre("Manolo");
        Persona1.setApellido("Garcia Lopez");
        Persona1.setEdad(65);
        Persona1.print("10101101C","Manolo", "Garcia Lopez", 65);
        System.out.println(Persona1);
        Persona1.isAdult(Persona1.getEdad());
        Persona1.isRetired(Persona1.getEdad());
        Persona1.ageDifference(Persona1);
        Persona1.checkDNI(Persona1.DNI);
    }
}
