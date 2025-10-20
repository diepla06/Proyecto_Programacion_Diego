package Tema_2;

public class T2E19 {
    public static void main(String[]args){
        System.out.println("Te voy a decir todos los numeros pares del 1 al 1000");
        int num = 1;
        while (num <= 1000){
            boolean par = num % 2 == 0;
//
            if (par == true){
                System.out.println(num);
            }
            num ++;
        }
    }
}
