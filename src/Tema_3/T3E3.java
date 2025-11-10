package Tema_3;

import java.util.Scanner;

public class T3E3 {

    public static boolean validRadius(double radio){
        if(radio > 0){
            return true;
        }else{
            return false;
        }
    }

    public static double calculateCirclePerimeter(double radio){
        double perimetro = radio * Math.PI;
        return perimetro;
    }

    public static double calculateCircleArea(double radio){
        double area = radio * 2 * Math.PI;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double perimetro;
        double area;

        System.out.println("Dime un radio mayor a 0");
        double radio = sc.nextDouble();

        boolean valido =  validRadius(radio);
        if (valido == false){
            System.out.println("Este numero no es valido");
        }else {
            perimetro = calculateCirclePerimeter(radio);
            area = calculateCircleArea(radio);

            System.out.println("El perimetro es " + perimetro + "\n El area es " + area );
        }



    }

}
