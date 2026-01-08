package Tema_4.Ejercicio1;

public class MainReloj {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj();
        reloj1.hora = 10;
        reloj1.min = 50;
        reloj1.seg = 20;
        reloj1.formato24 = true;
        reloj1.mostrarHora(10,50,20,true);
        System.out.println(reloj1);
    }
}
