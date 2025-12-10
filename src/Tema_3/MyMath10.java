package Tema_3;

import java.util.Scanner;

public class MyMath10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n--- MENU ---\n");
        System.out.println("a. Calcular area y perimetro");
        System.out.println("b. Calculo numero primo");
        System.out.println("c. Contador de digitos");
        System.out.println("d. Contador de pares");
        System.out.println("j. Contador de impares");
        System.out.println("e. Calculo factorial");
        System.out.println("f. Calculo factorial de manera recursiva");
        System.out.println("g. Resolucin de funciones con 3 coeficientes");
        System.out.println("h. Suma de los numeros de un digito entero");
        System.out.println("i. Calculo numeros primos de forma recursiva");
        System.out.println("\n--- EXIT ---\n //--Cualquier otro caracter--//");

        System.out.println("Dime la opcion que quieras : ");

        char opcion;
        do {
            opcion = Character.toLowerCase(sc.next().charAt(0));


            switch (opcion) {
                case 'a':
                    // Código para la opción 'a'
                    System.out.println("Opción A ejecutada.");

                    double lado;
                    double base;
                    double altura;
                    double radio;

                    System.out.println("Vamos a calcular el area y el preimetro del cuadrado, rectangulo y circulo");

                    //Quadrado
                    System.out.println("Dime un lado del cuadrado");
                    lado = sc.nextDouble();
                    double pQuadrado = MyMath.squarePerimeter(lado);
                    double aQuadrado = MyMath.squareArea(lado);
                    System.out.println("El perimetro: " + pQuadrado + "\nEl area: " + aQuadrado);

                    //Rectangulo
                    System.out.println("Dime la base de tu rectangulo");
                    base = sc.nextDouble();
                    System.out.println("Ahora dime la altura");
                    altura = sc.nextDouble();
                    double pRectangulo = MyMath.rectanglePerimeter(base, altura);
                    double aRectangulo = MyMath.rectangleArea(base, altura);
                    System.out.println("El perimetro: " + pRectangulo + "\nEl area: " + aRectangulo);

                    //Circulo
                    System.out.println("Dime el radio de tu circulo");
                    radio = sc.nextDouble();
                    double pCirculo = MyMath.circlePerimeter(radio);
                    double aCirculo = MyMath.circleArea(radio);
                    System.out.println("El perimetro: " + pCirculo + "\nEl area: " + aCirculo);
                    break;


                case 'b':
                    // Código para la opción 'b'
                    System.out.println("Opción B ejecutada.");

                    int num;
                    boolean primo;

                    System.out.println("Dime numeros y yo te dire si es primo o no, en el caso de que me pongas el 0, se terminara el programa");
                    num = sc.nextInt();

                    while (num != 0) {
                        //comprobarsies positivo (clculo primo),y si esnegativo(digo quenoes correcto)
                        primo = MyMath.primo(num);
                        if (primo) {
                            System.out.println(num + " es primo");
                        } else {
                            System.out.println(num + " no es primo");
                        }
                        System.out.println("Dime otro numero positivo o 0 para finalizar");
                        num = sc.nextInt();
                    }
                    System.out.println("Finalizando programa...");
                    break;


                case 'c':
                    // Código para la opción 'c'
                    System.out.println("Opción C ejecutada.");


                    int cifra;

                    System.out.println("Dime un numero entero y te dire cuantos digitos tiene");
                    num = sc.nextInt();

                    cifra = MyMath.numeroDigito(num);

                    System.out.println("El numero que me has dado tiene " + cifra + " numeros.");
                    break;


                case 'd':
                    // Código para la opción 'd'
                    System.out.println("Opción D ejecutada.");

                    int cont;

                    System.out.println("Dime un numero y te dire cuantos pares tiene");
                    num = sc.nextInt();

                    cont = MyMath.numerosPares(num);
                    System.out.println("Son " + cont + " pares");
                    break;


                case 'e':
                    // Código para la opción 'e'
                    System.out.println("Opción E ejecutada.");

                    System.out.println("Dime un numero y te dire cuantos impares tiene");
                    num = sc.nextInt();

                    cont = MyMath.numerosImpares(num);
                    System.out.println("Son " + cont + " Impares");
                    break;


                case 'f':
                    // Código para la opción 'f'
                    System.out.println("Opción F ejecutada.");

                    System.out.print("Enter a number: ");
                    num = sc.nextInt();

                    int resultado = MyMath.factorial(num);
                    System.out.println("El factorial de " + resultado);
                    break;

                case 'g':
                    // Código para la opción 'g'
                    System.out.println("Opción G ejecutada.");
                    System.out.print("Enter a number: ");
                    num = sc.nextInt();

                    resultado = MyMath.factorialRec(num);
                    System.out.println("El factorial de " + resultado);
                    break;

                case 'h':
                    // Código para la opción 'h'
                    System.out.println("Opción H ejecutada.");

                    System.out.println("Introduce los coeficientes (a, b, c) de la ecuación ax^2 + bx + c = 0:");

                    System.out.print("Valor de a: ");
                    double a = sc.nextDouble();

                    System.out.print("Valor de b: ");
                    double b = sc.nextDouble();

                    System.out.print("Valor de c: ");
                    double c = sc.nextDouble();

                    int soluciones = MyMath.funcion(a, b, c);

                    System.out.printf("\nLa ecuación: %.2fx^2 + %.2fx + %.2f = 0\n", a, b, c);
                    System.out.printf("Tiene **%d** solución(es) real(es).\n", soluciones);
                    break;

                case 'i':
                    // Código para la opción 'i'
                    System.out.println("Opción I ejecutada.");

                    System.out.print("\nIntroduce un número entero para sumar sus dígitos: ");
                    int numUsuario = sc.nextInt();

                    int sumaUsuario = MyMath.sumarDigitos(numUsuario);

                    System.out.printf("El número %d tiene una suma de dígitos de **%d**.\n", numUsuario, sumaUsuario);
                    break;

                case 'j':
                    // Código para la opción 'j'
                    System.out.println("Opción J ejecutada.");

                    System.out.println("Dime un numero y te dire si es primo");
                    num = sc.nextInt();

                    primo = MyMath.esPrimo(num);

                    if (primo) {
                        System.out.println(num + " es primo");
                    } else {
                        System.out.println(num + " no es primo");
                    }
                    break;

                default:

                    System.out.println("La opción '" + opcion + "' sirve para parar el programa. No se ejecuta ninguna tarea.");
                    System.out.println("Dime una opcion valida : ");
                    break;
            }
        } while (opcion < 'a' || opcion > 'j');
    }
}
