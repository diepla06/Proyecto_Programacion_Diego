package Tema_3;

public class MyMath {
    public static double squarePerimeter(double lado) {
        return lado * 4;
    }

    public static double squareArea(double lado) {
        return lado * lado;
    }

    public static double rectanglePerimeter(double altura, double base) {
        return (altura + base) * 2;
    }

    public static double rectangleArea(double altura, double base) {
        return base * altura;
    }

    public static double circlePerimeter(double radio) {
        return Math.PI * radio * 2;
    }

    public static double circleArea(double radio) {
        return Math.PI * radio * radio;
    }

    public static boolean primo(int num) {
        boolean primo = true;
        if (num <= 1) {
            return false;
        } else {
            for (int a = 2; a <= Math.sqrt(num); a++) {
                if (num % a == 0) {
                    primo = false;
                    break;
                }
            }
            return primo;
        }
    }

    public static int numeroDigito(int num){
        int cont = 1;
        while (num >= 10) {
            num = num /= 10;
            cont++;
        }
        return cont;
    }
    public static int numerosPares(int num){
        int cont = 0;
        while (num > 0) {
            int digito = num % 10;
            if (digito %2 == 0){
                cont++;
                num /= 10;
            } else {
                num /= 10;
            }
        }
        return cont;
    }

    public static int numerosImpares(int num){
        int cont = 0;
        while (num > 0) {
            int digito = num % 10;
            if (digito %2 == 1){
                cont++;
                num /= 10;
            } else {
                num /= 10;
            }
        }
        return cont;
    }
}
