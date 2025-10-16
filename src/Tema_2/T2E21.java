package Tema_2;

public class T2E21 {
        public static void main(String[]args){
            System.out.println("Te voy a sumar todos los numeros pares del 1 al 1000");
            int num = 1;
            int resultado = 0;
            while (num <= 1000){
                boolean par = num % 2 == 0;

                if (par == true){
                    resultado = num + resultado;
                }
                num ++;
            }
            System.out.println("El resultado es " + resultado);
        }
}
