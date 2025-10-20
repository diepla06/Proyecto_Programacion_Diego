package Tema_2;

/*
Haz una calculadora. La calculadora permitirá hacer varias operaciones.
Pedirá un número real, pedirá una operación (+, -, *, / o %), pedirá otro
número real y mostrará el resultado por consola. A continuación pedirá
los datos para una nueva operación. Piensa en un modo para que se
pueda salir de la calculadora en cualquier momento.
 */

import java.util.Scanner;

public class T2E30 {
    public static void main(String[] args){
        System.out.println("Soy una calculadora, que quieres calcular pulsa & para acabar el programa");
        Scanner sc = new Scanner(System.in);


        int operacion = 0;
        char seguir ;
        seguir = '$';
        char simbolo;
        int num1 ;

        while (seguir == '$'){
            int num = sc.nextInt();
            System.out.println("Que operacion quieres hacer?");
            simbolo = sc.next().charAt(0);
            switch (simbolo){
                case '+' :
                    System.out.println("Dime un numero para ejecutar la operación");
                    //
                    num1 = sc.nextInt();
                    operacion = num + num1;
                    System.out.println("El resulado es " + operacion);
                    break;
                case '-' :
                    System.out.println("Dime un numero para ejecutar la operación");
                    num1 = sc.nextInt();
                    operacion = num - num1;
                    System.out.println("El resulado es " + operacion);
                    break;
                case '*' :
                    System.out.println("Dime un numero para ejecutar la operación");
                    num1 = sc.nextInt();
                    operacion = num * num1;
                    System.out.println("El resulado es " + operacion);
                    break;
                case '/' :
                    System.out.println("Dime un numero para ejecutar la operación");
                    num1 = sc.nextInt();
                    if (num1 != 0) {
                        operacion = num / num1;
                        System.out.println("El resulado es " + operacion);
                    }else {
                        System.out.println("No se puede dividir entre 0");
                    }
                    break;
                case '%' :
                    System.out.println("Dime un numero para ejecutar la operación");
                    num1 = sc.nextInt();
                    operacion = num % num1;
                    System.out.println("El resulado es " + operacion);
                    break;
                case '&' :
                    System.out.println("Perfecto apagando calculadora");
                    System.exit(1);
                    break;
            }
            System.out.println("Quieres continuar haciendo operaciones? Si es que no pon &");
            seguir = sc.next().charAt(0);
            System.out.println(seguir);
            if (seguir == '&'){
                System.out.println("Perfecto apagando calculadora");
                System.exit(1);
            }
        }
    }
}
