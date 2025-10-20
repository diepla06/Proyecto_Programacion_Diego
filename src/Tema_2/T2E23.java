package Tema_2;

import java.util.Scanner;

/*Lee por teclado varios números enteros positivos hasta recibir un
número negativo. El programa mostrará la media de los números (sin tener en cuenta el negativo).*/
public class T2E23 {
    public static void main(String[] args){
        System.out.println("Cuando pungas un numero negativo se acaba el programa");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int media = 0;
        int contador = 0;

        while(num > 0) {
            media = num + media;
            System.out.println("Dime otro numero cuando quieras saber la media de estos pun un numero menor o igual a 0");
            num = sc.nextInt();
            contador++;
        }

        media = media / contador ;
        System.out.println("La media de los numeros es " + media);
    }
}
