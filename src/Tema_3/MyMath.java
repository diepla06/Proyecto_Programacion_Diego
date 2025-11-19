package Tema_3;

public class MyMath{
    public static double squarePerimeter(double lado){
        return lado * 4;
    }
    public static double squareArea(double lado){
        return lado * lado;
    }
    public static double rectanglePerimeter(double altura, double base){
        return (altura + base) * 2;
    }
    public static double rectangleArea(double altura, double base){
        return base * altura;
    }
    public static double circlePerimeter(double radio){
        return Math.PI*radio*2;
    }
    public static double circleArea(double radio){
        return Math.PI * radio * radio;
    }
}
