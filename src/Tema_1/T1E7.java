package Tema_1;

import java.security.Principal;
import java.util.Scanner;

public class T1E7 {
    public static void main(String[] args){
        System.out.println("Dime un numero entre el 1 y el 6, te dire la cara contraria del dado");
        Scanner scanner = new Scanner(System.in) ;
        int lado = scanner.nextInt() ;
        if (0 < lado && lado < 7){
            int resultado = 7 - lado ;
            System.out.printf("El resultado es: %d", resultado);
        } else{
            System.out.println("Eso no es un lado de un dado de 6 caras.");
        };

    }
}
